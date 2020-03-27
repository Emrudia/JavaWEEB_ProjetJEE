
	
        <div class="container2">
    
<%@page import="java.util.List,net.model.Jeu,net.model.PartieEnCours,net.web.PartieEnCoursController,java.util.ArrayList,java.util.Collections,java.time.format.DateTimeFormatter"%>
<%DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); %>

        <table>
            <tr>
                <td class="colonne1">Nom du jeu</td>
                <td class="colonne2">Pseudo</td>
                <td class="colonne3">Début de la partie</td>
                <td class="colonne4">Terminer la partie</td>
            </tr>
            
        <%ArrayList <PartieEnCours> parties = PartieEnCoursController.parties; 
        Collections.reverse(parties);
        int index = 0;
        for (PartieEnCours pec : parties){%>
            <tr>  
                
                <td><%=pec.getNomJeu() %></td>
                <td><%=pec.getNomUtilisateur() %></td>
                <td><%=pec.getDateDebut().format(formatter) %></td>
                <td><a href = "<%=request.getContextPath()%>/AdminFinPartie?index=<%=index%>"> <button class="endGameBtn" style="width:90%;">Terminer la partie</button></a></td>
            </tr>
            <%index++;
            } 
            %>
        </table>
    </div>


