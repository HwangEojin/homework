package com.example.app.board;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.board.dao.BoardDAO;
import com.example.app.dto.BoardListDTO;
import com.example.app.dto.FileDTO;
import com.example.app.file.dao.FileDAO;

public class BoardReadOkController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
      Result result = new Result();
      BoardDAO boardDAO = new BoardDAO();
      FileDAO fileDAO = new FileDAO();
      
      String boardNumStr = request.getParameter("boardNumber");
      if (boardNumStr == null || boardNumStr.trim().isEmpty()) {
         System.out.println("boardNumber 값이 없음");
         
         result.setPath("/app/board/boardList.jsp");   // 게시글 목록 페이지로 리다이렉트
         result.setRedirect(true);
         
         return result;
      }
      
      int boardNum = Integer.parseInt(boardNumStr);
      BoardListDTO boardListDTO = boardDAO.select(boardNum);
      
//      게시글이 존재하지 않을 경우 - 상세페이지를 누름과 동시에 게시글이 삭제될 경우
      if (boardListDTO == null) {
         System.out.println("존재하지 않는 게시글 임");
         
         result.setPath("/app/board/boardList.jsp");   // 게시글 목록 페이지로 리다이렉트
         result.setRedirect(true);
         
         return result;
      }
      
      List<FileDTO> files = fileDAO.select(boardNum);
      boardListDTO.setFiles(files);
      
//      로그인한 사용자 번호 가져오기
      Integer loginMemberNum = (Integer)request.getAttribute("memberNumber");
      System.out.println("로그인한 유저 번호 : " + loginMemberNum);
      
//      현재 게시글의 작성자 번호 저장
      int boardWriterNum = boardListDTO.getMemberNumber();
      System.out.println("현재 게시글 작성자 번호 : " + boardWriterNum);
      
//      로그인한 사용자가 작성자가 아닐 때만 조회수 증가
      if (!Objects.equals(loginMemberNum, boardWriterNum)) {
         boardDAO.updateReadCount(boardNum);
      }
      
      request.setAttribute("board", boardListDTO);
      result.setPath("/app/board/boardRead.jsp");
      result.setRedirect(false);
      
      return result;
   }
}
