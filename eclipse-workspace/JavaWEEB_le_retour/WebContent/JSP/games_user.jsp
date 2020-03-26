
<%@ page language="java"%>
<%@page import="java.util.List,net.model.Jeu"%>
<%@page import="java.util.List,net.model.User"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">

<title>Jeux</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

<body>
	<jsp:include page="./header_user.jsp"></jsp:include>
	
	<div class="container2">

		<h1>PAGE JEUX</h1>

		<div class="container3">
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=fortnite'>
						<img src="<%=request.getContextPath()%>/image/fortnite.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=fortnite'>Fortnite</a>
						
						<%  User user = (User) request.getSession().getAttribute("sessionUtilisateur");
							List<Jeu> listJeuxFavoris = (List<Jeu>) user.getJeuxFavoris();%>
						
						<% 	request.getSession().setAttribute("testAjoutJeu",false);
							for (Jeu j:listJeuxFavoris){
								if(1 == j.getIdJeu()){
									request.getSession().setAttribute("testAjoutJeu",true);
								}
							}%>
							<c:if test="${sessionScope.testAjoutJeu == false }">
								<a href="<%=request.getContextPath()%>/addJeu?jeu=FortniteXXX1" class="btn btn-success">
								<img src="<%=request.getContextPath()%>/image/plus.svg"  style="width: 14px;" align = right />
								</a>
							</c:if>
							<c:if test="${sessionScope.testAjoutJeu == true }">
								<img src="<%=request.getContextPath()%>/image/plusJaune.svg"  style="width: 14px;" align = right />
							</c:if>
							<%session.removeAttribute("testAjoutJeu"); %>
					</h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=warframe'>
						<img src="<%=request.getContextPath()%>/image/warframe.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=warframe'>Warframe</a>
						<% 	request.getSession().setAttribute("testAjoutJeu",false);
							for (Jeu j:listJeuxFavoris){
								if(5 == j.getIdJeu()){
									request.getSession().setAttribute("testAjoutJeu",true);
								}
							}%>
							<c:if test="${sessionScope.testAjoutJeu == false }">
								<a href="<%=request.getContextPath()%>/addJeu?jeu=WarframeXXX5" class="btn btn-success">
								<img src="<%=request.getContextPath()%>/image/plus.svg"  style="width: 14px;" align = right />
								</a>
							</c:if>
							<c:if test="${sessionScope.testAjoutJeu == true }">
								<img src="<%=request.getContextPath()%>/image/plusJaune.svg"  style="width: 14px;" align = right />
							</c:if>
							<%session.removeAttribute("testAjoutJeu"); %>
					</h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=phase10'>
						<img src="<%=request.getContextPath()%>/image/phase10.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=Phase10'>Phase10</a>
					<% 	request.getSession().setAttribute("testAjoutJeu",false);
							for (Jeu j:listJeuxFavoris){
								if(6 == j.getIdJeu()){
									request.getSession().setAttribute("testAjoutJeu",true);
								}
							}%>
							<c:if test="${sessionScope.testAjoutJeu == false }">
								<a href="<%=request.getContextPath()%>/addJeu?jeu=Phase10XXX6" class="btn btn-success">
								<img src="<%=request.getContextPath()%>/image/plus.svg"  style="width: 14px;" align = right />
								</a>
							</c:if>
							<c:if test="${sessionScope.testAjoutJeu == true }">
								<img src="<%=request.getContextPath()%>/image/plusJaune.svg"  style="width: 14px;" align = right />
							</c:if>
							<%session.removeAttribute("testAjoutJeu"); %></h4>
				</div>
				<div class="container4" onClick="document.location.href='/DebutPartie/WoT';">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=wot'>
						<img src="<%=request.getContextPath()%>/image/worldoftanks.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=wot'>World Of Tanks</a>
					<% 	request.getSession().setAttribute("testAjoutJeu",false);
							for (Jeu j:listJeuxFavoris){
								if(7 == j.getIdJeu()){
									request.getSession().setAttribute("testAjoutJeu",true);
								}
							}%>
							<c:if test="${sessionScope.testAjoutJeu == false }">
								<a href="<%=request.getContextPath()%>/addJeu?jeu=World Of TanksXXX7" class="btn btn-success">
								<img src="<%=request.getContextPath()%>/image/plus.svg"  style="width: 14px;" align = right />
								</a>
							</c:if>
							<c:if test="${sessionScope.testAjoutJeu == true }">
								<img src="<%=request.getContextPath()%>/image/plusJaune.svg"  style="width: 14px;" align = right />
							</c:if>
							<%session.removeAttribute("testAjoutJeu"); %></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=goosegame'>
						<img src="<%=request.getContextPath()%>/image/goosegameio.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=goosegame'>GooseGame.io</a>
					<% 	request.getSession().setAttribute("testAjoutJeu",false);
							for (Jeu j:listJeuxFavoris){
								if(8 == j.getIdJeu()){
									request.getSession().setAttribute("testAjoutJeu",true);
								}
							}%>
							<c:if test="${sessionScope.testAjoutJeu == false }">
								<a href="<%=request.getContextPath()%>/addJeu?jeu=Goose GameXXX8" class="btn btn-success">
								<img src="<%=request.getContextPath()%>/image/plus.svg"  style="width: 14px;" align = right />
								</a>
							</c:if>
							<c:if test="${sessionScope.testAjoutJeu == true }">
								<img src="<%=request.getContextPath()%>/image/plusJaune.svg"  style="width: 14px;" align = right />
							</c:if>
							<%session.removeAttribute("testAjoutJeu"); %>
					</h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=bubbleshooter'>
						<img src="<%=request.getContextPath()%>/image/bubbleshooter.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=bubbleshooter'>BubbleShooter</a>
						<% request.getSession().setAttribute("testAjoutJeu",false);
							for (Jeu j:listJeuxFavoris){
								if(9 == j.getIdJeu()){
									request.getSession().setAttribute("testAjoutJeu",true);
								}
							}%>
							<c:if test="${sessionScope.testAjoutJeu == false }">
								<a href="<%=request.getContextPath()%>/addJeu?jeu=Bubble ShooterXXX9" class="btn btn-success">
								<img src="<%=request.getContextPath()%>/image/plus.svg"  style="width: 14px;" align = right />
								</a>
							</c:if>
							<c:if test="${sessionScope.testAjoutJeu == true }">
								<img src="<%=request.getContextPath()%>/image/plusJaune.svg"  style="width: 14px;" align = right />
							</c:if>
							<%session.removeAttribute("testAjoutJeu"); %></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=fortnite'>
						<img src="<%=request.getContextPath()%>/image/fortnite.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=fortnite'>Fortnite</a>
					<% 	request.getSession().setAttribute("testAjoutJeu",false);
							for (Jeu j:listJeuxFavoris){
								if(1 == j.getIdJeu()){
									request.getSession().setAttribute("testAjoutJeu",true);
								}
							}%>
							<c:if test="${sessionScope.testAjoutJeu == false }">
								<a href="<%=request.getContextPath()%>/addJeu?jeu=FortniteXXX1" class="btn btn-success">
								<img src="<%=request.getContextPath()%>/image/plus.svg"  style="width: 14px;" align = right />
								</a>
							</c:if>
							<c:if test="${sessionScope.testAjoutJeu == true }">
								<img src="<%=request.getContextPath()%>/image/plusJaune.svg"  style="width: 14px;" align = right />
							</c:if>
							<%session.removeAttribute("testAjoutJeu"); %></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=warframe'>
						<img src="<%=request.getContextPath()%>/image/warframe.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=warframe'>Warframe</a>
					<% 	request.getSession().setAttribute("testAjoutJeu",false);
							for (Jeu j:listJeuxFavoris){
								if(5 == j.getIdJeu()){
									request.getSession().setAttribute("testAjoutJeu",true);
								}
							}%>
							<c:if test="${sessionScope.testAjoutJeu == false }">
								<a href="<%=request.getContextPath()%>/addJeu?jeu=WarframeXXX5" class="btn btn-success">
								<img src="<%=request.getContextPath()%>/image/plus.svg"  style="width: 14px;" align = right />
								</a>
							</c:if>
							<c:if test="${sessionScope.testAjoutJeu == true }">
								<img src="<%=request.getContextPath()%>/image/plusJaune.svg"  style="width: 14px;" align = right />
							</c:if>
							<%session.removeAttribute("testAjoutJeu"); %></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=phase10'>
						<img src="<%=request.getContextPath()%>/image/phase10.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=phase10'>Phase10</a>
					<% 	request.getSession().setAttribute("testAjoutJeu",false);
							for (Jeu j:listJeuxFavoris){
								if(6 == j.getIdJeu()){
									request.getSession().setAttribute("testAjoutJeu",true);
								}
							}%>
							<c:if test="${sessionScope.testAjoutJeu == false }">
								<a href="<%=request.getContextPath()%>/addJeu?jeu=Phase10XXX6" class="btn btn-success">
								<img src="<%=request.getContextPath()%>/image/plus.svg"  style="width: 14px;" align = right />
								</a>
							</c:if>
							<c:if test="${sessionScope.testAjoutJeu == true }">
								<img src="<%=request.getContextPath()%>/image/plusJaune.svg"  style="width: 14px;" align = right />
							</c:if>
							<%session.removeAttribute("testAjoutJeu"); %></h4>
				</div>
				<div class="container4">
					<a href='<%=request.getContextPath()%>/DebutPartie?game=wot'>
						<img src="<%=request.getContextPath()%>/image/worldoftanks.png" />
					</a>
					<h4><a href='<%=request.getContextPath()%>/DebutPartie?game=wot'>World Of Tanks</a>
					<% 	request.getSession().setAttribute("testAjoutJeu",false);
							for (Jeu j:listJeuxFavoris){
								if(7 == j.getIdJeu()){
									request.getSession().setAttribute("testAjoutJeu",true);
								}
							}%>
							<c:if test="${sessionScope.testAjoutJeu == false }">
								<a href="<%=request.getContextPath()%>/addJeu?jeu=World Of TanksXXX7" class="btn btn-success">
								<img src="<%=request.getContextPath()%>/image/plus.svg"  style="width: 14px;" align = right />
								</a>
							</c:if>
							<c:if test="${sessionScope.testAjoutJeu == true }">
								<img src="<%=request.getContextPath()%>/image/plusJaune.svg"  style="width: 14px;" align = right />
							</c:if>
							<%session.removeAttribute("testAjoutJeu"); %></h4>
				</div>
		</div>
	</div>



	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>