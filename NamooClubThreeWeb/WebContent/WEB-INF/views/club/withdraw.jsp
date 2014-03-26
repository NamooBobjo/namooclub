<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>클럽탈퇴</title>
	<link href="${ctx}/resources/common/css/bootstrap.css" rel="stylesheet">
 	<link href="${ctx}/resources/common/css/bootswatch.min.css" rel="stylesheet">
</head>
<body>

<div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
   
        <div class="navbar-collapse collapse navbar-responsive-collapse">
         
            <ul class="nav navbar-nav navbar-right">
                <li><a href="../login.html">로그아웃</a></li>
              
            </ul>
        </div>
    </div>
</div>
<header>
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="jumbotron">
                    <h1>우리동네 축구클럽</h1>
                    <p>우리동네 축구클럽은 해뜨자마자 바로 시작해요.</p>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-12 col-lg-12">
                <ol class="breadcrumb">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">건강커뮤니티</a></li>
                    <li class="active">우리동네 축구클럽</li>
                </ol>
            </div>
        </div>
    </div>
</header>

<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <!-- ★★★ Contents -->
            <div class="page-header">
                <h2 id="container">클럽탈퇴하기</h2>
            </div>
 			<p>정말로 클럽을 탈퇴하시겠습니까?</p>
            <div class="well">
                <form class="form-horizontal" action="./index.html">
                    <fieldset>
                        <div class="form-group">
                            <label class="col-lg-2 control-label">클럽명</label>

                            <div class="col-lg-10">
                                <input type="text" class="form-control" placeholder="커뮤니티명">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-lg-10 col-lg-offset-2">
                                <button type="submit" class="btn btn-primary" onclick="location.href='clList.xhtml'">탈퇴</button>
                                <button class="btn btn-default" onclick="history.back();">취소</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>


<!-- Footer ========================================================================================== -->
    <footer>
        <div class="row">
            <div class="col-lg-12">
                <ul class="list-unstyled">
                    <li class="pull-right"><a href="#top">위로 이동</a></li>
                    <li><a href="#">커뮤니티 홈</a></li>
                    <li><a href="#">회원탈퇴</a></li>
                </ul>
                <p>© NamooSori 2014.</p>
            </div>
        </div>
    </footer>
</div>


<script src="${ctx}/resources/common/js/jquery-2.1.0.js"></script>
<script src="${ctx}/resources/common/js/bootstrap.min.js"></script>
<script src="${ctx}/resources/common/js/bootswatch.js"></script>

</body>
</html>