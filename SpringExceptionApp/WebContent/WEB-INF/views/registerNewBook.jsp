<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register new book</title>
</head>
<body>
	<h1>Register new book</h1><br /> 
<form:form name="validationDemoForm" commandName="BOOK"> 
    <table> 
        <tr> 
            <td colspan="2"> 
                <form:errors path="*" cssStyle="color : red;"/> 
            </td> 
        </tr> 
        <tr><td>Author</td><td><form:input path="author" /></td></tr> 
        <tr><td>Title</td><td><form:input path="title" /></td></tr> 
        <tr><td>Price</td><td><form:input path="price" /></td></tr> 
        <tr> 
            <td>Year</td> 
            <td> 
                <form:select path="year"> 
                    <form:option value="2005"/>
                    <form:option value="2006"/> 
                    <form:option value="2007"/> 
                    <form:option value="2008"/> 
                </form:select> 
            </td> 
        </tr> 
        <tr><td colspan="2"><input type="submit" value="Save Changes" /></td></tr> 
    </table> 
</form:form> 

</body>
</html>