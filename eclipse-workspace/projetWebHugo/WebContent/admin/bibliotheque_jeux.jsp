<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Bibliothèque de jeux</title>
<link rel="stylesheet" type="text/css" href="../style.css">
<style>
.container5{
	width: 70%;
	margin: 0 15%;
}

.container5 > h2{
	border-radius: 20px;
	border: 3px solid #ffffff;
	background-color: red;
}

.container5 .table{
	width: 100%;
	height : 60vw;
	font-size: 2.5em;
	vertical-align: middle;
}
.container5 .table .titre{
	background-color: #795548;
	font-weight: bold;
	color: #ffffff;
}
.container5 .table .impair{
	background-color: #f3b0e2;
	color: #000000;
}
.container5 .table .pair{
	background-color: #c90932;
	color: #ffffff;
}
.container5 .table .ligne{
	width: 100%;
	height: 4.7%;
	padding-left: 2%;
	border-radius: 10px;
	box-sizing: border-box;
}
</style>
</head>

<body>

	<jsp:include page="./header_admin.jsp"></jsp:include>
	
	<div class="container5">
		<h2>LISTE DE JEUX</h2>
	</div>
	
	<div class="container5">
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
	
	<script>
	
	
	
	</script>
</body>
</html>