package com.example;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hellom")  // URL pattern
public class ComeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

                //protected overrides and donot expose everything
                // You override doGet() to handle GET requests with your own logic, 
                //instead of using the default behavior in HttpServlet.
        
        // Set response content type
        response.setContentType("text/html");
        
        // Write HTML response
        PrintWriter out = response.getWriter(); //response is HTTP servlet response
        // getWriter(): method of HTTPServletResponse that returns a PrintWriter object
        // printwriter(): character based output stream, useful for sending text based content
        //once you get printwriter object you can use it to write content that will be sent as a part of http response
        out.println("<html><body>");
        out.println("<h1>Hello, Worldsn!</h1>");
        out.println("</body></html>");
        // request.getRequestDispatcher("/hellom.jsp").forward(request, response);

    }
}
