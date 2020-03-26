<%@ page language="java"%>
<%@page import = "net.model.PartieEnCours" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Dans le jeu <%=((PartieEnCours)request.getSession().getAttribute("partieEnCours")).getNomJeu()%></title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

<body>

	<jsp:include page="./header_user.jsp"></jsp:include>
	<div class="containerBandeauAccueil">
		<marquee scrollamount="300" scrolldelay="500">10 000 joueurs
			connectés</marquee>
	</div>

	<div class="container6">
		<h2>Partie en cours</h2>
		<a href = "<%=request.getContextPath()%>/FinPartie"> <button class = "endGameBtn">Fin de la Partie</button></a>
	</div>
	
	<div class="margefooter"></div>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>