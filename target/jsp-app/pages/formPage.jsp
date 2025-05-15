<%@ page contentType="text/html; charset=ISO-8859-1" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form Page</title>
</head>
<body>
    <h2>Enter your details</h2>
    <form action="forms" method="post">
        Name: <input type="text" name="name" required><br>
        Phone Number: <input type="text" name="phone" required><br>
        Gender: 
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Female"> Female<br>
        Programming Languages: <br>
        <input type="checkbox" name="language" value="Java"> Java
        <input type="checkbox" name="language" value="Python"> Python
        <input type="checkbox" name="language" value="JavaScript"> JavaScript<br>
        Duration of Course: 
        <select name="duration">
            <option value="6 months">6 months</option>
            <option value="1 year">1 year</option>
        </select><br>
        Comments: <textarea name="comment"></textarea><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
