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

		<h1 style="border-radius: 20px 20px 0px 0px;">${sessionScope.sessionAdministrateur.identifiant} </h1>

		<div class="container2">
			<h3 style="text-align: left;">

				<div>
					<label for="uname">Nom : ${sessionScope.sessionAdministrateur.nom}</label>
				</div>

				<div>
					<label for="uname">Prénom : ${sessionScope.sessionAdministrateur.prenom}</label>
				</div>

				<div>
					<label for="uname">E-mail : ${sessionScope.sessionAdministrateur.email}</label>
				</div>
			</h3>
			<!-- <div class="container3">
				<button class="modifybtn">Modifier</button>
				<button class="deletebtn">Supprimer le compte</button>
			</div> -->
		</div>

	</div>

	<div class="margefooter"></div>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>