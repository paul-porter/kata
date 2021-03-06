
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;


public class HelloWorld extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HelloService service = new HelloService();
        WeatherParser parser = new WeatherParser();
        WeatherService wService = new WeatherService();

        List<WeatherDay> days = parser.getData();
        WeatherDay day = wService.findSmallestSpread(days);


        resp.getWriter().print("Day Number : " + day.getDayNumber() + " Max Temp: " + day.getMaxTemp() + " Min Temp: " + day.getMinTemp() + "\n");
    }

    public static void main(String[] args) throws Exception{
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new HelloWorld()),"/*");
        server.start();
        server.join();
    }
}
