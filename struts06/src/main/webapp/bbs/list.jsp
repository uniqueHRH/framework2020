<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>

<!-- Latest compiled and minified JavaScript -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="home.bit">
			<div>비트교육센터</div>
	      </a>
	    </div>   <!-- end navbar header -->
	    <p class="navbar-text navbar-right">
		    <a href="home.bit" class="navbar-link">[HOME]</a>
		    <a href="intro.bit" class="navbar-link">[INTRO]</a>
		    <a href="bbs/list.bit" class="navbar-link">[B B S]</a>
		    <a href="#" class="navbar-link">[LOGIN]</a>
	   </p>
	  </div>   <!-- end container fluid -->
	</nav>
	<div class="jumbotron">
	  <h1>LIST page</h1>
	  <a href="add.bit" class="btn btn-default" role="button">입력</a>
	</div>
	<div class="container">
		<div class="row">
		  <div class="col-xs-12 col-md-12"></div>
		  	<div class="page-header">
			  <h2>LIST <small>emp02 content</small></h2>
			</div>
			<table class="table table-hover">   <!-- tbody에만 적용된다, theay/tbody 안하면, th 에도 hover 적용된다 -->
				<thead>
					<tr>
						<th>사번</th>
						<th>이름</th>
						<th>날짜</th>
						<th>금액</th>
					</tr>
				<thead>
				<tbody>
					<c:forEach items="${list }" var="bean">
						<tr>
							<td><a href="detail.bit?bean.sabun=${bean.sabun }">${bean.sabun }</a></td>
							<td><a href="detail.bit?bean.sabun=${bean.sabun }">${bean.name }</a></td>
							<td><a href="detail.bit?bean.sabun=${bean.sabun }">${bean.nalja }</a></td>
							<td><a href="detail.bit?bean.sabun=${bean.sabun }">${bean.pay }</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>