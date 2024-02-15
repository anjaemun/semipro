<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/save" method="post">
		아이디:<input type="text" name="m_id">
		비밀번호:<input type="password" name="m_pw">
		이름:<input type="text" name="m_name">
		이메일:<input type="text" name="m_email">
		전화번호:<input type="text" name="m_phone">
		<input type="submit" value="등록">
	</form>
</body>
</html>