package com.app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

	// field

	public Connection connection;
	public PreparedStatement preparedStatement; // 동적으로 sql 처리, 인자값 전달 가능
	public ResultSet resultSet; // 쿼리의 결과를 Resultset 타입으로 저장

	
	// 아이디 중복검사
	public boolean checkId(String userId) {
		String query = "select user_number from tbl_user where user_id = ?";

		try {
			// DBConnector 에서 connection 객체를 가져옴
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);

			// .setString( ? 순서, 인자값 )
			preparedStatement.setString(1, userId);

			// 쿼리의 결과(table)를 저장
			// Iterator와 동일한 방식으로 접근
			resultSet = preparedStatement.executeQuery();

			// next() : 현재 커서 다음 데이터가 존재하는지 여부를 true, false로 반환
			if (resultSet.next()) {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("checkId() method sql Error");
			;
		} finally {
			// 오류 여부와 관계없이 반드시 jdbc 객체를 닫는다.
			// 닫는 순서는 여는 순서의 역순
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("JDBC Object closing Error");
			}

		}

		return true;

	}

}
