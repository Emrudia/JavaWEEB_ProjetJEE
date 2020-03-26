<%@ page language="java"%>
<%@page import="java.util.List,net.model.Jeu,java.util.ArrayList,net.model.User,net.dao.AdminDAO"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Joueurs</title>
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
				<td class="colonnegauche">Pseudo de joueurs</td>
				<td>Date d'inscription </td>
				<td>Nombre de parties </td>
				<td class="colonnedroite">Bannir</td>
			</tr>
		
		<%ArrayList<User> joueurs = AdminDAO.getListeJoueurs();
		for(User joueur : joueurs){
			String pseudo = joueur.getIdentifiant();
		%>
			<tr>  
				<td><%=joueur.getIdentifiant() %></td>
				<td><%=joueur.getDateInscription() %></td>
				<td><%=joueur.getNbParties() %> </td>
				      <!-- Faudra insérer les listes d'éléments -->
				<td>
					<%if(!joueur.isBanni()){ %>
						<a href = "<%=request.getContextPath()%>/banJoueur?pseudo=<%=joueur.getIdentifiant()%>">
							<button class="banBtn" style="width=100px">Bannir</button>
						</a>
					<%}
					else{%>
						<a href = "<%=request.getContextPath()%>/deBanJoueur?pseudo=<%=joueur.getIdentifiant()%>">
							<button class="deBanBtn" style="width=100px">De-Bannir</button>
						</a>
					<%} %>
					</td>
			</tr>
		<%} %>

		</table>
	</div>
	<div class="margefooter"></div>

	<jsp:include page="./footer.jsp"></jsp:include>

	<script>
		
	</script>
</body>
</html>