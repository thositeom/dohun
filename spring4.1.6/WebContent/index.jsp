<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index.page</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-2.1.4.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		
	});

	function loginCheck() {
		$.ajax({
			url: "/login/loginCheck.do",
			dataType: "json",
			type: "POST",
			data:{
				id: $("#id").val(),
				pwd: $("#pwd").val()
			},
			success: function(result){
				alert("success: " + result.id);
			},
			error: function(request,error){
		        alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
		    }
		});
	}
	
</script>

</head>
<body>
	<form action="/index.do" method="post">
		id :<input type="text" id="id" name="id" value=""> 
		pwd :<input type="text" id="pwd" name="pwd" value=""> 
		<input type="button" value="로그인" onClick='javascript:loginCheck();'>
	</form>

	<div style="margin-top: 30px">
		<form action="/board/insertBoard.do">
			<input type="hidden" id="boardRid" name="boardRid">
			boardId :<input type="text" id=boardId name="boardId">  					
			domainId :<input type="text" id="domainId" name="domainId">
			<input type="submit" value="버튼">
		</form>
	</div>
 	<div id="result"></div>

</body>
</html>