<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.model.MockData" %>
<%@ page import="com.model.Schedule" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bus List</title>
</head>
<body>
    <h2>Bus List</h2>
    <table border="1">
        <tr>
            <th>Bus ID</th>
            <th>Origin</th>
            <th>Destination</th>
            <th>Fare</th>
            <th>Departure Time</th>
        </tr>
        <c:forEach var="bus" items="${busList}">
            <tr>
                <td>${bus.id}</td>
                <td>${bus.origin}</td>
                <td>${bus.destination}</td>
                <td>${bus.fare}</td>
                <td>${bus.departureTime}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
