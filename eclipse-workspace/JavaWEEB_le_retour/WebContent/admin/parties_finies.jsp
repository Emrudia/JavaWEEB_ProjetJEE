<%@ page language="java"%>
<%@page import="java.util.List,net.model.Jeu"%>
<%
	List<Jeu> listJeux = (List<Jeu>) request.getAttribute("listJeux");
%>


<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Parties finies</title>
<link rel="stylesheet" type="text/css" href="../style.css">
</head>

<body>

	<jsp:include page="./header_admin.jsp"></jsp:include>

	<div class="container5">
		<h2>Partie terminées</h2>
	</div>

	<table>
		<tr>
			<td>Case 1</td>
			<td>Case 2</td>
		</tr>

	</table>
	<div class="margefooter"></div>

	<jsp:include page="../footer.jsp"></jsp:include>

	<script>
		
	</script>
</body>
</html>