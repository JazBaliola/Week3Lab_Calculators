<%-- 
    Document   : agecalculator
    Created on : Jan 29, 2023, 6:45:59 PM
    Author     : Jaz Baliola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="POST">
            
            <label for="age">Enter your age: </label>
            <input id="age" name="age" type="text" placeholder="Input your age"><br>
            
            <input type="submit" value="Submit"><br>
            
            <p>${responseMessage}</p>
            
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
