
<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">

<title>Jeux</title>
<link rel="stylesheet" type="text/css" href="../CSS/style.css">
</head>

<body>
	<jsp:include page="./header_user.jsp"></jsp:include>
	
	<div class="container2">

		<h1>PAGE JEUX</h1>

		<div class="container3">
			<div class="container4" onClick="document.location.href='<%request.getContextPath();%>/DebutPartie/Fortnite';">
				<img src="../image/fortnite.png" />
				<h4 >Fortnite</h4>
			</div>
			<div class="container4" onClick="document.location.href='/DebutPartie/Warframe';">
				<img src="../image/warframe.png" />
				<h4>Warframe</h4>
			</div>
			<div class="container4" onClick="document.location.href='/DebutPartie/Phase10';">
				<img src="../image/phase10.png" />
				<h4>Phase10</h4>
			</div>
			<div class="container4" onClick="document.location.href='/DebutPartie/WoT';">
				<img src="../image/worldoftanks.png" />
				<h4>World Of Tanks</h4>
			</div>
			<div class="container4" onClick="document.location.href='/DebutPartie/GooseGame';">
				<img src="../image/goosegameio.png" />
				<h4>GooseGame.io</h4>
			</div>
			<div class="container4" onClick="document.location.href='/DebutPartie/BubbleShooter';">
				<img src="../image/bubbleshooter.png" />
				<h4>BubbleShooter</h4>
			</div>
			<div class="container4" onClick="document.location.href='/DebutPartie/Fortnite';">
				<img src="../image/fortnite.png" />
				<h4>Fortnite</h4>
			</div>
			<div class="container4" onClick="document.location.href='/DebutPartie/Warframe';">
				<img src="../image/warframe.png" />
				<h4>Warframe</h4>
			</div>
			<div class="container4" onClick="document.location.href='/DebutPartie/Phase10';">
				<img src="../image/phase10.png" />
				<h4>Phase10</h4>
			</div>
			<div class="container4" onClick="document.location.href='/DebutPartie/WoT';">
				<img src="../image/worldoftanks.png" />
				<h4>World Of Tanks</h4>
			</div>
		</div>
	</div>



	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>