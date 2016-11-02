<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Creature"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pokaż wszystkie istoty</title>
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
			
			table{
				width: 50%;
				margin: 0 auto;
			}	

		</style>
</head>
<body>

<!-- <jsp:useBean id="db" class="db.DataStorage" scope="application" /> -->
<jsp:useBean id="creature" class="model.Creature" scope="session" /> 
<jsp:setProperty name="creature" property="*" />    

<p>Ostatnio dodana istota fantastyczna: <b><i><jsp:getProperty property="name" name="creature"/></i></b></p>

<table>
        <thead>
            <tr >
                <th>Nazwa</th>
                <th>Gatunek</th>
                <th>Moc</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${creatures}" var="creature">
            	<tr>
                    <td><c:out value="${creature.name}" /></td>
                    <td><c:out value="${creature.type}" /></td>
                    <td><c:out value="${creature.power}" /></td>
                    <td><a href="CreatureController?action=edit&name=<c:out value="${creature.name}"/>&type=<c:out value="${creature.type}"/>&power=<c:out value="${creature.power}"/>">Edytuj</a></td>
                    <td><a onclick="return confirm('Na pewno chcesz usunąć rekord?')" 
                    href="CreatureController?action=delete&name= <c:out value="${creature.name}"/>">Usuń</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

<p>
  <a href="CreatureController?action=add"><input type="button" value="Dodaj"/></a>
  <a href="home.jsp"><input type="button" value="Wróć"/></a>
</p>

</body>
</html>