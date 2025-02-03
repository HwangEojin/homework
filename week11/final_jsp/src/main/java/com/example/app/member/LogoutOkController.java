package com.example.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;

public class LogoutOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		Result result = new Result();
		request.getSession().invalidate();
		result.setPath("/member/login.me");
		result.setRedirect(true);
//		response.sendRedirect("/member/login.me");
		return result;
	}

}
