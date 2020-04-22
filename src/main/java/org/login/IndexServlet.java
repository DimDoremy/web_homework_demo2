package org.login;

import javax.servlet.http.*;
import java.io.IOException;

public class IndexServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        //System.out.println(user.toString());
        if (user == null) {
            resp.getWriter().print("您还没有登录，请<a href='" + req.getContextPath() + "/login.jsp'>登录</a>");
        } else {
            resp.getWriter().print("您已登录，欢迎你，" + user.getUsername() + "! ");
            resp.getWriter().print("<a href='" + req.getContextPath() + "/logoutservlet'>退出</a>");
            Cookie cookie = new Cookie("JSESSIONID", session.getId());
            cookie.setMaxAge(60 * 30);
            cookie.setPath(req.getContextPath());
            resp.addCookie(cookie);
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.doGet(req, resp);
    }
}
