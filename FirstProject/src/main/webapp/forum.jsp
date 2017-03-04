<%-- 
    Document   : forum
    Created on : Mar 3, 2017, 11:46:49 AM
    Author     : winsonso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Discussion Forum</title>
    </head>
    <body>
        <h1>Discussion Forum</h1>
        <h2>Welcome ${username}!</h2>
        <textarea name ="post" form ="postform" placeholder="Enter new post here ..."></textarea>
        <form method="post" action="makePost" id ="postform" >
        <input type="hidden" name="txtUsername" value = ${username} ><br>

        <input type="submit" value="Submit Post"> </form>
        <a href=getPost>Click here to view post</a>
    </body>
</html>
