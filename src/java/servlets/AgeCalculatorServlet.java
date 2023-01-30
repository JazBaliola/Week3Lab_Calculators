/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jaz Baliola
 */
public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // get parameter value
        String ageText = request.getParameter("age");

        // check if age is null
        if(ageText == null || ageText.equals("")) {
            
            request.setAttribute("responseMessage", "You must give your current age");

            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                    .forward(request, response);
            return;
            
        }
        
        // check if age is not number
        if(!ageText.matches("[0-9]+")) {
            
            request.setAttribute("responseMessage", "You must enter a number");
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                    .forward(request, response);
            return;
            
        }
            
        // parse to int
        int parsedAge = Integer.parseInt(ageText);
        // increment age by 1
        parsedAge++;
        
        request.setAttribute("responseMessage", "Your age next birthday will be " + parsedAge);

        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
        
    }

}
