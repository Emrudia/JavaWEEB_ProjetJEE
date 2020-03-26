<%@ page language="java"%>
<%@page
	import="java.util.List,net.model.Jeu,net.dao.JeuDAOImpl,net.web.PartieEnCoursController,java.util.Collections,java.util.ArrayList,net.model.PartieEnCours"%>

<!DOCTYPE html>
<html>
<%ArrayList<String> nomParties = new ArrayList<String>();
for(PartieEnCours partie:PartieEnCoursController.parties){
	nomParties.add(partie.getNomJeu());
}%>

<head>
<meta charset="UTF-8">
<title>Bibliothéque de jeux</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/CSS/style.css">
</head>

<body>

	<jsp:include page="./header_admin.jsp"></jsp:include>


	<div class="container2">
		<h1>LISTE DE JEUX</h1>

		<button id="button1" type="submit" class="addbtn">Ajouter</button>

		<div id="formAjouter" class="container">
			<form action="<%=request.getContextPath()%>/ajouterjeu" method="post">
				<input type="text" id="gamename" placeholder="Nom du jeu"
					name="gamename" required>
				<button id="button2" type="submit" class="addbtn">Ajouter</button>
			</form>
		</div>

		<table>

			<tr>
				<td class="colonnegauche">Nom du jeu</td>
				<td class="colonnedroite">Nombre de joueurs</td>
				<td class="colonnedroite">Supprimer le jeu</td>
			</tr>

			<%
			List<Jeu> listJeux = JeuDAOImpl.tousJeux();
			for (Jeu jeu:listJeux){
			%>

			<tr>
				<td class="colonnegauche"><%=jeu.getNom() %></td>
				<td class="colonnedroite"><%=Collections.frequency(nomParties, jeu.getNom()) %></td>
				<td><a
					href="<%=request.getContextPath()%>/deleteJeuBiblio?id=<%=jeu.getIdJeu()%>">
						<button class="deletebtn" style="width: 90%;">Supprimer</button>
				</a></td>
			</tr>

			<%
			}
			%>

		</table>
	</div>

	<div class="margefooter"></div>

	<jsp:include page="./footer.jsp"></jsp:include>

	<script>
	(function(){var b1, b2, f;
	b1 = document.getElementById("button1");
	b2 = document.getElementById("button2");
	f = document.getElementById("formAjouter");
	f.style.display = 'none';
	
	b1.addEventListener('click',function(e){
		b1.style.display = 'none';
		f.style.display = 'block';
	})
	
	b2.addEventListener('click', function(e){
		b1.style.display = 'block';
		f.style.display = 'none';
	})
	
	})();
	</script>
</body>
</html>