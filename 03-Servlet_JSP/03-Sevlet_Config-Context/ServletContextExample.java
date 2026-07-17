package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ContextExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //  Get global context
        ServletContext context = getServletContext();

        String appName = context.getInitParameter("appName");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>ServletContext App Name: " + appName + "</h2>");
    }
}
