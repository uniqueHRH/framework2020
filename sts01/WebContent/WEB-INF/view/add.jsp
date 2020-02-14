<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<a href="index.bit">HOME</a>
		<a href="list.bit">B B S</a>
		<a href="login.bit">LOGIN</a>
	</nav>
	<h1>입력페이지</h1>
	<form action="insert.bit" method="POST">
		<div>
			<label for="sabun"></label>
			<input type="text" name="sabun" id="sabun"/>
		</div>
		<div>
			<label for="name"></label>
			<input type="text" name="name" id="name"/>
		</div>
		<div>
			<label for="pay"></label>
			<input type="text" name="pay" id="pay"/>
		</div>
		<div>
			<button>입 력</button>
		</div>
	</form>
</body>
</html>