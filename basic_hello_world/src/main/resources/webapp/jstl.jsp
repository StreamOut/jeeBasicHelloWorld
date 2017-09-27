<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test de JSTL</title>
</head>
<body>
	
	<c:out escapeXml="false" value="<p>Bonjour ${ prenom }</p>" />
	<c:if test = "${ pays > 0 }">
		<img src="drapeau-france-francais-football-flag-150-x-90-cm.jpg" alt="Mountain View" style="width:300px;height:300px;">
	</c:if>
</body>
</html>