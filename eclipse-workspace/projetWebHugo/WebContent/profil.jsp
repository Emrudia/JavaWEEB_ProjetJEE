<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Profil</title>
<link rel="stylesheet" type="text/css" href="../style.css">
</head>

<body>
	<jsp:include page="./header_user.jsp"></jsp:include>


	<div class="container2"
		style="background-color: #f491b9; border-radius: 20px;">

		<h1 style="border-radius: 20px 20px 0px 0px;">Nom d'utilisateur</h1>

		<div class="container2">
			<h3>

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
				<button class="modifybtn">Modifier</button>
				<button class="deletebtn">Supprimer le compte</button>
			</div>
		</div>

	</div>


	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>