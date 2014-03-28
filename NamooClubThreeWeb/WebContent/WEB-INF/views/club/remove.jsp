<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file = "/WEB-INF/views/common/common.jsp"  %>
</head>
<body>
<form class="form-horizontal" action="clremove.do?clId=${clId}&cmId=${cmId}" method="post">
<div class="container">
    <!-- header -->
    <div class="info-header">
        <h2 class="info-heading">클럽 삭제</h2>
    </div>

    <!-- body -->
    <div class="info-body">

        <p>${clName} 클럽을 삭제하시겠습니까?</p>

        <div class="row info-btn">
            <input class="btn btn-large btn-default" type="submit" value="삭제" />
            <input class="btn btn-large btn-default" type="button" onclick = "cancelPage(); return false;" value="취소" />
        </div>
    </div>
</div>
</form>
	<script>
	function cancelPage() { 
	   window.history.back();
	    return false;
	}
	</script>
</body>
</html>