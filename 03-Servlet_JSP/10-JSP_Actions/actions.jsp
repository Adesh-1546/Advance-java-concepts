<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Actions</title>
</head>
<body>

<h2>JSP Action Tags Example</h2>

<!-- 🔹 Include another JSP (runtime) -->
<jsp:include page="included.jsp" />

<br>

<!-- 🔹 Forward to another JSP -->
<%
    String user = request.getParameter("user");
    if (user != null) {
%>
    <jsp:forward page="included.jsp">
        <jsp:param name="name" value="<%= user %>" />
    </jsp:forward>
<%
    }
%>

</body>
</html>
