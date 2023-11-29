<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<body>

    <div class="container mt-5">
        <div class="card">
            <div class="card-body">
                <h2 class="card-title text-center">Book a Ticket Now!</h2>
                
                <form action="<c:url value='/SearchBusServlet' />" method="post">
			        <label for="origin">Origin:</label>
			        <input type="text" id="origin" name="origin" required>
			
			        <label for="destination">Destination:</label>
			        <input type="text" id="destination" name="destination" required>
			
			        <button type="submit">Search Buses</button>
			    </form>
            </div>
        </div>
    </div>
    
</body>
</html>