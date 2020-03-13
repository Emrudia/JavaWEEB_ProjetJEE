
<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">

<title>Jeux</title>
<link rel="stylesheet" type="text/css" href="../style.css">
</head>

<body>

	<script type="text/javascript">
		if(log = "none"){
			document.querySelector(body).innerHTML = "<jsp:include page="../nonlog/header.jsp"></jsp:include>";
		}
		else if(log = "user"){
			document.querySelector(body).innerHTML = "<jsp:include page="../user/header_user.jsp"></jsp:include>";
		}
		else if(log = "admin"){
			document.querySelector(body).innerHTML = "<jsp:include page="../admin/header_admin.jsp"></jsp:include>";
		}
	</script>

	<div class="container2">

		<h1>PAGE JEUX</h1>

		<div class="container3">
			<div class="container4">
				<img src="./images/fortnite.png" />
				<h4>Fortnite</h4>
			</div>
			<div class="container4">
				<img src="./images/warframe.png" />
				<h4>Warframe</h4>
			</div>
			<div class="container4">
				<img src="./images/phase10.png" />
				<h4>Phase10</h4>
			</div>
			<div class="container4">
				<img src="./images/worldoftanks.png" />
				<h4>World Of Tanks</h4>
			</div>
			<div class="container4">
				<img src="./images/goosegameio.png" />
				<h4>GooseGame.io</h4>
			</div>
			<div class="container4">
				<img src="./images/bubbleshooter.png" />
				<h4>BubbleShooter</h4>
			</div>
			<div class="container4">
				<img src="./images/fortnite.png" />
				<h4>Fortnite</h4>
			</div>
			<div class="container4">
				<img src="./images/warframe.png" />
				<h4>Warframe</h4>
			</div>
			<div class="container4">
				<img src="./images/phase10.png" />
				<h4>Phase10</h4>
			</div>
			<div class="container4">
				<img src="./images/worldoftanks.png" />
				<h4>World Of Tanks</h4>
			</div>
		</div>
	</div>



	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>