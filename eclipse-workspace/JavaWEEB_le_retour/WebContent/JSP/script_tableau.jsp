
<div class="container2">
<%@page import="java.util.List,net.model.Jeu,net.model.PartieEnCours,net.web.PartieEnCoursController,java.util.ArrayList"%>
		<table>
			<tr>
				<td class="colonne1">Nom du jeu</td>
				<td class="colonne2">Pseudo</td>
				<td class="colonne3">Début de la partie</td>
				<td class="colonne4">Terminer la partie</td>
			</tr>
			
		<%ArrayList <PartieEnCours> parties = PartieEnCoursController.parties; 
		for (PartieEnCours pec : parties){%>
			<tr>  
				
				<td><%=pec.getNomJeu() %></td>      <!-- Faudra insérer les listes d'éléments -->
				<td><%=pec.getNomUtilisateur() %></td>
				<td><%=pec.getDateDebut().toString() %></td>
				<td>A remplir</td>
			</tr>
<%} %>
		</table>
	</div>