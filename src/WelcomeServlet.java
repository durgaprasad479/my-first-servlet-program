import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String paramValue = req.getParameter("name");
        String age = req.getParameter("age");
        int ageNumber = new Integer(age);
        writer.println("<h1>Hello ::"+paramValue+"</h1>");
        if(ageNumber<30)
        {
            writer.println("<h1> Hi Young Boy</h1>");
        }else
        {
            writer.println("<h1> Hi Old Men</h1>");
        }
    }

}
