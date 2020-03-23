<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Nous contacter</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/style.css">
</head>

<body>

	<jsp:include page="./header.jsp"></jsp:include>

	<div>

		<main>
		<article>
			<div class="container2"
				style="background-color: #f491b9; border-radius: 20px;">

				<div class="container">
					<h1 style="border-radius: 20px 20px 0px 0px;">Comment nous
						contacter ?</h1>
					<h2>Vous pouvez nous joindre via nos réseaux sociaux ou via
						e-mail.</h2>
				</div>
				<div class="container3">
					<img src="<%=request.getContextPath()%>/image/facebook_logo.png" style="width: 15%;" /> <img
						src="<%=request.getContextPath()%>/image/twitter_logo.png" style="width: 15%;" /> <img
						src="<%=request.getContextPath()%>/image/instagram_logo.png" style="width: 15%;" /> <img
						src="<%=request.getContextPath()%>/image/msn_logo.png" style="width: 18%;" /> <img
						src="<%=request.getContextPath()%>/image/myspace_logo.png" style="width: 15%;" /> <img
						src="<%=request.getContextPath()%>/image/skyblog_logo.png" style="width: 15%;" />
				</div>
				<div>
					<h2>javaweeb@gmail.com</h2>
				</div>
			</div>
		</article>

		</main>
	</div>

<div class="margefooter"></div>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>