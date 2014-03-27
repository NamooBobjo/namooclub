<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>클럽</title>
<%@ include file = "/WEB-INF/views/common/common.jsp"  %>
</head>
<body>

<div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
   
        <div class="navbar-collapse collapse navbar-responsive-collapse">
         
            <ul class="nav navbar-nav navbar-right">
                <li><a href="logout.do">로그아웃</a></li>
              
            </ul>
        </div>
    </div>
</div>
<!-- Container ======================================================================================= -->
<header>
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="jumbotron">
                    <h1>${cmName}</h1>
                    <p>${cmName}에는 다양한 클럽이 있습니다.</p>
                    <p><a class="btn btn-warning btn-lg" onclick="location.href='view/club/create.xhtml'">클럽 개설</a></p>
                </div>
            </div>
        </div>
    </div>
</header>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <!-- ★★★ Contents -->
            
            <div class="page-header">
                <h2 id="container">가입된 클럽</h2>
            </div>
				<ul class="list-group">
                <li class="list-group-item">
                    <span class="badge">2011.03.21</span>
                    <h4><span class="label label-primary">축구</span>&nbsp;<a href="../team/index.html">우리동네 축구클럽 (팀:21, 회원:59)</a></h4>
                    <p>전국민 건강 프로젝트를 진행 중인 클럽입니다. 각종 구기종목 및 헬스 관련 클럽이 있습니다.전국민 건강 프로젝트를 진행 중인 클럽입니다. 각종 구기종목 및 헬스 관련 클럽이 있습니다.</p>
                    <button type="button" class="btn btn-default btn-sm" onclick="location.href='clWithdraw.xhtml'">멤버탈퇴 신청하기</button>
                </li>
			<div class="page-header">
                <h2 id="container">미가입된 클럽</h2>
            </div> 
            <li class="list-group-item">
                    <span class="badge">2011.03.21</span>
                    <h4><span class="label label-primary">MTB</span>&nbsp;백두에서 한라까지 (팀:21, 회원:59)</h4>
                    <p>전국민 건강 프로젝트를 진행 중인 클럽입니다. 각종 구기종목 및 헬스 관련 클럽이 있습니다.</p>
                    <button type="button" class="btn btn-default btn-sm" onclick="location.href='clJoin.xhtml'">멤버 가입하기</button>
                </li>
            </ul>

        </div>
    </div>

<!-- Footer ========================================================================================== -->
    <footer>
        <div class="row">
            <div class="col-lg-12">
                <ul class="list-unstyled">
                    <li class="pull-right"><a href="#top">위로 이동</a></li>
                    <li><a href="cmList.xhtml">커뮤니티 홈</a></li>
                    <li><a href="#">회원탈퇴</a></li>
                </ul>
                <p>© NamooSori 2014.</p>
            </div>
        </div>
    </footer>
</div>

</body>
</html>