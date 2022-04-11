<%@ page import="java.util.Enumeration" %>
<%@ page import="main.Employee" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>list of products</title>
  </head>
  <body>
  <form action="/listOfEmployees">
    Name:<input type="text" name="name">
    Id:<input type="text" name="id">
    <input type="submit">
  </form>
  <%
    Enumeration s=session.getAttributeNames();
    while (s.hasMoreElements()){
      String o=s.nextElement().toString();
      ArrayList<Employee> s1= (ArrayList) session.getAttribute(o);

        for (Employee list : s1) {
  %>
  <ol>
    <li>
      <%=list.getName()%>
      <%=list.getId()%>
    </li>
  </ol>
    <%
          }

      }
    %>
  </body>
</html>
