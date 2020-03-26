<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Page accueil</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

<body>

	<jsp:include page="./header.jsp"></jsp:include>

	<div class="containerBandeauAccueil">
		<marquee scrollamount="300" scrolldelay="500">10 000 joueurs
			connectés</marquee>
	</div>
	
	<div class="alert alert-fail center" role="alert">
			<h1 align = middle > <font size="+2">${NOTIFICATION2}</font></h1>
		</div>	

	<div class="container2">
		<img src="<%=request.getContextPath()%>/image/nouveaute_bleu.png"
			style="border-radius: 110px 0px 114px 0px;" />
	</div>
	
	<div class="alert alert-success center" role="alert">
			<h1 > <font size="+2">${NOTIFICATION}</font></h1>
	</div>

	<div class="container6">
		<h2>Bienvenue !</h2>
		<p>Bienvenue sur le site JavaWEEB, le meilleur site de jeux en
			ligne. Ici tu pourras trouver tout type de jeux pour plaire aux
			petits mais aussi aux grands ! Tu pourras également te créer un
			compte afin de sauvegarder tes meilleurs scores et renseigner tes
			meilleurs jeux. Nous espérons que notre sélection des derniers jeux te plaira. 
		</p>
		<p>Bon divertissement !</p>
	</div>
	<div class="margefooter"></div>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>