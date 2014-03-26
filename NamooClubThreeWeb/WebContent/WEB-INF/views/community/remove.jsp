<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../resources/common/css/bootstrap.css" rel="stylesheet">
<link href="../resources/common/css/bootswatch.min.css" rel="stylesheet">
<link href="${ctx}/resources/css/remove.css" rel="stylesheet">
</head>
<body>
<form class="form-horizontal" action="${ctx}/remove.do" method="post">
<div class="container">
    <!-- header -->
    <div class="info-header">
        <h2 class="info-heading">커뮤니티를 삭제</h2>
    </div>

    <!-- body -->
    <div class="info-body">

        <p>커뮤니티를 삭제하시겠습니까?</p>

        <div class="row info-btn">
            <input class="btn btn-large btn-default" type="submit" value="삭제" />
        </div>
    </div>
</div>
</form>
</body>
</html>