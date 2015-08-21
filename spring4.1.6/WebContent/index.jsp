<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index.page</title>

<jsp:include page="/WEB-INF/jsp/common/main.jsp" />

<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.4.js"></script> --%>
<script type="text/javascript">
	$(document).ready(function() {

	});

	function loginCheck() {
		$.ajax({
			url : "/login/loginCheck.do",
			dataType : "json",
			type : "POST",
			data : {
				id : $("#id").val(),
				pwd : $("#pwd").val()
			},
			success : function(result) {
				alert("success: " + result.id);
			},
			error : function(request, error) {
				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		});
	}
	
	
	function testInsertUser() {
		$.ajax({
			url : "/login/joinUser.do",
			dataType : "json",
			type : "POST",
			data : {
				id : $("#id").val(),
				pwd : $("#pwd").val()
			},
			success : function(result) {
				alert("success: " + result.id);
			},
			error : function(request, error) {
				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		});
	}
</script>

</head>
<body>
	<div style="">

		<form action="/index.do" method="post">
			id :<input type="text" id="id" name="id" value=""> 
			pwd :<input type="text" id="pwd" name="pwd" value=""> 
				<input type="button" value="로그인" onClick='javascript:loginCheck();'>
				<input type="button" value="추가" onClick='javascript:testInsertUser();'>
		</form>

		<div style="margin-top: 30px">
			<form action="/board/insertBoard.do">
				<input type="hidden" id="boardRid" name="boardRid"> boardId
				:<input type="text" id=boardId name="boardId"> domainId :<input
					type="text" id="domainId" name="domainId"> <input
					type="submit" value="버튼">
			</form>
		</div>
		<div id="result"></div>
	</div>

</body>
</html>