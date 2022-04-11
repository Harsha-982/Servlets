import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/inactive")
public class inactive extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        response.setHeader("Refresh","10;URL=index.jsp");
        PrintWriter pw=response.getWriter();
        Thread t=new Thread();
        for(int i=0;i<6;i++) {
            try {
                t.sleep(360);
                pw.print("hi");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        HttpSession s=request.getSession();
        s.setMaxInactiveInterval(10);
        s.setAttribute("name","harsha");
        if(s.getAttribute("name").equals("harsha")){
//            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
        pw.println("harsha");

    }
}
