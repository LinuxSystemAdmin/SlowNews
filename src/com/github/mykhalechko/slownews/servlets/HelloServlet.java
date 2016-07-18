package com.github.mykhalechko.slownews.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nextJsp = "/WEB-INF/jsp/hello.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJsp);
        dispatcher.forward(request, response);
    }
}
