<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>try / catch를 이용한 에러 예외처리 페이지</h2>
	
	잘못된 데이터가 입력되었습니다<br><br>
	<%="나이 : "  + request.getParameter("age")+"<br>" %>
	<a href="index.jsp">되돌아가기</a>

</body>
</html>