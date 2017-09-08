<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Object _s = session.getAttribute("st");
    	Object _a = application.getAttribute("st"); 
    
    	String a = "";
    	String c = "";
    	String s = "";
    	
    	Cookie[] cookies = request.getCookies();
    	for(Cookie cookie : cookies){
    		if(cookie.getName().equals("st")){
    			c = cookie.getValue();
    		break;
    		}
    	}
    		
    	if(_s != null)
    		s = _s.toString();
    	if(_a != null)
    		a = _a.toString();
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<ul>
			<li>session:<%=s%></li>
			<li>cookie:<%=c%></li>
			<li>application:<%=a%></li>
		</ul>
	</div>
	<div>
		<a href="write.jsp">값 저장하러 가기</a>
	</div>
</body>
</html>