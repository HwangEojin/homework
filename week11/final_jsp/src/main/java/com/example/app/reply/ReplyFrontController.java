package com.example.app.reply;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Case;

import com.example.app.Result;
import com.example.app.board.BoardDeleteOkController;
import com.example.app.board.BoardListOkController;
import com.example.app.board.BoardReadOkController;
import com.example.app.board.BoardUpdateController;
import com.example.app.board.BoardUpdateOkController;
import com.example.app.board.BoardWriteController;
import com.example.app.board.BoardWriteOkController;

/**
 * Servlet implementation class ReplyFrontController
 */
//@WebServlet("/ReplyFrontController")
public class ReplyFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReplyFrontController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(target);
		Result result = new Result();

		switch (target) {
		case "/reply/replyWriteOk.re":
			result = new ReplyWriteOkController().execute(request,response);
			break;
		case "/reply/replyListOk.re":
			result = new ReplyListOkController().execute(request,response);
			break;

		}
	}

}
