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
				<td class="ligne1">Nom du jeu</td>
				<td class="ligne2">Pseudo</td>
				<td class="ligne3">D�but de la partie</td>
				<td class="ligne4">Terminer la partie</td>
			</tr>
			<tr>  
				<td>A remplir</td>      <!-- Faudra ins�rer les listes d'�l�ments -->
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