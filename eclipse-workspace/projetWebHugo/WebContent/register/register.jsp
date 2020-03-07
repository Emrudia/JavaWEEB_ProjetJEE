<%@ page language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
<link rel="stylesheet" type="text/css" href="../style.css">
</head>

</head>
<body>
	<header>

		<div class="header">

			<a href="../common/index_player.jsp" class="logo">JeuWEEB</a>
			<div class="header-right">
				<a href="../common/index_player.jsp">Accueil</a> <a
					href="../common/games.jsp">Jeux</a> <a href="../common/profil.jsp">Profil</a>
				<a href="../common/contact.jsp">Contacts</a> <a
					href="../login/login.jsp">Authentification</a> <a
					href="./register.jsp">Inscription</a>
				</nav>

			</div>
	</header>
	<div>
		<main>
		<article>
			<h1>Inscription</h1>

			<form action="<%=request.getContextPath()%>/register" method="post">

				<div class='container'>

					<h2>

						<div>
							<label for="uname"><h3>Nom :</h3></label> <input type="text"
								class="form-control" id="uname" placeholder="First Name"
								name="firstName" required>
						</div>

						<div>
							<label for="uname"><h3>Prénom :</h3></label> <input type="text"
								class="form-control" id="uname" placeholder="last Name"
								name="lastName" required>
						</div>

						<div>
							<label for="uname"><h3>Date de naissance :</h3></label> <input
								type="text" class="form-control" id="birthdayDate"
								placeholder="BirthdayDate" name="birthdayDate" required>
						</div>

						<div>
							<label for="uname"><h3>E-mail :</h3></label> <input type="text"
								class="form-control" id="email" placeholder="Email" name="email"
								required>
						</div>

						<div>
							<label for="uname"><h3>Nom d'utilisateur :</h3></label> <input
								type="text" class="form-control" id="username"
								placeholder="User Name" name="username" required>
						</div>

						<div>
							<label for="uname"><h3>Mot de passe :</h3></label> <input
								type="password" class="form-control" id="password"
								placeholder="Password" name="password" required>
						</div>

						<div>
							<label for="uname"><h3>Remettre le mot de passe :</h3></label> <input
								type="password" class="form-control" id="password"
								placeholder="Password" name="password" required>
						</div>

					</h2>
					<div class="container">
						<button type="submit" class="registerbtn">S'inscrire</button>
					</div>

				</div>
			</form>
		</article>
		</main>
	</div>

	<footer>
		<div class='copyright'>@copyright JavaWEEB Project Team</div>
	</footer>
</body>
</html>