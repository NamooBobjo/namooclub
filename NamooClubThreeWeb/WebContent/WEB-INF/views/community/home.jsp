<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="./resources/common/css/bootstrap.css" rel="stylesheet">
<link href="./resources/common/css/bootswatch.min.css" rel="stylesheet">
</head>
<body>
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-collapse collapse navbar-responsive-collapse">
				<font color="orange">${loginUser}님 환영합니다~!</font>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="logout.do">로그아웃</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="jumbotron">
					<h1>나무 커뮤니티</h1>
					<br> <a href="./cmcreate.xhtml" class="btn btn-warning btn-lg">커뮤니티 생성</a>

				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-lg-12">

<div id="communityList" class="tab-content">
				<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					<li class="active">
					<a href="#joined" data-toggle="tab">가입 커뮤니티</a></li>
					<li class="">
					<a href="#unjoined" data-toggle="tab">미가입 커뮤니티</a></li>
				</ul>

 		<div class="tab-pane fade active in" id="joined">
				<ul class="list-group">					
					<c:forEach var="community" items="${belongCommunities}" varStatus="list">
						<li class="list-group-item">${community.name}<br />
						${community.description }<br/>
							<button type="button" class="btn btn-default btn-sm">커뮤니티
								탈퇴</button>
						</li>
					</c:forEach>
				</ul>
				</div>
				
				 <div class="tab-pane fade" id="unjoined">	
						<ul class="list-group">				
					<c:forEach var="community" items="${communities}" varStatus="list">
						<li class="list-group-item">${community.name}<br />
						${community.description }<br/>
							<button type="button" class="btn btn-default btn-sm">커뮤니티
								가입</button>
						</li>
					</c:forEach>
				</ul>
				</div>
				</div>
				
				<script src="resources/common/js/jquery-2.1.0.js"></script>
				<script src="resources/common/js/bootstrap.min.js"></script>
				<script src="resources/common/js/bootswatch.js"></script>

			</div>
		</div>
	</div>
</body>
</html>