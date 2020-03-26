<%@ page language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List,net.model.PartieTerminee"%>

<!DOCTYPE html>
<html>

<%

List<PartieTerminee> listGame = (List<PartieTerminee>)request.getAttribute("listGames");

%>

<head>
<meta charset="UTF-8">
<title>Parties finies</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

<body>

	<jsp:include page="./header_admin.jsp"></jsp:include>

	<div class="container2">
		<h1>Partie terminées</h1>
	</div>

	<div class="container2">
		<table>
			<tr>
				<td class="colonnegauche">Nom du jeu</td>
				<td class="colonnedroite">Durée de la partie</td>
			</tr>
			
			<c:forEach var="partie" items="${listGame}">
				<tr>
					<td><c:out value="${name}" /></td>
					<td><c:out value="${duree}" /></td>
				</tr>
			</c:forEach>

		</table>
	</div>
	<div class="margefooter"></div>

	<jsp:include page="./footer.jsp"></jsp:include>

</body>
</html>