<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<small>
			<p>${sessionScope.usuario}</p>
			<p>${sessionScope.rol}</p>
		</small>

		<h1>   El Resultado es  ${resultadoCalculo}</h1>

</body>
</html>