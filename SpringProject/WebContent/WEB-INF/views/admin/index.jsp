<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/reset.css" type="text/css" rel="stylesheet" />
<link href="../css/style.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<!--  --------------헤더부분--------------- -->
	<jsp:include page="../inc/header.jsp" />

	<!--  --------------비쥬얼부분--------------- -->
	<jsp:include page="inc/visual.jsp" />



	<div id="body" class="clearfix">
		<div class="content-container">
			<!--  --------------어사이드부분--------------- -->
			<jsp:include page="inc/aside.jsp" />
			<main id="main">
			
관리자 페이지
			</main>
</div>
			</div>
			<!--  --------------푸터부분--------------- -->
			<jsp:include page="../inc/footer.jsp" />
			
</body>
</html>