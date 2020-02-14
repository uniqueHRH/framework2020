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
			<div>��Ʈ��������</div>
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
	  <a href="add.bit" class="btn btn-default" role="button">�Է�</a>
	</div>
	<div class="container">
		<div class="row">
		  <div class="col-xs-12 col-md-12"></div>
		  	<div class="page-header">
			  <h2>�Է������� <small>add emp02</small></h2>
			</div>
			

<!-- start form -->
			<form class="form-horizontal" action="insert.bit" method="POST">   <!-- form �±׸� �̿��� �̵��ϹǷ�, Ȯ��� �ʿ�  -->
				<div class="col-sm-offset-2 col-sm-10">${fieldErrors["bean.sabun"] }</div>
				<div class="form-group">
					<label for="sabun" class="col-sm-2 control-label">���</label>
			    	<div class="col-sm-10">
						<input type="text" class="form-control" name="sabun" id="sabun" placeholder="���" value="${bean.sabun }">
					</div>
			  	</div>
				<div class="col-sm-offset-2 col-sm-10">${fieldErrors["bean.name"] }</div>
				<div class="form-group">
					<label for="name" class="col-sm-2 control-label">�̸�</label>
				    <div class="col-sm-10">
			      		<input type="text" class="form-control" name="name" id="name" placeholder="�̸�" value="${bean.name }">
			    	</div>
		  		</div>
		 		 <div class="form-group">
					<label for="pay" class="col-sm-2 control-label">�ݾ�</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="pay" id="pay" placeholder="�ݾ�" value="${bean.pay }">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">   <!-- �տ� �� ĭ�� ���ٴ� �� / offset -->
						<button type="submit" class="btn btn-default">�Է�</button>
						<button type="reset" class="btn btn-default">���</button>
					</div>
				</div>
			</form>
<!-- end form -->
		</div>
	</div>
</body>
</html>