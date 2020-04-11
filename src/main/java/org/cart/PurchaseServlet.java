package org.cart;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class PurchaseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        if (id == null) {
            String url = req.getContextPath() + "/lbservlet";
            resp.sendRedirect(url);
            return;
        }
        Book book = BookDB.getBook(id);
        HttpSession session = req.getSession();
        List<Book> cart = (List<Book>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }
        cart.add(book);
        Cookie cookie = new Cookie("JSESSIONID", URLEncoder.encode(session.getId(), StandardCharsets.UTF_8));
        cookie.setMaxAge(60 * 30);
        cookie.setPath("/lbservlet");
        resp.addCookie(cookie);
        String url = req.getContextPath() + "/ctservlet";
        resp.sendRedirect(url);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
