<%-- 
    Document   : delete
    Created on : 2017/02/06, 23:10:10
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
        <div class="kukan">
            <section class="wrap">
                <header><h1 class="title_pos">空売り残高を知ろう</h1></header>
                <nav>
                    <h2 class="title_pos">メニュー</h2>
                    <ul>
                        <li><a href="registration_page.jsp">銘柄登録</a></li>
                        <li><a href="info_detail.jsp">登録情報</a></li>
                        <li><a href="delete.jsp">登録削除</a></li>
                        <li><a href="all_check.jsp">銘柄一覧</a></li>
                    </ul>
                </nav>
            </section>
            <section class="wrap2">
                <h2 class="title_pos">登録削除</h2>
                <article>
                    <table class="mdl-data-table mdl-js-data-table">
                        データ件数：<%= info.getNum()%>
                        <thead>
                            <tr class="column_pos">
                                <th class="mdl-data-table__cell--non-numeric">銘柄コード</th>
                                <th>銘柄名</th>
                                <th>登録日</th>
                                <th>削除</th>
                            </tr>
                        </thead>
                        <tbody>
                        <form method="post">
                            <% for (int i = 0; i < info.getNum(); i++) {%>
                            <tr class="column_pos"><td><%= info.getCamId(i)%></td>
                                <td><div><%= info.getCamName(i)%></div></td>                     
                                <td><%= info.getDate(i)%></td>
                                <td><button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect" type="submit" formaction="/Web/ex13/delete_check.jsp?code=<%= info.getCamId(i)%>"><i class="material-icons">削除</i></button></td></tr>
                                <% }%>
                        </form>
                        </tbody>
                    </table>
                </article>
            </section>
        </div>
    </body>
</html>
