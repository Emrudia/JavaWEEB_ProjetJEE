<%@ page language="java"%>
<%@page import="java.util.List,net.model.Jeu"%>

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
				<td class="colonnegauche">Pseudo de joueurs</td>
				<td class="colonnedroite">Bannir</td>
			</tr>
			<tr>  
				<td>A remplir</td>      <!-- Faudra ins�rer les listes d'�l�ments -->
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