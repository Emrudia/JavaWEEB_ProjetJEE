<%@ page language="java"%>
<%@page import="java.util.List,net.model.Jeu,net.dao.JeuDAOImpl,net.web.PartieEnCoursController,java.util.Collections,java.util.ArrayList,net.model.PartieEnCours"%>

<!DOCTYPE html>
<html>
<%ArrayList<String> nomParties = new ArrayList<String>();
for(PartieEnCours partie:PartieEnCoursController.parties){
	nomParties.add(partie.getNomJeu());
}%>

<head>
<meta charset="UTF-8">
<title>Bibliothèque de jeux</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

<body>

	<jsp:include page="./header_admin.jsp"></jsp:include>


	<div class="container2">
		<h1>LISTE DE JEUX</h1>

		<div class="container">
			<button type="submit" class="addbtn">Ajouter</button>
			<button type="submit" class="deletebtn">Supprimer</button>
		</div>

		<table>
		
			<tr>
				<td class="colonnegauche"> Nom du jeu </td>
				<td class="colonnedroite"> Nombre de joueurs</td>
			</tr>
			
			<%
			List<Jeu> listJeux = JeuDAOImpl.tousJeux();
			for (Jeu jeu:listJeux){
			%>
			
			<tr>
				<td class="colonnegauche"> <%=jeu.getNom() %> </td>
				<td class="colonnedroite"> <%=Collections.frequency(nomParties, jeu.getNom()) %></td>
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