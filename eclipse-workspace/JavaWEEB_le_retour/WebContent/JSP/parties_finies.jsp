<%@ page language="java"%>
<%@page import="java.util.List,net.model.PartieTerminee,net.dao.PartieTermineeDAO"%>

<!DOCTYPE html>
<html>

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
			<%
			List<PartieTerminee> listGames = PartieTermineeDAO.findByAll();
			for ( PartieTerminee partie:listGames){
			%>
			
			<tr>
				<td> <%=partie.getNomJeu() %> </td>
				<td> <%=partie.getDuree() %> </td>
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