<%-- 
    Document   : delete_check
    Created on : 2017/02/08, 4:14:18
    Author     : g031n047
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<jsp:useBean id="info" scope="session" class="ex13.FileDB" />

<% /* エンコード */
    request.setCharacterEncoding("UTF-8");

    /* 変数の宣言　*/
    String code = "";
    int code1 = 0;

    /* パラメータの取得 */
    if (request.getParameter("code") != null) {
        code = request.getParameter("code");
        code1 =Integer.parseInt(code);
    }

 /* データ一覧の取得メソッド */
    try {
        info.delete(code1);
        info.dataload();
%>
<jsp:forward page="delete.jsp" />
<%
} catch (Exception e) {
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./style.css">
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
