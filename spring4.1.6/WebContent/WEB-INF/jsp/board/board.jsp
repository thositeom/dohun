<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form>
		<div>
			<table border="1">
				<c:forEach var="list" items="${listResult}" varStatus="status">
					<tr>
						<th>${status.index}</th>
						<td>${list.boardId}</td>
						<td>${list.domainId}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</form>

</body>
</html>