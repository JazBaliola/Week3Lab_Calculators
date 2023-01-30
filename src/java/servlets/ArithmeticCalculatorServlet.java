/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jaz Baliola
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // get parameter value
        String fisrtNumText = request.getParameter("firstNum");
        String secondNumText = request.getParameter("secondNum");
        String operator = request.getParameter("operator");

        // Validate if input is not null or number
        if (fisrtNumText.equals("") || secondNumText.equals("") || !fisrtNumText.matches("[0-9]+") || !secondNumText.matches("[0-9]+")) 
        {
            
            request.setAttribute("answerResponse", "Invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                    .forward(request, response);
            return;
            
        }
        
        // parse to int
        int parsedFisrtNum = Integer.parseInt(fisrtNumText);
        int parsedSecondNum = Integer.parseInt(secondNumText);
        

        // Check for requested math operation then perform calculation
        switch (operator) {
            case "+":
                request.setAttribute("answerResponse", parsedFisrtNum + parsedSecondNum);
                break;
            case "-":
                request.setAttribute("answerResponse", parsedFisrtNum - parsedSecondNum);
                break;
            case "*":
                request.setAttribute("answerResponse", parsedFisrtNum * parsedSecondNum);
                break;
            case "%":
                request.setAttribute("answerResponse", parsedFisrtNum % parsedSecondNum);
                break;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }
}