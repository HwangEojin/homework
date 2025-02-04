package com.example.app.board;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.board.dao.BoardDAO;
import com.example.app.dto.BoardDTO;
import com.example.app.dto.FileDTO;
import com.example.app.file.dao.FileDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardWriteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		BoardDAO boardDAO = new BoardDAO();
		BoardDTO boardDTO = new BoardDTO();
		FileDAO fileDAO = new FileDAO();
		FileDTO fileDTO = new FileDTO();

		Result result = new Result();

		// 로그인한 회원 정보 가져오기
		Integer memberNumber = (Integer) request.getSession().getAttribute("memberNumber");

		if (memberNumber == null) {
			System.out.println("오류 : 로그인된 사용자가 없습니다");
			response.sendRedirect("login.jsp");
			return null;
		}
		final String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("upload/");
		final int FILE_SIZE = 1024 * 1024 * 5; // 5mb;
		System.out.println("파일 업로드 경로 : " + UPLOAD_PATH);

		MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_PATH, FILE_SIZE, "utf-8",
				new DefaultFileRenamePolicy());

		// 게시글 정보 설정
		boardDTO.setBoardTitle(multipartRequest.getParameter("boardTitle"));
		boardDTO.setBoardContent(multipartRequest.getParameter("boardContent"));
		boardDTO.setMemberNumber(memberNumber);
		System.out.println("게시글 추가 - boardDTO : " + boardDTO);

		// 게시글 추가
		int boardNumber = boardDAO.insertBoard(boardDTO);
		System.out.println("생성된 게시글 번호 : " + boardNumber);

		// 파일 업로드 처리
		// Enumeration : java.util 패키지에 포함된 인터페이스 , Iterator 비슷한 역할함

		Enumeration<String> fileNames = multipartRequest.getFileNames();
		while (fileNames.hasMoreElements()) {
			String name = (String) fileNames.nextElement();
			String fileSystemName = multipartRequest.getFilesystemName(name);
			String fileOriginalName = multipartRequest.getOriginalFileName(name);

			if (fileSystemName == null) {
				continue;
			}
			fileDTO.setFileSystemName(fileSystemName);
			fileDTO.setFileOriginalName(fileOriginalName);
			fileDTO.setBoardNumber(boardNumber);
			
			System.out.println("업로드된 파일 정보 :" + fileDTO);
			fileDAO.insert(fileDTO);
		}

		result.setPath("/board/boardListOk.bo");
		result.setRedirect(false);
		return result;
	}

}
