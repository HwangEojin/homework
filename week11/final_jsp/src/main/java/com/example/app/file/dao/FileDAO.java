package com.example.app.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.app.dto.FileDTO;
import com.mybatis.config.MyBatisConfig;

public class FileDAO {
   SqlSession sqlSession;
   
   public FileDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
   public void insert(FileDTO fileDTO) {
      System.out.println("파일 DAO - 파일저장 fileDTO : " + fileDTO);
      
      try {
         int result = sqlSession.insert("file.insert", fileDTO);
         System.out.println("파일 저장완료 - db저장된 행의 개수 : " + result);
         
         //db에 파일이 제대로 저장되었는지 확인
         List<FileDTO> uploadFile = select(fileDTO.getBoardNumber());
         System.out.println("DB에서 가져온 파일 : " + uploadFile);
      } catch (Exception e) {
         // TODO Auto-generated catch block
         System.out.println("파일 저장이 실패되었습니다. " + e.getMessage());
         e.printStackTrace();
      }
      
   }
   
   public List<FileDTO> select(int boardNumber){
      return sqlSession.selectList("file.select", boardNumber);
   }

   public void delete(int boardNumber) {
	   sqlSession.delete("file.delete", boardNumber);
   }
   
}









