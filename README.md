- équipe numéro 4
- branche : master, commit : 6632034c314c5ee2823579f7ddbe843da4c32b30
- war : /javaweeb.war
- rapport : rapport_equipe_4
- projet : /eclipse-workspace/JavaWEEB_le_retour

- vidéos : /projet-jee-equipe4_partie1.mp4 et ~/projet-jee-equipe4_partie2.mp4, on a réalisé 2 vidéos car on avait oublié de présenter des éléments et nous n'avions pas le temps de faire du montage.  (https://youtu.be/MLxaV4i4HV8, https://youtu.be/UIJHWT4t5b8 si le chargement ne se fait pas)

	Nombre d’heures
A titre indicatif, voici un décompte du nombre d’heures effectuées par personne pour ce projet :

Hugo Bernat : 32h 
Eli : 34h 
Mathieu : 31h
Théo : 33.5h
Philippe: 31h

- consignes installation : 
Pour faire le déployement du site sur le serveur : 
Commencer par repérer l'emplacement de votre fichier javaweeb.war
Ouvrir un terminal 
Utiliser la commande : cd {chemin du répertoire où se trouve le fichier javaweeb.war}
Vérifier par la commande : ls la présence dudit fichier
Lancer les commandes suivantes : (pour la version 8.5.37 de tomcat)
sudo /opt/tomcat/apache-tomcat-8.5.37/bin/startup.sh
sudo cp javaweeb.war /opt/tomcat/apache-tomcat-8.5.37/webapps/

Une fois ceci fait, ouvrir un navigateur internet et entrer l'URL suivante :
localhost:8080/javaweeb/

Pour fermer le serveur, faire la commande suivante : 
sudo /opt/tomcat/apache-tomcat-8.5.37/bin/shutdown.sh


  
