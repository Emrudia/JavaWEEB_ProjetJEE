<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Profil</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

<body>
	<jsp:include page="./header_admin.jsp"></jsp:include>


	<div class="container2"
		style="background-color: #f491b9; border-radius: 20px;">

		<h1 style="border-radius: 20px 20px 0px 0px;">Nom d'utilisateur</h1>

		<div class="container2">
			<h3 style="text-align: left;">

				<div>
					<label for="uname">Nom :</label>
				</div>

				<div>
					<label for="uname">Prénom :</label>
				</div>

				<div>
					<label for="uname">Date de naissance :</label>
				</div>

				<div>
					<label for="uname">E-mail :</label>
				</div>
				<div>
					<label for="uname">Jeux favoris :</label>
				</div>
			</h3>
			<div class="container3">
				<button class="banbtn">Bannir le joueur</button>
			</div>
		</div>

	</div>

<div class="margefooter"></div>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>