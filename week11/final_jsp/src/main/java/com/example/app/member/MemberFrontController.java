package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Case;

import com.example.app.Result;

public class MemberFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(target);
		Result result = new Result();

		switch (target) {

		case "/member/join.me":
			request.getRequestDispatcher("/app/member/join.jsp").forward(request, response);
			break;
		case "/member/joinOk.me":
			result = new JoinOkController().execute(request, response);
			break;
		case "/member/checkIdOk.me":
			result = new CheckIdOkController().execute(request, response);
			break;
		case "/member/login.me":
			result = new LoginController().execute(request, response);
//			request.getRequestDispatcher("/app/member/login.jsp").forward(request, response);
			break;
		case "/member/loginOk.me":
			result = new LoginOkController().execute(request, response);
			break;
		case "/member/logoutOk.me":
			result = new LogoutOkController().execute(request, response);
			break;

		case "/member/sendSMS.me":
			result = new JoinSMSController().execute(request, response);

		case "/member/verifyCode.me":
			result = new VerifyCodeController().execute(request, response);

		}
		if (result != null) {
			if (result.isRedirect()) {
				response.sendRedirect(result.getPath());
			} else {
				request.getRequestDispatcher(result.getPath()).forward(request, response);
			}
		}
	}
}