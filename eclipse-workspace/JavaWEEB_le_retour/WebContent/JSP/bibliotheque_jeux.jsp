<%@ page language="java"%>
<%@page import="java.util.List,net.model.Jeu,net.dao.JeuDAOMockImpl"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Bibliothèque de jeux</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

<body>

	<jsp:include page="./header_admin.jsp"></jsp:include>

	<div class="container5">
		<h2>LISTE DE JEUX</h2>
	</div>

	<div class="container2">
		<table>
			<tr>
				<td class="colonnegauche">Nom du jeu</td>
			</tr>
			
			<%
			List<Jeu> listJeux = JeuDAOMockImpl.tousJeux();
			for (Jeu jeu:listJeux){
			%>
			
			<tr>
				<td> <%=jeu.getNom() %> </td>
			</tr>
			
			<%
			}
			%>

		</table>
	</div>

	<div class="margefooter"></div>

	<jsp:include page="./footer.jsp"></jsp:include>

</body>
</html>