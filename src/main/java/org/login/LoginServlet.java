package org.login;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("check_code");
        String savedCode = (String) req.getSession().getAttribute("check_code");
        PrintWriter out = resp.getWriter();

        if (("itcast").equals(username) && ("123").equals(password) && checkCode.equals(savedCode)) {
            User user = new User();
            user.setPassword(password);
            user.setUsername(username);
            req.getSession().setAttribute("user", user);
            resp.sendRedirect(req.getContextPath() + "/indexservlet");
        } else if (checkCode.equals(savedCode)) {
            out.write("用户名或密码错误，登录失败<br />");
            out.write("<a href='" + req.getContextPath() + "/logoutservlet'>返回登陆界面</a>");
        } else {
            out.write("验证码错误");
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        this.doGet(req, resp);
    }
}
