package com.example.FilterConfigTest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class MyFilter implements Filter{
    FilterConfig config;
    static int count=0;
    public void init(FilterConfig config) throws ServletException {
        this.config=config;
    }

    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {

        PrintWriter out=resp.getWriter();

        String s=config.getInitParameter("construction");

        if(s.equals("yes")){
            out.print("This page is under construction");
        }
        else{
            long before=System.currentTimeMillis();
            chain.doFilter(req, resp);//sends request to next resource

            out.print("<br/>Total visitors "+(++count));
            long after=System.currentTimeMillis();
            out.print("<br/>Total response time "+(after-before)+" miliseconds");}
    }
    public void destroy() {}
}
