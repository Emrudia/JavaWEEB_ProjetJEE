<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Nous contacter</title>
<link rel="stylesheet" type="text/css" href="../style.css">
</head>

<body>

	<script type="text/javascript">
		if(log = "none"){
			document.querySelector(body).innerHTML = "<jsp:include page="../nonlog/header.jsp"></jsp:include>";
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
			<div class="container2"
				style="background-color:  #f491b9; border-radius: 20px;">

				<div class="container">
					<h1 style="border-radius: 20px 20px 0px 0px;">Comment nous contacter ?</h1>
					<h2>Vous pouvez nous joindre via nos r�seaux sociaux ou via
						e-mail.</h2>
				</div>
				<div class="container3">
					<img src="../image/facebook_logo.png" style="width: 15%;" /> <img
						src="../image/twitter_logo.png" style="width: 15%;" /> <img
						src="../image/instagram_logo.png" style="width: 15%;" /> <img
						src="../image/msn_logo.png" style="width: 18%;" /> <img
						src="../image/myspace_logo.png" style="width: 15%;" /> <img
						src="../image/skyblog_logo.png" style="width: 15%;" />
				</div>
				<div>
					<h2>javaweeb@gmail.com</h2>
				</div>
			</div>
		</article>

		</main>
	</div>


	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>