import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CsTechSupport extends HttpServlet {

    int id = 00;

    public String ticketId(){
        id++;
        return "CsTechS-" + id;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<style>\n" +
                "input[type=text],textarea, select {\n" +
                "  width: 100%;\n" +
                "  padding: 12px 20px;\n" +
                "  margin: 8px 0;\n" +
                "  display: inline-block;\n" +
                "  border: 1px solid #ccc;\n" +
                "  border-radius: 4px;\n" +
                "  box-sizing: border-box;\n" +
                "}\n" +
                "\n" +
                "input[type=submit] {\n" +
                "  width: 100%;\n" +
                "  background-color: #4CAF50;\n" +
                "  color: white;\n" +
                "  padding: 14px 20px;\n" +
                "  margin: 8px 0;\n" +
                "  border: none;\n" +
                "  border-radius: 4px;\n" +
                "  cursor: pointer;\n" +
                "}\n" +
                "\n" +
                "input[type=submit]:hover {\n" +
                "  background-color: #45a049;\n" +
                "}\n" +
                "\n" +
                "div {\n" +
                "  border-radius: 5px;\n" +
                "  background-color: #f2f2f2;\n" +
                "  padding: 20px;\n" +
                "  width:400px;\n" +
                "  margin: 100px auto auto auto;\n" +
                "}\n" +
                "h3{\n" +
                "text-align:center\n" +
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "\n" +
                "\n" +
                "<div>\n" +
                "<h3>CsTech Support</h3>\n" +
                "  <form action=\"/cstechsupport/support\" method=\"post\">\n" +
                "    <label for=\"name\">Name</label>\n" +
                "    <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Your name..\">\n" +
                "\n" +
                "    <label for=\"email\">Email Address</label>\n" +
                "    <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Your email address..\">\n" +
                "    \n" +
                "        <label for=\"problem\">Problem</label>\n" +
                "    <input type=\"text\" id=\"problem\" name=\"problem\" placeholder=\"The problem..\">\n" +
                "    \n" +
                "    <label for=\"problem\">Problem Description</label>\n" +
                "    <textarea type=\"text\" id=\"problem\" name=\"problem\" placeholder=\"The problem..\" rows=\"10\"></textarea>\n" +
                "\n" +
                "\n" +
                "   \n" +
                "  \n" +
                "    <input type=\"submit\" value=\"Help\">\n" +
                "  </form>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n"

        );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
//        ServletContext sc = this.getServletContext();
        ServletConfig sc = this.getServletConfig();

        PrintWriter out = resp.getWriter();
        out.print(
               "<!DOCTYPE html>\n" +
                       "<html>\n" +
                       "<head>\n" +
                       "<title>Page Title</title>\n" +
                       "<style>\n" +
                       "h1{\n" +
                       "text-align:center\n" +
                       "}\n" +
                       "fieldset{\n" +
                       "    width: 500px;\n" +
                       "    border: solid 5px black;\n" +
                       "    margin: 100px auto auto auto;\n" +
                       "    font-size: 14pt;\n" +
                       "    background-color: rgb(171, 240, 171);\n" +
                       "}\n" +
                       "legend{\n" +
                       "    font-size: 20pt;\n" +
                       "    font: bolder;\n" +
                       "}\n" +
                       "</style>\n" +
                       "</head>\n" +
                       "<body>\n" +
                       "<fieldset>\n" +
                       "    <legend>Support Request Submitted</legend>\n" +
                       "    <p>Thank you! " + name + " for contacting us. We should receive reply from us with in 24 hrs in your email address "+ email +  ". Let us know in our support email "+  sc.getInitParameter("support-email") +" if you don’t receive reply within 24 hrs. Please be sure to attach your reference "+ ticketId() + " in your email.</p>\n" +
                       "</fieldset>\n" +
                       "\n" +
                       "\n" +
                       "</body>\n" +
                       "</html>"
        );

    }






}
