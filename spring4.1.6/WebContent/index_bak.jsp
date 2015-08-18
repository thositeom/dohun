<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index.page</title>
</head>
<body>
	<form action="/index.do" method="post">
		id  :<input type="text" id="id" name="id">
		pwd :<input type="text" id="pwd" name="pwd">
		<input type="submit" value="버튼">
	</form>
	<div id="resultView" ></div>
	
	<div style="margin-top: 30px">
		<form action="/board/insertBoard.do">
			<input type="hidden" id="boardRid" name="boardRid">
			boardId :<input type="text" id=boardId name="boardId">  					
			domainId :<input type="text" id="domainId" name="domainId">
			<input type="submit" value="버튼">
		</form>
	</div>
	
	
</body>
</html>