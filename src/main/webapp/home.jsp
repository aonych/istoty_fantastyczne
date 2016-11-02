<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

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
	    wszystkich postaci, usuwać je, dodawać nowe oraz edytować istniejące.</p><br><br>
	    <a href="CreatureController?action=add"><input type="button" value="Dodaj"/></a><br><br>
	    <a href="CreatureController?action=showAll"><input type="button" value="Wyświetl wszystko"/></a><br><br>
    </body>
    
</html>
