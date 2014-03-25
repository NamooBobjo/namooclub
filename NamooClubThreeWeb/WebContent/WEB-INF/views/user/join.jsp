<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
<link href="./resources/common/css/bootstrap.css" rel="stylesheet">
<link href="./resources/common/css/bootswatch.min.css" rel="stylesheet">
</head>
<body>
    
	<!-- Main Navigation ========================================================================================== -->
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-responsive-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="./index.html">나무커뮤니티</a>
			</div>
		</div>
	</div>

	<!-- Header ========================================================================================== -->
	<header>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="jumbotron">
					<h1>나무 커뮤니티와 함께!</h1>
					<p>나무 커뮤니티와 함께 특정 취미와 관심사, 특정 그룹 또는 조직에 관한 대화를 시작하세요.</p>
				</div>
			</div>
		</div>
	</div>
	</header>

	<!-- Container ======================================================================================= -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">

				<div class="page-header">
					<h2 id="container">회원 가입하기</h2>
				</div>

				<div class="well">
					<p>회원가입을 위해 아래 내용들을 작성해 주세요.</p>
					<form class="form-horizontal" action="regist.do">
						<fieldset>
							<div class="form-group">
								<label class="col-lg-2 control-label" name = "name">이름</label>

								<div class="col-lg-10">
									<input type="text" class="form-control" placeholder="이름">
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">이메일</label>

								<div class="col-lg-10">
									<input type="text" class="form-control" placeholder="이메일" name = "email">
									<span class="help-block">입력하신 이메일은 회원ID로 사용됩니다.</span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">비밀번호</label>

								<div class="col-lg-10">
									<input type="password" class="form-control" placeholder="비밀번호" name = "password">
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">비밀번호 확인</label>

								<div class="col-lg-10">
									<input type="password" class="form-control"
										placeholder="비밀번호 확인">
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">생년월일</label>

								<div class="col-lg-10">
									<input type="text" class="form-control" placeholder="생년월일">
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">성별</label>

								<div class="col-lg-10">
									<div class="radio">
										<label> <input type="radio" name="optionsRadios"
											id="optionsRadios1" value="option1" checked=""> 남자
										</label>
									</div>
									<div class="radio">
										<label> <input type="radio" name="optionsRadios"
											id="optionsRadios2" value="option2"> 여자
										</label>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">전화번호</label>

								<div class="col-lg-10">
									<input type="text" class="form-control" placeholder="전화번호">
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">우편번호</label>

								<div class="col-lg-10">
									<input type="text" class="form-control" placeholder="우편번호">
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">주소</label>

								<div class="col-lg-10">
									<input type="text" class="form-control" placeholder="주소">
								</div>
							</div>
							
							<div class="form-group">
								<div class="col-lg-10 col-lg-offset-2">
									<button type="submit" class="btn btn-primary">확인</button>
									<button class="btn btn-default" onclick ="cancelPage(); return false;">취소</button>
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
					<li><a href="#">RSS</a></li>
					<li><a href="#">이용약관</a></li>
					<li><a href="#">도움말</a></li>
					<li><a href="#">회원탈퇴</a></li>
				</ul>
				<p>© NamooSori 2014.</p>
			</div>
		</div>
		</footer>
	</div>
	<script>
	function cancelPage() { 
	    location.href = "main.xhtml";
	    return false;
	}
	</script>
	<script src="resources/common/js/jquery-2.1.0.js"></script>
	<script src="resources/common/js/bootstrap.min.js"></script>
	<script src="resources/common/js/bootswatch.js"></script>

</body>
</html>