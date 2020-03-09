<%@ page language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
<link rel="stylesheet" type="text/css" href="../style.css">
</head>
<body>

	<header>

		<div class="header">

			<a href="../common/index_player.jsp" class="logo">JeuWEEB</a>
			<div class="header-right">
				<a href="../common/index_player.jsp">Accueil</a> <a
					href="../common/games.jsp">Jeux</a> <a href="../user/profil.jsp">Profil</a>
				<a href="../common/contact.jsp">Contacts</a> <a href="./login.jsp">Authentification</a>
				<a href="../register/register.jsp">Inscription</a>
				</nav>

			</div>
	</header>
	<div>

		<div class="container2"
			style="background-color: #f491b9; border-radius: 20px;">
			<h1 style="border-radius: 20px 20px 0px 0px;">Connexion</h1>

			<form action="<%=request.getContextPath()%>/login" method="post">
				<div class="container2">
					<h3>
						<div>
							<label for="uname">Nom d'utilisateur :</label> <input type="text"
								class="form-control" id="username"
								placeholder="Nom d'utilisateur" name="username" required>
						</div>

						<div>
							<label for="uname">Mot de passe :</label> <input type="password"
								class="form-control" id="password" placeholder="Mot de passe"
								name="password" required>
						</div>

					</h3>

					<div class="container">
						<button type="submit" class="registerbtn">Se connecter</button>
					</div>
				</div>
			</form>
			<div class="container2">
				<h2>Mot de passe oublié</h2>
			</div>
		</div>
	</div>
	<footer>
		<div class='copyright'>@copyright JavaWEEB Project Team</div>
	</footer>
</body>
</html>