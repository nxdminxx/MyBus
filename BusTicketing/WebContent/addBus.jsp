<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>Add Bus</title>
</head>
<body>
    <h2>Add Bus</h2>
    <form action="AddBusServlet" method="post">
        Origin: <input type="text" name="origin"><br>
        Destination: <input type="text" name="destination"><br>
        Fare: <input type="text" name="fare"><br>
        Departure Time: <input type="text" name="departureTime"><br>
        <input type="submit" value="Add Bus">
    </form>
</body>
</html>