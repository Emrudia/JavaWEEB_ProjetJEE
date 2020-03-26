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
        <button class="deletebtn" id="try">Rafraichir</button> 
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
	(function(){
		var raf;
		raf = document.getElementById("try");
		raf.click();
		setInterval(function(){
			raf.click();
		},15000);
	})();
	
	</script>
</body>
</html>

