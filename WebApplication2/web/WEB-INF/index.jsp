<%-- 
    Document   : index
    Created on : 14/11/2018, 12:00:41 AM
    Author     : tekol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv= "Content-Type"
			content = "text/html; charset = UTF-8">
	<Title> Conversion grados C <--> F </title>
	</head>

	<body> 
	<div align = "center">
	<!-- Invocar al servicio web -->
        <%
        String sctGrados = request.getParameter("ctGrados");
        if (sctGrados != null && !sctGrados.isEmpty())
        {
           double nGrados = 0.0;
            }
        %>
		<hr/>
		<form style = "font-familly:arial">
			Grados: <br>
		<input type = "text" name ="ctGrados" value ="$(result)"
			style = "text-align:right" /> <br><br>

		<input type = "submit" value ="Convertir" name ="btConvertir" />
		<br><br>

		<input type = "radio" name="bgGrados" value="aFahr" checked="true" />

		Centigrados a Fahrenheit <br>

		<input type = "radio" name = "bgGrados" value ="aCent" />

		Fahrenheit a Centigrados <br>

	</form>
	<hr/>
	</div>
	</body>
</html>
