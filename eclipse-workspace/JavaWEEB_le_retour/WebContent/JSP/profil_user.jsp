<%@page import="net.model.User"%>
<%@page import="net.dao.UserDao" %>
<%@ page language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Profil</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

<body>
	<jsp:include page="./header_user.jsp"></jsp:include>


	<div class="container2"
		style="background-color: #f491b9; border-radius: 20px;">

		<h1 style="border-radius: 20px 20px 0px 0px;"> ${sessionScope.sessionUtilisateur.identifiant} </h1>

		<div class="container2">
			<h3 style="text-align: left;">

				<div>
					<label for="uname">Nom : ${sessionScope.sessionUtilisateur.nom}</label>
				</div>

				<div>
					<label for="uname">Prénom : ${sessionScope.sessionUtilisateur.prenom}</label>
				</div>

				<div>
					<label for="uname">Date de naissance : ${sessionScope.sessionUtilisateur.dateNaissance}</label>
				</div>

				<div>
					<label for="uname">E-mail : ${sessionScope.sessionUtilisateur.email}</label>
				</div>
				<div>
					<label for="uname">Jeux favoris : </label>

					<table class="table table-bordered">
						<thead>
							<tr>
								<th>Jeu</th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="jeu" items="${sessionScope.sessionUtilisateur.jeuxFavoris}">
								<tr><td><c:out value="${jeu.nom}" /></td>
									<td><a href="<%=request.getContextPath()%>/deleteJeu?idJeu=<c:out value='${jeu.idJeu}' />">Delete</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				
			</h3>
			<div class="container3">
				<a href = "<%=request.getContextPath()%>/JSP/profil_user_modif.jsp"> <button class="modifybtn" style="width:130px"> Modifier </button> </a>
				<!-- <button class="deletebtn">Supprimer le compte</button>  -->
			</div>
		</div>

	</div>

<div class="margefooter"></div>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>