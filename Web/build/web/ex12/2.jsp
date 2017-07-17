<%-- 
    Document   : 2
    Created on : 2017/01/20, 19:02:23
    Author     : g031n047
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<jsp:useBean id="file" scope="session" class="pr12.FileDB" />

<% /* エンコード */

 /* データ一覧の取得メソッド */
    try {
        file.dataload();
%>
<jsp:forward page="3.jsp" />
<%
} catch (Exception e) {
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>エラーの表示</title>
    </head>
    <body>
        <header>
            <h1>エラーの表示</h1>
        </header>
        <article>
            データベースに接続できませんでした。
        </article>
    </body>
</html>

<%
    }
%>
