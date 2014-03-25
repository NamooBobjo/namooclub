<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../resources/common/css/bootstrap.css" rel="stylesheet">
<link href="../resources/common/css/bootswatch.min.css" rel="stylesheet">
</head>
<body>
<div class="navbar navbar-default navbar-fixed-top">
<div class="container">
<div class="navbar-collapse collapse navbar-responsive-collapse">
<font color="red">(~)님 환영합니다~!</font>
<ul class="nav navbar-nav navbar-right">
<li><a href="../login.html">로그아웃</a></li>
</ul>
</div>
</div>
</div>

<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <div class="jumbotron">
                <h1>나무 커뮤니티</h1>
                <p><a href="./open.html" class="btn btn-warning btn-lg">커뮤니티 생성</a></p>
                <p><a href="./open.html" class="btn btn-warning btn-lg">미가입 커뮤니티 리스트</a></p>
                <p><a href="./open.html" class="btn btn-warning btn-lg">커뮤니티 탈퇴</a></p>
            </div>
        </div>
    </div>
</div>

<ul class="list-group">
<li>커뮤니티이름</li>
<c:forEach var="community" items="${communities}" varStatus="list">
<li class="list-group-item">${community.name}<br />
<button type="button" class="btn btn-default btn-sm">커뮤니티 상세</button>
</li>
</c:forEach>
</ul>
</body>
</html>