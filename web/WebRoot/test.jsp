<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<form action="http://nitapi.hiunique.com/jwxt/login" method="post">

	xuehao:<input name="userID" type="text"><br/>
		mima:<input name="userPwd" type="text"><br/>
		yanzhenma:<input type="text" name="checkCode"/><img alt="" src="http://nitapi.hiunique.com/jwxt/login/code">
			<!-- cookie:<input type="text" name="cookie"/> -->
		<input type="submit" value="提交"/>
</form>
<form action="http://nitapi.hiunique.com/call/login" method="post">

	callxuehao:<input name="userID" type="text"><br/>
		mima:<input name="userPwd" type="text"><br/>

		<input type="submit" value="提交"/>
</form>
<form action="http://nitapi.hiunique.com/lib/login" method="post">

	libxuehao:<input name="userID" type="text"><br/>
		mima:<input name="userPwd" type="text"><br/>

		<input type="submit" value="提交"/>
</form>
	<form action="http://nitapi.hiunique.com/lib/history/page"
		method="post">

		page:<input name="page" type="text"><br /> <input
			type="submit" value="提交" />
	</form>
	<form action="http://nitapi.hiunique.com/jwxt/cet" method="post">

	CET46xuehao:<input name="id" type="text"><br/>
		xingming:<input name="name" type="text"><br/>

		<input type="submit" value="提交"/>
</form>
</body>
</html>