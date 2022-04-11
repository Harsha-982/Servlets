package FilterPack;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = {"/servlet/*"})
public class ServletFilter implements Filter {
    public void init(FilterConfig arg0) throws ServletException {}
    int count = 0;
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        PrintWriter out=response.getWriter();

        // filter gets invoked at preprocessing of a servlet and post processing of a servlet

        out.println("filter is invoked before ");// 1 st
        out.print("<br/>Total visitors "+(++count));// -- counts the number of item that we access this page

        chain.doFilter(request,response);
//        out.println("invoked after resource");// 4 rd
    }

    public void destroy() {

    }
}
