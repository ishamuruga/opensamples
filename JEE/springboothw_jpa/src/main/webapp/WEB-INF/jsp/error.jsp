<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "frm"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <style>
            .error {
                color: #ff0000;
                font-style: italic;
                font-weight: bold;
            }
            </style>
    </head>
<body>
<h1 class="error">Oops.,Error has occured</h1>
<h4>${message}</h4>
</body>
</html>