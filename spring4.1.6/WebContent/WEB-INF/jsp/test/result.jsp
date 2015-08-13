<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>result.Page</title>
</head>
<body>
	<form action="/index.do" method="post">
		id  :<input type="text" id="id" name="id">
		pwd :<input type="text" id="pwd" name="pwd">
		<input type="submit" value="입력">
	</form>
	<br/>
	<form id="actionForm"  method="post" action="/udTest.do">
		<div>
			<input type="text" id="udVal" name="udVal">
			<input type="submit" id="btn01" name="btn01" value="삭제" >
		</div>
		<div>
			<table border="1">
				<c:forEach var="list" items="${listResult}" varStatus="status">
					<tr>
						<th>${status.index}</th>
						<td>${list.id}</td>
						<td>${list.pwd}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</form>
</body>
</html>