package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ConfigExampleServlet extends HttpServlet {

    private String message;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        // 🔹 Get init parameter from web.xml
        message = config.getInitParameter("message");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>ServletConfig Message: " + message + "</h2>");
    }
}
