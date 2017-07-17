<%-- 
    Document   : 3
    Created on : 2017/01/20, 19:02:28
    Author     : g031n047
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="file" scope="session" class="pr12.FileDB" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>画像の表示</title>
    </head>
    <body>
        <header>
            <h1>画像の表示</h1>
        </header>
        <article>
            データ件数：<%= file.getNum()%>
            <table border="1">
                <tr><th>ファイル名</th><th>サムネイル</th></tr>
                        <% for (int i = 0; i < file.getNum(); i++) {%>
                <tr><td><%= file.getName(i)%></td><td><img src="<%= "./img/" + file.getName(i)%>" alt="<%= file.getName(i)%>" width="50"/></td></tr>
                        <% }%>
            </table>

        </article>
    </body>
</html>