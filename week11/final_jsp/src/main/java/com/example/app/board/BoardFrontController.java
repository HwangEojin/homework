package com.example.app.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Result;

/**
 * Servlet implementation class BoardFrontController
 */

public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BoardFrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
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
		case "/board/boardListOk.bo":
			System.out.println("리스트=========");
			// 임시로 이동 처리
//			request.getRequestDispatcher("/app/board/boardList.jsp").forward(request, response);
			result = new BoardListOkController().execute(request, response);
			System.out.println(result);
			break;
			
		case "/board/boardReadOk.bo":
			result = new BoardReadOkController().execute(request, response);
			break;
		
		case "/board/boardWrite.bo":
			result = new BoardWriteController().execute(request, response);
//			request.getRequestDispatcher("/app/board/boardWrite.jsp").forward(request, response);
			break;
		case "/board/boardWriteOk.bo":
			result = new BoardWriteOkController().execute(request, response);

			break;
//		case "/board/boardDeleteOk.bo":
//			result = new BoardDeleteOkController().execute(request, response);
//			break;
//
//		case "/board/boardUpdate.bo":
//			result = new BoardUpdateController().execute(request, response);
//			break;
//		case "/board/boardUpdateOk.bo":
//			result = new BoardUpdateOkController().execute(request, response);
//			break;
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
