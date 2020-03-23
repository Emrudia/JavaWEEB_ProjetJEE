<%@ page language="java"%>
<%@page import="java.util.List,net.model.Jeu"%>

<%

List<PartieTerminee> listGame = (List<PartieTerminee>)request.getAttribute("listGame");

%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Parties finies</title>
<link rel="stylesheet" type="text/css" href="../CSS/style.css">
</head>

<body>

	<jsp:include page="./header_admin.jsp"></jsp:include>

	<div class="container2">
		<h1>Partie termin�es</h1>
	</div>

	<div class="container2">
		<table>
			<tr>
				<td class="colonnegauche">Nom du jeu</td>
				<td class="colonnedroite">Dur�e de la partie</td>
			</tr>

			<%

for (PartieTerminee partieTerminee:listGame) {

String name = partieTerminee.getNom();

String duree = partieTerminee.getDuree();

%>
			<tr>
				<td><%=name %></td>
				<td><%=duree %></td>
			</tr><%} %>

		</table>
	</div>
	<div class="margefooter"></div>

	<jsp:include page="./footer.jsp"></jsp:include>

	<script>
		
	</script>
</body>
</html>