<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book registration confirmation</title>
</head>
<body>
	<h1>You successfully registered a new book</h1> <br> 
    <table> 
        <tr> 
            <td>Author</td> 
            <td>${BOOK.author}</td> 
        </tr> 
        <tr> 
            <td>Title</td> 
            <td>${BOOK.title}</td> 
        </tr> 
        <tr> 
            <td>Price</td> 
            <td>${BOOK.price}</td> 
        </tr> 
        <tr> 
            <td>Year</td> 
            <td>${BOOK.year}</td> 
        </tr> 
    </table>
</body>
</html>