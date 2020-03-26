<%@ page language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

</head>
<body>
	<jsp:include page="./header.jsp"></jsp:include>



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
							placeholder="Date de naissance jj/mm/aaaa" name="birthdayDate" required>
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
						<label for="uname">Vérifier le mot de passe :</label> <input
							type="password" class="form-control" id="password"
							placeholder="Mot de passe" name="password" required>
					</div>

				</h3>
				<div class="container">
					<button type="submit" class="registerbtn">S'inscrire</button>
				</div>
				<div class="alert alert-fail center" role="alert">
					<h1 align = middle > <font size="+2">${NOTIFICATION}</font></h1>
				</div>	

			</div>
		</form>
	</div>
<div class="margefooter"></div>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>