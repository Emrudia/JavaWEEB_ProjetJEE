<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Profil</title>
<link rel="stylesheet" type="text/css" href="../style.css">
</head>

<body>

	<header>

		<div class="header">

			<a href="../common/index_player.jsp" class="logo">JeuWEEB</a>
			<div class="header-right">
				<a href="../common/index_player.jsp">Accueil</a> <a
					href="../common/games.jsp">Jeux</a> <a href="./profil.jsp">Profil</a>
				<a href="../common/contact.jsp">Contacts</a> <a
					href="../login/login.jsp">Authentification</a> <a
					href="../register/register.jsp">Inscription</a>
				</nav>

			</div>
	</header>

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


	<footer>
		<div class='copyright'>@copyright JavaWEEB Project Team</div>
	</footer>
</body>
</html>