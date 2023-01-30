<%-- 
    Document   : arithmeticCalculator
    Created on : Jan 29, 2023, 7:08:59 PM
    Author     : Jaz Baliola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action = "arithmetic" method="post"> 

            <label for="firstNum">First: </label>
            <input id="firstNum" type="text" name ="firstNum"><br>
            
            <label for="secondNum">Second: </label>
            <input id="secondNum" type="text" name ="secondNum"><br>
            
            <input type="Submit" name="operator" value ="+">  
            <input type="Submit" name="operator" value ="-">  
            <input type="Submit" name="operator" value ="*">  
            <input type="Submit" name="operator" value ="%">  

            <p>Result: ${answerResponse}</p>

            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
