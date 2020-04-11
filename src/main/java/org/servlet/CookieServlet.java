package org.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "CookieServlet")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date date = new Date();
        request.setCharacterEncoding("utf-8");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String currentTime = format.format(date);
        Cookie cookie = new Cookie("lastAccessTime", URLEncoder.encode(currentTime, StandardCharsets.UTF_8));
        cookie.setMaxAge(60 * 60 * 24); // Cookie保持时间
        response.addCookie(cookie);
        String lastAccessTime = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie co : cookies) {
                if ("lastAccessTime".equals(co.getName())) {
                    lastAccessTime = co.getValue();
                }
            }
        }
        response.setContentType("text/html;charset=utf-8");
        if (lastAccessTime == null) {
            response.getWriter().write("您今天的第一次访问");
        } else {
            response.getWriter().write("您上次的访问时间为：" + lastAccessTime);
        }
    }
}
