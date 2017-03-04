<%-- 
    Document   : login
    Created on : Mar 2, 2017, 6:41:47 PM
    Author     : winsonso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Please Login</h1>
        <form method="post" action="login">
            <label for="txtName">Username:</label>
            <input type="text" id="txtUsername" name="txtUsername"></input>
            <br />
            <label for="txtName">Password:</label>
            <input type="password" id="txtPassword" name="txtPassword"></input>
            <br />
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
