

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>
	<h2>회원 목록</h2>
	<hr>
	<table border="1">
		<tr>
			<th>번호</th><th>이름</th><th>회사</th><th>이메일</th>
		</tr>
		<c:forEach var="m" varStatus="i" items="${memberlist}">
			<tr>
				<td>${m.id}</td><td>${m.username}</td>
				<td>${m.company}</td><td>${m.email}</td>
			</tr>
		</c:forEach>
	</table>

	<hr>
	<h2>회원 추가</h2>
	<hr>
	<form method="post" action="/Javaserver2024.1/mcontroller?action=insert">
		<label>username</label> <input type="text" name="username"><br>
		<label>조직</label> <input type="text" name="company"><br>
		<label>생일</label> <input type="text" name="birthday"><br>
		<label>이메일</label> <input type="text" name="email"><br>
		<button type="submit">등록</button>
	</form>


</body>
</html>