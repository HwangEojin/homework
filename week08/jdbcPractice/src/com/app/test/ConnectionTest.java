package com.app.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.app.DAO.DBConnector;
import com.app.DAO.UserDAO;
import com.app.domain.UserDTO;

public class ConnectionTest {
	public static void main(String[] args) {
		//connection test
		/*
		try {
			Connection conn = DBConnector.getConnection();
			System.out.println("연결성공");
			conn.close();
		} catch (SQLException e) {
			System.out.println("연결실패");
		}*/
		
		UserDTO userDTO = new UserDTO();
		UserDAO userDAO = new UserDAO();
		
		userDTO.setUserId("abc");
		userDTO.setUserPw("1234");
		userDTO.setUserName("H");
		userDTO.setUserGender("H");
		userDTO.setUserBirth("20000101");
		
		System.out.println(userDAO.checkId(userDTO.getUserId()));
	}

}
