<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edytuj istotę</title>
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

<!-- <p><i><b>Wszystkie pola w formularzu muszą być wypełnione.</b></i></p><br> -->

<form method="POST" action="CreatureController">
  Nazwa:<input type="text" name="name" value="${creature.name}" readonly="readonly"/><br /> <br>
  Gatunek:<input type="text"  name="type" value="${creature.type}" required/><br /> <br>
  Moc:<input type="text"  name="power" value="${creature.power}" required/><br /> <br>
  <input type="submit" value=" Zatwierdź ">
  <input onclick="window.location.href='CreatureController?action=showAll'" type="button" value="Wyświetl wszystko"/>
</form> 

</body>
</html>