package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class CountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String input = request.getParameter("inputString");
        int count = input.length();

        HttpSession session = request.getSession();
        session.setAttribute("inputString", input);

        request.setAttribute("count", count);
        request.setAttribute("input", input);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
