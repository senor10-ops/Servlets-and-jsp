package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mylogin")
public class Form  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email =  req.getParameter("name1");
        String password=   req.getParameter("pass");


        if(email.equals("ashwin123@gmail.com") && password.equals("hari")){
            System.out.print("success");

        }
        else{
            System.out.println("failed");
        }


    }
}
