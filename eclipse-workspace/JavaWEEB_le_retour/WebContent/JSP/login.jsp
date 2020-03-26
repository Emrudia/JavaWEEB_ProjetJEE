<%@ page language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Authentification</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>
<body>

	<jsp:include page="./header.jsp"></jsp:include>

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
				<a style="text-decoration: none;" href="./accueil_nonlog.jsp"><h3>Mot de passe oublié</h3></a>
			</div>

			<div class="container2">
				<a style="text-decoration: none;" href="./register.jsp"><h3>Pas encore membre ? Inscrivez-vous !</h3></a>
			</div>
		</div>
		
		<div class="alert alert-fail center" role="alert">
			<h1 align = middle > <font size="+1">${NOTIFICATION}</font></h1>
		</div>	
	</div>
				
	<div class="margefooter"></div>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>