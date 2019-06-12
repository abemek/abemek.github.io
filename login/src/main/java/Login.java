import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "  <style>\n" +
                "    body {font-family: Arial, Helvetica, sans-serif;}\n" +
                "    form {border: 3px solid #f1f1f1;}\n" +
                "\n" +
                "    input[type=text], input[type=password] {\n" +
                "      width: 100%;\n" +
                "      padding: 12px 20px;\n" +
                "      margin: 8px 0;\n" +
                "      display: inline-block;\n" +
                "      border: 1px solid #ccc;\n" +
                "      box-sizing: border-box;\n" +
                "    }\n" +
                "\n" +
                "    button {\n" +
                "      background-color: #4CAF50;\n" +
                "      color: white;\n" +
                "      padding: 14px 20px;\n" +
                "      margin: 8px 0;\n" +
                "      border: none;\n" +
                "      cursor: pointer;\n" +
                "      width: 100%;\n" +
                "    }\n" +
                "\n" +
                "    button:hover {\n" +
                "      opacity: 0.8;\n" +
                "    }\n" +
                "\n" +
                "    .cancelbtn {\n" +
                "      width: auto;\n" +
                "      padding: 10px 18px;\n" +
                "      background-color: #f44336;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    img.avatar {\n" +
                "      width: 40%;\n" +
                "      border-radius: 50%;\n" +
                "    }\n" +
                "\n" +
                "    .container {\n" +
                "      padding: 16px;\n" +
                "    }\n" +
                "\n" +
                "    span.psw {\n" +
                "      float: right;\n" +
                "      padding-top: 16px;\n" +
                "    }\n" +
                "\n" +
                "    /* Change styles for span and cancel button on extra small screens */\n" +
                "    @media screen and (max-width: 300px) {\n" +
                "      span.psw {\n" +
                "        display: block;\n" +
                "        float: none;\n" +
                "      }\n" +
                "      .cancelbtn {\n" +
                "        width: 100%;\n" +
                "      }\n" +
                "    }\n" +
                "    .form-container{\n" +
                "      width:500px;\n" +
                "      margin: auto\n" +
                "    }\n" +
                "    h2{\n" +
                "      text-align:center;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "\n" +
                "<div class=\"form-container\">\n" +
                "  <h2>Login Form</h2>\n" +
                "  <form action=\"/action_page.php\">\n" +
                "\n" +
                "    <div class=\"container\">\n" +
                "      <label for=\"uname\"><b>Username</b></label>\n" +
                "      <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\n" +
                "\n" +
                "      <label for=\"psw\"><b>Password</b></label>\n" +
                "      <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n" +
                "\n" +
                "      <button type=\"submit\">Login</button>\n" +
                "      <label>\n" +
                "        <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\n" +
                "      </label>\n" +
                "    </div>\n" +
                "\n" +
                "  </form>\n" +
                "  <div>\n" +
                "</body>\n" +
                "</html>");
    }
}
