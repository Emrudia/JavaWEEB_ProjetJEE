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
}
.container2 .table .ligne1{
	background-color: #0000ff;
}
.container2 .table .pair{
	background-color: #ff0000;
}
.container2 .table .impair{
	background-color: #00ff00;
}
.container2 .table .ligne{
	width: 100%;
	height: 5vw;
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
			<div class="ligne1"><h5>Nom</h5></div>
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


	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>