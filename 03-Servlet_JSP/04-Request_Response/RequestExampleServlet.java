package Servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class RequestExampleServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //  Get data from form
        String name = request.getParameter("username");

        //  Set attribute (optional)
        request.setAttribute("user", name);

        // Forward to another servlet or JSP
        request.getRequestDispatcher("response").forward(request, response);
    }
}
