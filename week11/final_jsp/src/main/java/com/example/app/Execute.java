package com.example.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Execute {
//	public void execute(HttpServletRequest request, HttpServletResponse response) 
//			throws IOException, ServerException;

	//void 반환타입을 Result로 변경!!
	public Result execute(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException;
	
	//반환타입 변경 후 joinOkController에서 인터페이스 구현하러가기!
}