package main;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

@WebServlet("/listOfEmployees")
public class ListOfEmployees extends HttpServlet {
    private ArrayList<Employee> employeedata=new ArrayList<Employee>();
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        employeedata.add(new Employee(request.getParameter("name"),request.getParameter("id")));
        HttpSession session=request.getSession();
        session.setAttribute("employeedata",employeedata);

        request.getRequestDispatcher("employeeDataEntry.jsp").include(request,response);
    }
}
