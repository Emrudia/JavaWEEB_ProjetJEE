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
			<p>Le but de cette s�ance de Travaux Pratiques est de composer un
				site web qui vous permettra de naviguer � travers vos r�alisations.</p>
			<h3>Ce qu'il faut faire</h3>
			<p>Modifiez la page courante pour en faire la page d'accueil de
				votre site. Cette page permettra l'acc�s � des cat�gories de travaux
				: HTML / JS / PHP / Vue. Chaque cat�gorie aura sa page d'accueil,
				sur le m�me format.Ces pages d'accueil pointeront vers des pages
				r�alis�es en cours. Par exemple, la cat�gorie HTML contiendra une
				page affichant une image et une autre contenant un �l�ment vid�o.
				Attention, vous r�fl�chirez � l'arborescence de votre r�pertoire
				pour assurer l'uniformit� dela pr�sentation.</p>
			<h3>Bonus</h3>
			<ul>
				<li>Modifiez la CSS � votre go�t.</li>
				<li>Cr�ez une page "qui suis-je" avec votre CV</li>
				<li>Quel type de copyright devriez vous mettre?</li>
			</ul>
		</article>

		</main>
	</div>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>