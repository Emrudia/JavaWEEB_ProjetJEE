<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Bibliothèque de jeux</title>
<link rel="stylesheet" type="text/css" href="../style.css">
<style>
.container2 .table{
	width: 100%;
	height : 30vw;
	color: #ffffff;
	font-size: 2.5em;
	vertical-align: middle;
	padding: auto;
}
.container2 .table .titre{
	background-color: #0000ff;
	font-weight: bold;
}
.container2 .table .pair{
	background-color: #ff0000;
}
.container2 .table .impair{
	background-color: #00ff00;
}
.container2 .table .ligne{
	width: 100%;
	height: 9%;
	padding-left: 2%;
}
</style>
</head>

<body>

	<jsp:include page="./header_admin.jsp"></jsp:include>
	
	<div class="container2">
		<h1>LISTE DE JEUX</h1>
	</div>
	
	<div class="container2">
		<div class="table">
			<div class="ligne titre">Nom</div>
			<div class="ligne impair"></div>
			<div class="ligne pair"></div>
			<div class="ligne impair"></div>
			<div class="ligne pair"></div>
			<div class="ligne impair"></div>
			<div class="ligne pair"></div>
			<div class="ligne impair"></div>
			<div class="ligne pair"></div>
			<div class="ligne impair"></div>
			<div class="ligne pair"></div>
		</div>
	</div>
	
	<jsp:include page="../pages/pages.jsp"></jsp:include>
	
	<div class="margefooter"></div>

	<jsp:include page="../footer.jsp"></jsp:include>
	
</body>
</html>