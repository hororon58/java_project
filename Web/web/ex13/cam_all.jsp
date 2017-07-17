<%-- 
    Document   : cam_all
    Created on : 2017/02/08, 16:28:22
    Author     : g031n047
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="info" scope="session" class="ex13.FileDB" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>空売り残高を知ろう</title>
        <link rel="stylesheet" href="css/material.min.css">
        <script src="js/material.min.js"></script>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.teal-green.min.css" />
        <link rel="stylesheet" href="css/style.css">
        <script src="js/script.js"></script>
    </head>
    <body>
        <section class="wrap">
            <header><h1 class="title_pos">空売り残高を知ろう</h1></header>
            <nav>
                <h2 class="title_pos">メニュー</h2>
                <ul>
                 <li><a href="registration_page.jsp">銘柄登録</a></li>
                <li><a href="code_check.jsp">登録情報</a></li>
                <li><a href="delete_check.jsp">登録削除</a></li>
                <li><a href="all_check.jsp">銘柄一覧</a></li>
                </ul>
            </nav>
        </section>
        <section class="wrap2">
            <h2 class="title_pos">銘柄一覧</h2>
            <article class="art_pos">
                データ件数：<%= info.getNum()%>
                <table class="mdl-data-table mdl-js-data-table">
                    <thead>
                        <tr class="column_pos">
                            <th class="mdl-data-table__cell--non-numeric">銘柄コード</th>
                            <th>銘柄名</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (int i = 0; i < info.getNum(); i++) {%>
                        <tr class="column_pos"><td><a href="/Web/ex13/information.jsp?code=<%= info.getCamId(i)%>"><%= info.getCamId(i)%></a></td>
                            <td><a href="http://stocks.finance.yahoo.co.jp/stocks/detail/?code=<%= info.getCamId(i)%>"><%= info.getCamName(i)%></a></td></tr>
                                <% }%>
                    </tbody>
                </table>
            </article>
        </section>
    </body>
</html>
