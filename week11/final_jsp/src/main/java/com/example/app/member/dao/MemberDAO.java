package com.example.app.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.MemberDTO;
import com.mybatis.config.MyBatisConfig;

public class MemberDAO {
	SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void join(MemberDTO memberDTO) {
//		insert의 반환타입은 int이다 정상 처리가 되었다면 1을 반환함
//		쿼리에 영향 받은 행의 수를 반환함
		sqlSession.insert("member.join", memberDTO);
	}
	
	public boolean checkId(String memberId) {
		return (Integer)sqlSession.selectOne("member.checkId", memberId) < 1;
	}
	
	
	public int login(MemberDTO memberDTO) {
		Integer memberNumber = sqlSession.selectOne("member.login", memberDTO);
		
		return memberNumber == null ? -1 : memberNumber;
	}
	
	public String getMemberId(int memberNumber) {
		return sqlSession.selectOne("member.getMemberId", memberNumber);
	}
}
