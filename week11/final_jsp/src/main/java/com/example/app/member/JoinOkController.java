package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.dto.MemberDTO;
import com.example.app.member.dao.MemberDAO;

public class JoinOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		Result result = new Result();

		request.setCharacterEncoding("UTF-8");
		
		//회원정보 세팅
		memberDTO.setMemberId(request.getParameter("memberId"));
		memberDTO.setMemberPassword(request.getParameter("memberPassword"));
		memberDTO.setMemberName(request.getParameter("memberName"));
		memberDTO.setMemberName(request.getParameter("memberPhoneNumber"));
		memberDTO.setMemberAge(Integer.valueOf(request.getParameter("memberAge")));
		memberDTO.setMemberGender(request.getParameter("memberGender"));
		
		memberDAO.join(memberDTO);
		result.setPath(request.getContextPath() + "/member/login.me");
		result.setRedirect(true);
		//		response.sendRedirect(request.getContextPath() + "/member/login.me");
		
		return result;
	}

	
}
