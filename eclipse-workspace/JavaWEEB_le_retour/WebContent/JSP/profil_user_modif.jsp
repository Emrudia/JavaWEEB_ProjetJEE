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

		<h1 style="border-radius: 20px 20px 0px 0px;"> Modification de ${sessionScope.sessionUtilisateur.identifiant} </h1>

	<form action="<%=request.getContextPath()%>/updateProfil" method="post">
		<div class="container2">
					<h3 style="text-align: left;">
							<div>
								<label for="uname">Nom : </label>
								<input type="text" value="<c:out value='${sessionScope.sessionUtilisateur.nom}'/>" 
								class="form-control" name="lastname" >
							</div>
			
							<div>
								<label for="uname">Prénom : </label>
								<input type="text" value="<c:out value= '${sessionScope.sessionUtilisateur.prenom}'/>" 
								class="form-control" name="firstname" >
							</div>
			
							<div>
								<label for="uname">Date de naissance : </label>
								<input type="text" value="<c:out value= '${sessionScope.sessionUtilisateur.dateNaissance}'/>" 
								class="form-control" name="birthdate" >
							</div>
			
							<div>
								<label for="uname">E-mail : </label>
								<input type="text" value="<c:out value= '${sessionScope.sessionUtilisateur.email}'/>" 
								class="form-control" name="email" >
							</div>
					</h3>
					<div class="container">
						<button type="submit" class="registerbtn">Sauvegarder</button>
					</div>
		</div>
	</form>
				
		
		</div>

	</div>

<div class="margefooter"></div>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>