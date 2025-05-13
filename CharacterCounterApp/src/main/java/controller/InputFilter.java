package controller;

import jakarta.servlet.*;

import java.io.IOException;

public class InputFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        String input = request.getParameter("inputString");
        if (input == null || input.trim().isEmpty()) {
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("<h3>Chuỗi không được để trống!</h3><a href='index.html'>Quay lại</a>");
        } else {
            chain.doFilter(request, response);
        }
    }
}
