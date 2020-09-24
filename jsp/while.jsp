<%! int fontSize; %>
<html>
<head><title>WHILE LOOP EXAMPLE</title></head>
<body>
<%while (fontSize<=7) {%>
<font color="green" size="<%=fontSize%>">
JSP TUTORIAL
</font><br/>
<%fontSize++; %>
<%}%>
</body>
</html>