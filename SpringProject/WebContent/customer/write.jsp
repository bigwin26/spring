<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="javax.servlet.http.Cookie" %>
<%
	request.setCharacterEncoding("UTF-8");

	if (request.getMethod().equals("POST")) {

		String status = request.getParameter("status");
		String btn = request.getParameter("btn");

		if (btn.equals("세션저장")) {
			session.setAttribute("st", status);
		} 
		else if (btn.equals("쿠키저장")) {
			Cookie cookie = new Cookie("st",status);
			cookie.setMaxAge(60*24*10);
			response.addCookie(cookie);
			
		} 
		else if (btn.equals("어플리케이션저장")) {
			application.setAttribute("st", status);
		}
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		<label>입력값</label>
			<input name="status" /><br /> 
			<input type="submit" name="btn" value="세션저장" /> 
			<input type="submit" name="btn" value="쿠키저장" /> 
			<input type="submit" name="btn" value="어플리케이션저장" />
	</form>
	<div>
	<a href="view.jsp">상태 저장소의 값 확인하기</a>
	</div>
</body>
</html>