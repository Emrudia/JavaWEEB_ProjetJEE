<%@ page language="java"%>
<%@page import="java.util.List,net.model.Jeu,java.util.Collections,net.model.PartieEnCours,net.web.PartieEnCoursController,java.util.ArrayList"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Parties en cours</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

<body>

	<jsp:include page="./header_admin.jsp"></jsp:include>

	<div class="container2">
		<h1>Parties en cours</h1>
	</div>
	<div class = "container3">
		<button class="deletebtn" id="try">Rafra�chir</button> 
	
	<div class="container2">
	
<%@page import="java.util.List,net.model.Jeu,net.model.PartieEnCours,net.web.PartieEnCoursController,java.util.ArrayList"%>
		<table>
			<tr>
				<td class="colonne1">Nom du jeu</td>
				<td class="colonne2">Pseudo</td>
				<td class="colonne3">D�but de la partie</td>
				<td class="colonne4">Terminer la partie</td>
			</tr>
			
		<%ArrayList <PartieEnCours> parties = PartieEnCoursController.parties; 
		Collections.reverse(parties);
		int index = 0;
		for (PartieEnCours pec : parties){%>
			<tr>  
				
				<td><%=pec.getNomJeu() %></td>
				<td><%=pec.getNomUtilisateur() %></td>
				<td><%=pec.getDateDebut().toString() %></td>
				<td><a href = "<%=request.getContextPath()%>/AdminFinPartie?index=<%=index%>"> <button class="endGameBtn" style="width = 90%">Terminer la partie</button></a></td>
			</tr>
			<%index++;
			} 
			%>
		</table>
	</div>
	</div>
	<div class="container2" id ='tableau'>
	</div>
	
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.0/jquery.min.js"></script>
	<script type="text/javascript">
		var auto_refresh = document.getElementById("try").addEventListener("click", function (){
			$('#tableau').load('script_tableau.jsp').fadeIn("slow");}); 
	</script>

	<div class="margefooter"></div>

	<jsp:include page="./footer.jsp"></jsp:include>

	<script>
		
	</script>
</body>
</html>