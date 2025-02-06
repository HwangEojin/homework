package com.example.app.reply;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.reply.dao.ReplyDAO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class ReplyListOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		
		int boardNumber = Integer.valueOf(request.getParameter("boardNumber"));
		ReplyDAO replyDAO = new ReplyDAO();
		Gson gson = new Gson();
		JsonArray replies = new JsonArray();
		
		replyDAO.selectAll(boardNumber).stream().map(gson::toJson).map(JsonParser::parseString).forEach(replies::add);
		
		System.out.println(replies.toString());
		
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(replies.toString());
		out.close();
		return null;
	}

}
