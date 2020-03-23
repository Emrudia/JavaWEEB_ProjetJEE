<%@ page language="java"%>
<%@page import="java.util.List,net.model.Jeu"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Parties en cours</title>
<link rel="stylesheet" type="text/css" href="../CSS/style.css">
</head>

<body>

	<jsp:include page="./header_admin.jsp"></jsp:include>

	<div class="container2">
		<h1>Partie en cours</h1>
	</div>

	<div class="container2">
		<table>
			<tr>
				<td class="colonne1">Nom du jeu</td>
				<td class="colonne2">Pseudo</td>
				<td class="colonne3">Début de la partie</td>
				<td class="colonne4">Terminer la partie</td>
			</tr>
			<tr>  
				<% %>
				
				<td>A remplir</td>      <!-- Faudra insérer les listes d'éléments -->
				<td>A remplir</td>
				<td>A remplir</td>
				<td>A remplir</td>
			</tr>

		</table>
	</div>
	<div class="margefooter"></div>

	<jsp:include page="./footer.jsp"></jsp:include>

	<script>
		
	</script>
</body>
</html>