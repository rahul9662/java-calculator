package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CalculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get parameters from request (numbers and operator)
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operator = request.getParameter("operator");
        
        double result = 0;

        if (num1Str != null && num2Str != null && operator != null) {
            try {
                double num1 = Double.parseDouble(num1Str);
                double num2 = Double.parseDouble(num2Str);

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            result = Double.NaN; // Handle division by zero
                        }
                        break;
                }
            } catch (NumberFormatException e) {
                result = Double.NaN; // Handle invalid input
            }
        }

        // Set result as an attribute to display in the JSP
        request.setAttribute("result", result);
        // Forward the request to index.jsp for rendering
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}
