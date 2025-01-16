<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1><%=request.getAttribute("name") %>님 환영합니다</h1>
   <h1><%=request.getAttribute("age") %>살 입니다</h1>
   <h1>성별 : <%=request.getAttribute("gender") %></h1>
   <h1>취미 : <%
      String[] hobbies=(String[]) request.getAttribute("hobbies");
      if(hobbies != null){
         for(String hobby : hobbies){
            out.print(hobby + " ");
         }
      }else{
         out.print("취미가 없습니다");
      }
   %></h1>
</body>
</html>