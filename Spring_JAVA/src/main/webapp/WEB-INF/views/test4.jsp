<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test4</title>
</head>
<body>
	<h1>test4</h1>
	<!-- ModelAndView객체로 셋팅시 HttpServletRequest객체에 담겨서 jsp로 전달 -->
	<h3>data1 : ${requestScope.data1 }</h3>
	<h3>data2 : ${requestScope.data2 }</h3>
</body>
</html>




