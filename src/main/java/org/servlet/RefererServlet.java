package org.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RefererServlet")
public class RefererServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referer = request.getHeader("referer");
        String sitePart = "http://" + request.getServerName();
        if (referer == null || !referer.startsWith(sitePart)) {
            response.sendRedirect("/test2_war_exploded/404-not-found.jsp");
            return;
        }
        response.setContentType("text/html;charset=utf-8");
        String str = "利用Referer头字段实现防盗链";
        response.getWriter().write(str);
    }
}
