import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

@WebServlet(value = "/age-servlet")
public class AgeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String ageFormURL = req.getParameter("age");
        PrintWriter writer = resp.getWriter();
        if (ageFormURL != null ) {
            if (Integer.parseInt(ageFormURL) < 18) {
                writer.println("Вы не совершеннолетний");
                writer.close();
            } else if (Integer.parseInt(ageFormURL) >= 18) {
                writer.println("Вы совершеннолетний");
                writer.close();
            }
        } else {
            writer.println("Age Servlet");
        }
    }
}
