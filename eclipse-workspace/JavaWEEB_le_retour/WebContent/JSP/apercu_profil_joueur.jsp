<%@ page language="java"%>
<%@page import="net.model.User,net.dao.UserDao" %>
<!DOCTYPE html>
<html>
<%User joueur = UserDao.getUser(request.getParameter("joueur"));%>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

</head>
<body>
	<jsp:include page="./header_admin.jsp"></jsp:include>



	<div class="container2"
		style="background-color: #f491b9; border-radius: 20px;">
		<h1 style="border-radius: 20px 20px 0px 0px;"><%=request.getParameter("joueur")%></h1>
			<div class="alert alert-fail center" role="alert">
				<h1 align = middle > <font size="+2">${NOTIFICATION}</font></h1>
			</div>	
		<form>
			<fieldset disabled="disabled">
			<div class='container2'>

				<h3>

					<div>
						<label for="uname">Nom :</label> <input type="text"
							class="form-control" id="uname" placeholder="<%=joueur.getNom() %>"
							name="firstName" required>
					</div>

					<div>
						<label for="uname">Pr�nom :</label> <input type="text"
							class="form-control" id="uname" placeholder="<%=joueur.getPrenom()%>"
							name="lastName" required>
					</div>

					<div>
						<label for="uname">Date de naissance :</label> <input type="text"
							class="form-control" id="birthdayDate"
							placeholder="<%=joueur.getDateNaissance()%>" name="birthdayDate" required>
					</div>

					<div>
						<label for="uname">E-mail :</label> <input type="text"
							class="form-control" id="email" placeholder="<%=joueur.getEmail()%>"" name="email"
							required>
					</div>

					<div>
						<label for="uname">Nom d'utilisateur :</label> <input type="text"
							class="form-control" id="username"
							placeholder="<%=joueur.getIdentifiant() %>" name="username" required>
					</div>

					<div>
						<label for="uname">Id Utilisateur</label> <input type="password"
							class="form-control" id="password" placeholder="<%=joueur.getIdUtilisateur() %>"
							name="password" required>
					</div>

				</h3>

			</div>
			</fieldset>
		</form>
	</div>
<div class="margefooter"></div>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>