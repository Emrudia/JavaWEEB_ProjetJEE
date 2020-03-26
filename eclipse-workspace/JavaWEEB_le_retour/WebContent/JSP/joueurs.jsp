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
		<h1>Listes des joueurs</h1>
	</div>

	<div class="container2">
		<table>
			<tr>
				<td class="colonne1">Pseudo de joueurs</td>
				<td class="colonne2">Date d'inscription </td>
				<td class="colonne3">Nombre de parties </td>
				<td class="colonne4">Bannir</td>
			</tr>
		
		<%ArrayList<User> joueurs = AdminDAO.getListeJoueurs();
		for(User joueur : joueurs){
			String pseudo = joueur.getIdentifiant();
		%>
			<tr>  
				<td><a href = "<%=request.getContextPath()%>/JSP/apercu_profil_joueur.jsp?joueur=<%=joueur.getIdentifiant()%>"><%=joueur.getIdentifiant()%></a></td>
				<td><%=joueur.getDateInscription() %></td>
				<td><%=joueur.getNbParties() %> </td>
				<td>
					<%if(!joueur.isBanni()){ %>
						<a href = "<%=request.getContextPath()%>/banJoueur?pseudo=<%=joueur.getIdentifiant()%>">
							<button class="banbtn">Bannir</button>
						</a>
					<%}
					else{%>
						<a href = "<%=request.getContextPath()%>/deBanJoueur?pseudo=<%=joueur.getIdentifiant()%>">
							<button class="debanbtn" >De-Bannir</button>
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