<%@ page language="java"%>
<%@page import="java.util.List,net.model.PartieTerminee,net.dao.PartieTermineeDAO,java.util.Collections,java.time.LocalDateTime,java.time.format.DateTimeFormatter"%>
<%DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); %>
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
		<h1>Partie termin�es</h1>
	</div>

	<div class="container2">
		<table>
		
			<tr>
				<td class="colonne2">Nom du jeu</td>
				<td class="colonne2">Nom d'utilisateur</td>
				<td class="colonne3">D�but</td>
				<td class="colonne3">Fin</td>
				<td class="colonne3">Dur�e de la partie</td>
			</tr>
		
			<%
			List<PartieTerminee> listGames = PartieTermineeDAO.findByAll();
			Collections.reverse(listGames);
			for ( PartieTerminee partie:listGames){
			%>
			
			<tr>
				<td> <%=partie.getNomJeu() %> </td>
				<td> <%=partie.getNomUtilisateur() %> </td>
				<td> <%=partie.getDateDebut().format(formatter) %> </td>
				<td> <%=partie.getDateFin().format(formatter) %> </td>
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