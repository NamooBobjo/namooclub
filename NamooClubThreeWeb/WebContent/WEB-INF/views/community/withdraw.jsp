<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file = "/WEB-INF/views/common/common.jsp"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-lg-12">
<div class="page-header">
<h2 id="container">커뮤니티 탈퇴하기</h2>
</div>
<div class="well">
<p>정말 삭제하시겠습니까?</p>
<form class="form-horizontal" action="${ctx}/cmwithdraw.do?cmId=${cmId}" method="post">
<fieldset>
<div class="form-group">
<div class="col-lg-10">
Community Name : <input type="text" class="form-control"  name="cmName" value = "${cmName}" disabled>
</div>
</div>
<div class="form-group">
<div class="col-lg-10">
</div>
</div>
<div class="form-group">
<div class="col-lg-10 col-lg-offset-2">
<button type="submit" class="btn btn-primary">확인</button>
</div>
</div>
</fieldset>
</form>
</div>
</div>
</div>
</div>
</body>
</html>