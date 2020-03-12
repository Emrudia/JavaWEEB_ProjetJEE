<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Page accueil</title>
<link rel="stylesheet" type="text/css" href="../style.css">
</head>

<body>
	<script type="text/javascript">
		if(log = "none"){
			document.querySelector(body).innerHTML = "<jsp:include page="./header.jsp"></jsp:include>";
		}
		else if(log = "user"){
			document.querySelector(body).innerHTML = "<jsp:include page="./user/header_user.jsp"></jsp:include>";
		}
		else if(log = "admin"){
			document.querySelector(body).innerHTML = "<jsp:include page="./admin/header_admin.jsp"></jsp:include>";
		}
	</script>

	<div>

		<main>
		<article>
			<h1>PAGE D'ACCUEIL</h1>
		</article>
		</main>
	</div>


	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>