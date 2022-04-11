import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session=request.getSession();

        session.removeAttribute("name");
        session.invalidate();
        Cookie cookie=new Cookie("name","");

        response.setHeader("Access-Control-Allow-Methods", "POST");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type");
        response.setHeader("Access-Control-Max-Age", "86400");
//        cookie.setMaxAge(0);
//        response.addCookie(cookie);
        PrintWriter pw=response.getWriter();
        pw.println("adhfaindfj");


    }
}
