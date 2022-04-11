
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Set</title>
</head>
<body>
<jsp:useBean id="employee" class="main.Employee" scope="page"/>
<jsp:setProperty name="employee" property="*"/>
<jsp:getProperty name="employee" property="id"/>
<jsp:getProperty name="employee" property="name"/>
<jsp:include page="employeeDataEntry.jsp"/>
</body>
</html>