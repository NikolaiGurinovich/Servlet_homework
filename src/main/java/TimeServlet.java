import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

@WebServlet(value = "/time-servlet")
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String nameFormURL = req.getParameter("city");
        PrintWriter writer = resp.getWriter();
        if (nameFormURL != null) {
            if (nameFormURL.equals("minsk")) {
                writer.println("Minsk time: " + LocalTime.now());
                writer.close();
            } else if (nameFormURL.equals("washington")) {
                writer.println("Washington time: " + LocalTime.now().minusHours(8));
                writer.close();
            } else if (nameFormURL.equals("beijing")) {
                writer.println("Beijing time: " + LocalTime.now().plusHours(5));
                writer.close();
            }
        } else {
            writer.println("Time Servlet");
        }
    }
}
