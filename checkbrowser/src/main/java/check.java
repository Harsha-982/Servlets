import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class check extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        HttpSession session =request.getSession();
        session.setAttribute("name","harsha");
        Cookie c=new Cookie("name","harsha");
        response.addCookie(c);
        request.getRequestDispatcher("/servlet").forward(request,response);
    }
}
