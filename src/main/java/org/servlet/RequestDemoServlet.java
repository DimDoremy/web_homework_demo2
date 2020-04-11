package org.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RequestDemoServlet")
public class RequestDemoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        out.println(request.getMethod());
        out.println(request.getRequestURL());
        out.println(request.getRequestURI());
        out.println(request.getContextPath());
        out.println(request.getQueryString());
        out.println(request.getProtocol());
        out.println(request.getPathInfo());
        out.println(request.getPathTranslated());
        out.println(request.getServletPath());
        out.println(request.getRemoteAddr());
        out.println(request.getRemoteHost());
        out.println(request.getRemotePort());
        out.println(request.getLocalAddr());
        out.println(request.getLocalName());
        out.println(request.getLocalPort());
        out.println(request.getScheme());
    }
}
