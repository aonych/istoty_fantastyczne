<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supernatural</title>
        <style>

			html,body{
				margin: 0;
				text-align: center;
  				padding: 2em;
				font-family: Verdana;
				font-size: 12px;
				background-color: #D3C9E0;
				color: #1E0340;
			}			

		</style>
    </head>
    
    <body>
	    <h2>Witaj w świecie istot fantastycznych!</h2>
	    <p>Znajdziesz tu bazę danych istot nie z tego świata. Możesz zobaczyć listę 
	    wszystkich postaci, usuwać je, dodawać nowe oraz edytować istniejące. Dodatkowo możesz zobaczyć listę przykładowych 
	    gatunków fantastycznych stworzeń oraz rozwiązać quiz. Udanej zabawy. :)</p><br><br>
	    <input onclick="window.location.href='CreatureController?action=add'" type="button" value="Dodaj"/><br><br>
	    <input onclick="window.location.href='CreatureController?action=showAll'" type="button" value="Wyświetl wszystko"/><br><br>
	    <p><a href="types">Zobacz listę gatunków</a></p>
	    <p><a href="quiz">Rozwiąż quiz</a></p>
    </body>
    
</html>
