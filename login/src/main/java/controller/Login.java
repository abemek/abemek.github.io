package controller;

import MockDB.MockDb;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("")
public class Login extends HttpServlet {

    MockDb mockDb = new MockDb();

    String error = "";
    String userName = "";
    String password = "";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        for (Cookie cookie : req.getCookies()) {
            if (cookie.getName().equals("uname")) {
                userName = cookie.getValue();
                System.out.println(userName);
            }
        }
        resp.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("uname");
        String password = req.getParameter("psw");
        PrintWriter out = resp.getWriter();
        MockDb mockDb = new MockDb();
        for(User user : mockDb.getUsers()){
            if(userName.equals(user.getUserName()) && password.equals(user.getPassword())){
                error = "";
                if(req.getParameter("remember") != null){
                    Cookie cookie = new Cookie("uname", userName);
                    cookie.setMaxAge(30*24*60*60);
                    resp.addCookie(cookie);
                }
                if(req.getParameter("remember") == null){
                    Cookie cookie = new Cookie("uname", null);
                    cookie.setMaxAge(0);
                    resp.addCookie(cookie);
                }
                HttpSession session = req.getSession();
                session.setAttribute("uname", userName);
                resp.sendRedirect("welcome.jsp");
            }else{
                error = "Username or Password is Incorrect!";
                resp.sendRedirect("login.jsp");
            }
        }

    }
}
