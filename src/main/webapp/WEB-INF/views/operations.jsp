<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Історія операцій</title>
</head>
<body>
    <table>
        <caption>Останні операції (остання - внизу)</caption>
        <tbody>
            <c:forEach var="operation" items="${list}">
                <tr>
                    <td>${operation.toString()}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
