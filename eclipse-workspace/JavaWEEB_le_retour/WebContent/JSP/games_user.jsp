
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
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=fortnite'>
						<img src="../image/fortnite.png" />
					</a>
					<h4 ><a href='<%=request.getContextPath()%>/DebutPartie?game=fortnite'>Fortnite</a></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=warframe'>
						<img src="../image/warframe.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=warframe'>Warframe</a></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=phase10'>
						<img src="../image/phase10.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=Phase10'>Phase10</a></h4>
				</div>
				<div class="container4" onClick="document.location.href='/DebutPartie/WoT';">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=wot'>
						<img src="../image/worldoftanks.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=wot'>World Of Tanks</a></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=goosegame'>
						<img src="../image/goosegameio.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=goosegame'>GooseGame.io</a></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=bubbleshooter'>
						<img src="../image/bubbleshooter.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=bubbleshooter'>BubbleShooter</a></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=fortnite'>
						<img src="../image/fortnite.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=fortnite'>Fortnite</a></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=warframe'>
						<img src="../image/warframe.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=warframe'>Warframe</a></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=phase10'>
						<img src="../image/phase10.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=phase10'>Phase10</a></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=wot'>
						<img src="../image/worldoftanks.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=wot'>World Of Tanks</a></h4>
				</div>
		</div>
	</div>



	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>