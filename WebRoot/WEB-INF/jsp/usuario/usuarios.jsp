<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Usuários</title>
	</head>
	<body>
		<div>
			<c:forEach items="${usuarios}" var="usuario">
				${usuario}
			</c:forEach>
		</div>
	</body>
</html>