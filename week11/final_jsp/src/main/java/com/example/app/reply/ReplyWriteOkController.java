package com.example.app.reply;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.dto.ReplyDTO;
import com.example.app.reply.dao.ReplyDAO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ReplyWriteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		
		HttpSession session = request.getSession();
		ReplyDTO replyDTO = new ReplyDTO();
		ReplyDAO replyDAO = new ReplyDAO();
		System.out.println("세션에 저장된 멤버" + session.getAttribute("memberNumber"));
		
		
		request.setCharacterEncoding("utf-8");
		
		//json 응답
		Gson gson = new Gson();
//		Map<String,Object> responseMap = new HashMap<>();
		
		//Json 데이터 읽기
		BufferedReader reader = request.getReader();
		JsonObject jsonObject = JsonParser.parseString(reader.lines().collect(Collectors.joining())).getAsJsonObject();
		
		//필수 파라미터 확인
		if(!jsonObject.has("boardNumber") || !jsonObject.has("memberNumber") || !jsonObject.has("repltContent")) {
			response.setContentType("application/json; charset=utf-8");
			response.getWriter().write(gson.toJson(Map.of("status","fail","message","필수 데이터가 없습니다.")));
			return null;
		}
		
		//DTO 설정
		
		replyDTO.setBoardNumber(jsonObject.get("boardNumber").getAsInt());
		replyDTO.setMemberNumber(jsonObject.get("MemberNumber").getAsInt());
		replyDTO.setReplyContent(jsonObject.get("replyContent").getAsString());
		
		System.out.println("replyDTO 확인 : " + replyDTO);
		
		//DB 저장
		replyDAO.insert(replyDTO);
		System.out.println("댓글 작성 완료");
		
		//Json 응답
		response.setContentType("application/json; charset=utf-8");
		response.getWriter().write(gson.toJson(Map.of("status","success","message","댓글이 성공적으로 저장되었습니다.")));
		
		
		return null;
	}

}
