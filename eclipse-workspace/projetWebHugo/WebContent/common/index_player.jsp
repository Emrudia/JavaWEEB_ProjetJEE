<%@ page language="java"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Page accueil</title>
<link rel="stylesheet" type="text/css" href="../style.css">
</head>

<body>
	<header>
		<div class="title">JeuWEEB.fr</div>
		
	</header>
	
	<div>
		<nav>
			<ul>
				<li><a href="./index_player.jsp">Accueil</a></li>
				<li><a href="./games.jsp">Jeux</a></li>
				<li><a href="./profil.jsp">Profil</a></li>
				<li><a href="../login/login.jsp">Authentification</a></li>
			</ul>
		</nav>

		<main>
		<article>
			<h2>Mes travaux en Technologies Web</h2>
			<p>Le but de cette séance de Travaux Pratiques est de composer un
				site web qui vous permettra de naviguer à travers vos réalisations.</p>
			<h3>Ce qu'il faut faire</h3>
			<p>Modifiez la page courante pour en faire la page d'accueil de
				votre site. Cette page permettra l'accès à des catégories de travaux
				: HTML / JS / PHP / Vue. Chaque catégorie aura sa page d'accueil,
				sur le même format.Ces pages d'accueil pointeront vers des pages
				réalisées en cours. Par exemple, la catégorie HTML contiendra une
				page affichant une image et une autre contenant un élément vidéo.
				Attention, vous réfléchirez à l'arborescence de votre répertoire
				pour assurer l'uniformité dela présentation.</p>
			<h3>Bonus</h3>
			<ul>
				<li>Modifiez la CSS à votre goût.</li>
				<li>Créez une page "qui suis-je" avec votre CV</li>
				<li>Quel type de copyright devriez vous mettre?</li>
			</ul>
		</article>

		</main>
	</div>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>