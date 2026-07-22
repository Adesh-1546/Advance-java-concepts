package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class SessionExampleServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");

        //  Create session
        HttpSession session = request.getSession();
        session.setAttribute("user", name);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Welcome " + name + "</h2>");
        out.println("<a href='profile'>Go to Profile</a>");
    }
}
