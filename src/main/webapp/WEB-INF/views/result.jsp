<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Результат</title>
</head>
<body>
    <table>
        <caption>${operation.type.toString()}</caption>
        <tbody>
            <tr>
                <th>one</th>
                <td>${operation.one}</td>
            </tr>
            <tr>
                <th>two</th>
                <td>${operation.two}</td>
            </tr>
            <tr>
                <th>Результат</th>
                <td>${operation.textResult}</td>
            </tr>
        </tbody>
    </table>
</body>
</html>