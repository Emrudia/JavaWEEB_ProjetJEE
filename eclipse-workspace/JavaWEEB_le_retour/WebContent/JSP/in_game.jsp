<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Dans le jeu <%=request.getSession().getAttribute("partieEnCours")%></title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

<body>

	<jsp:include page="./header_user.jsp"></jsp:include>
	
	<div class="container6">
		<h2>Partie en cours</h2>
		<a href = "<%=request.getContextPath()%>/FinPartie"> <button class = "endGameBtn">Fin de la Partie</button></a>
	</div>
	
	<div class="margefooter"></div>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>