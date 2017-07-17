<%-- 
    Document   : registration_page
    Created on : 2017/02/03, 20:44:53
    Author     : g031n047
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <section class="wrap3">
            <h2 class="title_pos">銘柄登録</h2>
            <article>
                <div class="table">
                <form action="code_check.jsp" method="post">
                    <div class="mdl-textfield mdl-js-textfield">
                        <input class="mdl-textfield__input" type="text" id="boxsize" size="60" name="code">
                        <label class="mdl-textfield__label" for="boxsize">銘柄コード</label>
                    </div>
                    <button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect" type="submit"><i class="material-icons">送信</i></button></br>
                </form>
                </div>
            </article>
        </section>
    </body>
</html>
