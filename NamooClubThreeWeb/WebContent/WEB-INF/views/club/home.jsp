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
                    <p>${cmName} 클럽에는 다양한 즐거움이 있습니다.</p>
                    <p><a class="btn btn-warning btn-lg" onclick="location.href='club/create.xhtml?cmId=${cmId}'">클럽 개설</a></p>
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
				 	<c:forEach var="managedclub" items="${managedclubs}" varStatus="list">
						<li class="list-group-item">
						<span class="label label-warning">관리</span>
						<h4>${managedclub.name}</h4>	 <span class="badge"><a  href = 'cmRemove.xhtml?cmId=${managed.id}'><font color = "black">삭제</font></a></span>
						<p>${managedclub.description }</p>						
							<button type="button" class="btn btn-default btn-sm" onclick = "location.href='clList.xhtml?cmId=${managed.id}'">상세</button>
						</li>
					</c:forEach>		
				
             	<c:forEach var="belongclub" items="${belongclubs}" varStatus="list">
						<li class="list-group-item">
						<h4>${belongclub.name}</h4>	 
						<p>${belongclub.description }</p>						
							<button type="button" class="btn btn-default btn-sm" onclick = "location.href='clList.xhtml?cmId=${belongclub.id}'">상세</button>
							<button type="button" class="btn btn-default btn-sm" onclick = "location.href='clList.xhtml?cmId=${belongclub.id}'">탈퇴</button>
						</li>
					</c:forEach>		
			<div class="page-header">
                <h2 id="container">미가입된 클럽</h2>
            </div> 
              	<c:forEach var="club" items="${clubs}" varStatus="list">
						<li class="list-group-item">
						
						<h4>${club.name}</h4>	 
						<p>${club.description }</p>						
							<button type="button" class="btn btn-default btn-sm" onclick = "location.href='clList.xhtml?cmId=${club.id}'">가입</button>
						</li>
					</c:forEach>		
                
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