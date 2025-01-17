package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.dto.MemberDTO;
import com.example.app.member.dao.MemberDAO;

public class JoinOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDAO memberDAO = new MemberDAO(); 
		MemberDTO memberDTO = new MemberDTO();
		Result result = new Result(); //++++ Result 클래스 만든 후 추가
		
		System.out.println(memberDTO);
		memberDTO.setMemberId(request.getParameter("memberId"));
		memberDTO.setMemberPassword(request.getParameter("memberPassword"));
		memberDTO.setMemberName(request.getParameter("memberName"));
		memberDTO.setMemberAge(Integer.valueOf(request.getParameter("memberAge")));
		memberDTO.setMemberGender(request.getParameter("memberGender"));
		
		memberDAO.join(memberDTO); 
		
		result.setRedirect(true); //++++ Result 객체 추가 후 작성
		result.setPath(request.getContextPath()); //++++ Result 객체 추가 후 작성

		return result; //+++ 반환값 수정 후 프컨으로 이동
	}
	
	// 프론트 컨트롤러에 작성한 코드를 처리할건데
	// 일반 클래스는 request, response가 없다
	// 메소드를 만들어 매개변수로 전달받아 처리한다

//	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		MemberDAO memberDAO = new MemberDAO(); //+++ DAO 클래스의 메소드 실행하기 위한 객체 생성
//		MemberDTO memberDTO = new MemberDTO();
//		System.out.println(memberDTO);
//		memberDTO.setMemberId(request.getParameter("memberId"));
//		memberDTO.setMemberPassword(request.getParameter("memberPassword"));
//		memberDTO.setMemberName(request.getParameter("memberName"));
//		memberDTO.setMemberAge(Integer.valueOf(request.getParameter("memberAge")));
//		// valueOf() 문자열을 Integer타입으로 바꿔준다.
//		// parseInt()와의 차이는 parseInt()는 문자열이 숫자가 아닐 경우 numberFormatException이 발생하지만
//		// valueOf()는 null을 반환한다(즉, 예외발생안함)
//		memberDTO.setMemberGender(request.getParameter("memberGender"));
//		
//		memberDAO.join(memberDTO); //+++
//	}

}
