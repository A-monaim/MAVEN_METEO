------------------------------------------------------------------Etape 5-------------------------------------------------------------------  
Les dépendances :  
	-WEB : La dépendance spring-web contient des utilitaires Web spécifiques communs pour les environnements Servlet et Portlet,  
		et elle fournit une intégration HTTP de base, y compris des filtres Servlet pratiques, Spring HTTP Invoker,   
		une infrastructure à intégrer avec d'autres frameworks Web et technologies HTTP.  
		(traiter une requête qui nous parvient, renvoyer une réponse HTML)  
	-Spring Data JPA : vise à améliorer considérablement la mise en œuvre des couches d'accès aux données en réduisant l'effort   
		au montant réellement nécessaire. En tant que développeur, vous écrivez vos interfaces de référentiel,   
		y compris les méthodes de recherche personnalisées, et Spring fournira automatiquement l'implémentation.  
	-Hibernate : comprend les mappages que nous ajoutons entre les objets et les tables.   
		Il garantit que les données sont stockées/récupérées de la base de données en fonction des mappages.  
	-H2 : une base de données intégrée, open source et en mémoire.   
		C'est un système de gestion de base de données relationnelle écrit en Java.   
		C'est une application client/serveur. Il est généralement utilisé dans les tests unitaires.  
	-DevTools : comprend un serveur LiveReload intégré qui est utilisé pour déclencher une actualisation du navigateur   
		lorsqu'une ressource est modifiée.  
	-Thymeleaf : est une bibliothèque Java open source sous licence Apache License 2.0.   
		Il s'agit d'un moteur de modèle Java côté serveur pour les environnements Web (basés sur des servlets) et non Web (hors ligne).   
		Il est parfait pour le développement Web JVM HTML5 moderne. Il offre une intégration complète avec Spring Framework.  
		(formater la réponse HTML avec Thymeleaf)  
------------------------------------------------------------------Etape 13-------------------------------------------------------------------  
1-En général, la couche controller nous permet de réceptionner la requête et fournir la réponse, donc pour paramétrer l’url d’appel  
 on utilise @GetMapping() où on spécifie le type de requête HTTP et l’URL correspondante. 
2-Nous avons choisi le fichier HTML à afficher avec le texte 'greeting' retourné car il correspond au nom du fichier HTML.  
3-@RequestParam est une annotation Spring utilisée pour lier un paramètre de requête Web à un paramètre de méthode.   
	Il comporte les éléments facultatifs suivants : defaultValue - utilisé comme solution de secours   
	lorsque le paramètre de requête n'est pas fourni ou a une valeur vide.   
	name - nom du paramètre de requête auquel se lier.  
	Donc à l’appel de l’URL racine (via le type GET, qui est utilisé par défaut dans les navigateurs),   
	la méthode greeting() sera automatiquement exécutée,   
	et Spring renverra automatiquement une réponse HTTP contenant dans son corps (donc le body HTTP) le contenu du fichier greeting.html:  
		'Hello World' si lorsque le paramètre de requête n'est pas fourni  
		'Hello Ensim' lorsqu'on fournit 'Ensim' au paramètre de requête.  
------------------------------------------------------------------Etape 17-------------------------------------------------------------------  
j'ai remarqué l'apparition de la table address et les titres des colonnes ID, CONTENT et CREATION avec leur types.  
------------------------------------------------------------------Etape 18-------------------------------------------------------------------  
l'apparition de la nouvelle table est faite grâce à la classe Address(Entity) qui est une classe représentative (correspondant à) un tableau d'une base de données.  
Les champs de cette classe répondra aux colonnes du tableau. On n'a pas utiliser le fichier de mapping car cette version de JDK fait le mapping  
à l'aide des annatations dans la classe entity.  
------------------------------------------------------------------Etape 20-------------------------------------------------------------------  
avec la requête select * from address, le contenu est affiché  
------------------------------------------------------------------Etape 23-------------------------------------------------------------------  
@Autowired est annoté sur un champ (field) pour informer Spring qui injecte (inject) de la valeur dans le champ.    
------------------------------------------------------------------Etape 30-------------------------------------------------------------------  
on ajoute webjars dans le fichier pom.xml, les ressources de données de Bootstrap seront empaquées dans le fichier Jar. et on peut les appeler  
facilement dans notre fichier html avec <link rel="stylesheet" type="text/css" th:href="@{/webjars/bootstrap/4.3.1/css/bootstrap.min.css}" />   
car on travaille avec thymeleaf    
De plus, j'ai ajouter un fichier css dans resources static pour faire des modifications.  
------------------------------------------------------------------Etape 2 TP4-------------------------------------------------------------------  
-Oui on a besoin d'une clé API pour appeler MeteoConcept    
-URL :  
https://api.meteo-concept.com/api/forecast/daily?token=(notreToken)&latlng=latitude,longitude  
-La méthode GET  
-en utilisant l'url (voir exemple dans l'url)  
-pour afficher :  
  -la température : tmin et tmax sont les température mine et max  
  -prévision : weather  
   
   
 Lien github : https://github.com/A-monaim/MAVEN_METEO.git  
 

