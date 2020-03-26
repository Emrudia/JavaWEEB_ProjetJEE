<header>

	<div class="header">

		<a href="<%=request.getContextPath()%>/JSP/accueil_user.jsp" class="logo">JeuWEEB</a>
		
		<div class="header-right">
		
			<a href="<%=request.getContextPath()%>/JSP/accueil_user.jsp">Accueil</a> 
			
			<%if(request.getSession().getAttribute("partieEnCours") == null) { %>
			<a href="<%=request.getContextPath()%>/JSP/games_user.jsp">Jeux</a> 
			<%}
			else {%>
			<a href="<%=request.getContextPath()%>/JSP/in_game.jsp">Partie en cours</a> 
			<%} %>
			<a href="<%=request.getContextPath()%>/JSP/contact_user.jsp">Contacts</a>
			<a href="<%=request.getContextPath()%>/JSP/profil_user.jsp">Profil</a>
			<a href="<%=request.getContextPath()%>/logout">Déconnexion</a>
			
		</div>
		
	</div>
	
</header>