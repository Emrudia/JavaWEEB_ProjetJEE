<%@ page language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentification</title>
<link rel="stylesheet" type="text/css" href="../style.css">
</head>

</head>
<body>
	<header>

		<div class="header">

			<a href="../common/index_player.jsp" class="logo">JeuWEEB</a>
			<div class="header-right">
				<a href="../common/index_player.jsp">Accueil</a> <a
					href="../common/games.jsp">Jeux</a> <a href="../user/profil.jsp">Profil</a>
				<a href="../common/contact.jsp">Contacts</a> <a
					href="../login/login.jsp">Authentification</a> <a
					href="./register.jsp">Inscription</a>
				</nav>

			</div>
	</header>


	<div class="container2"
		style="background-color: #f491b9; border-radius: 20px;">
		<h1 style="border-radius: 20px 20px 0px 0px;">Inscription</h1>
		<form action="<%=request.getContextPath()%>/register" method="post">

			<div class='container2'>


				<h3>

					<div>
						<label for="uname">Nom :</label> <input type="text"
							class="form-control" id="uname" placeholder="Nom"
							name="firstName" required>
					</div>

					<div>
						<label for="uname">Prénom :</label> <input type="text"
							class="form-control" id="uname" placeholder="Prénom"
							name="lastName" required>
					</div>

					<div>
						<label for="uname">Date de naissance :</label> <input type="text"
							class="form-control" id="birthdayDate"
							placeholder="Date de naissance" name="birthdayDate" required>
					</div>

					<div>
						<label for="uname">E-mail :</label> <input type="text"
							class="form-control" id="email" placeholder="E-mail" name="email"
							required>
					</div>

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

					<div>
						<label for="uname">Remettre le mot de passe :</label> <input
							type="password" class="form-control" id="password"
							placeholder="Mot de passe" name="password" required>
					</div>

				</h3>
				<div class="container">
					<button type="submit" class="registerbtn">S'inscrire</button>
				</div>

			</div>
		</form>
	</div>

	<footer>
		<div class='copyright'>@copyright JavaWEEB Project Team</div>
	</footer>
</body>
</html>