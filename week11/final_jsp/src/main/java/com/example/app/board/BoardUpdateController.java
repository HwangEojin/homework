package com.example.app.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Execute;
import com.example.app.Result;
import com.example.app.board.dao.BoardDAO;

public class BoardUpdateController implements Execute{

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
      
      int boardNumber = Integer.valueOf(request.getParameter("boardNumber"));
      BoardDAO boardDAO = new BoardDAO();
      Result result = new Result();
      
      request.setAttribute("board", boardDAO.select(boardNumber));
      
      result.setPath("/app/board/boardUpdate.jsp");
      result.setRedirect(false);
         
      return result;
   }
   
   

}