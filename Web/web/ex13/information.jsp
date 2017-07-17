<%-- 
    Document   : information
    Created on : 2017/02/06, 22:31:47
    Author     : g031n047
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="reg" scope="session" class="ex13.FileDB2" />
<jsp:useBean id="rig" scope="session" class="ex13.GetTag" />
<% /* エンコード */

    request.setCharacterEncoding("UTF-8");
    /* 変数の宣言　*/
    String code = "";
    String name = "";
    String date = "";
    int code1 = 0;

    /* パラメータの取得 */
    if (request.getParameter("code") != null) {
        code1 = Integer.parseInt(request.getParameter("code"));
        reg.dataload(code1);
    } else if (request.getParameter("name") != null) {
        name = request.getParameter("name");
        reg.dataload(name);
    } else if (request.getParameter("date") != null) {
        date = request.getParameter("date");
        reg.dataload2(date);
    }

    /* データ一覧の取得メソッド */

%>
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
        <h2 class="title_pos">空売り情報</h2>
        <div>データ件数：<%= reg.getNum()%></div>
        <article class="art_pos">
            <table class="mdl-data-table mdl-js-data-table">
                <thead>
                    <tr class="column_pos">
                        <th class="mdl-data-table__cell--non-numeric-center">銘柄コード</th>
                        <th>銘柄名</th>
                        <th>空売り機関</th>
                        <th>空売り残高割合</th>
                        <th>空売り残高数</th>
                        <th>空売り日</th>
                        <th>備考</th>
                    </tr>
                </thead>
                <tbody class="text_pos2">
                    <% for (int i = 0; i < reg.getNum(); i++) {%>
                    <tr class="column_pos"><td><a href="/Web/ex13/information.jsp?code=<%= reg.getCamId(i)%>"><%= reg.getCamId(i)%></a></td>
                        <td><a href="http://stocks.finance.yahoo.co.jp/stocks/detail/?code=<%= reg.getCamId(i)%>"><%= reg.getCamName(i)%></a></td>
                        <td><div><a href="/Web/ex13/information.jsp?name='<%= reg.getSsCam(i)%>'"><%= reg.getSsCam(i)%></a></div></td>
                        <td><%= reg.getSsRate(i)%></td>
                        <td><%= reg.getSsCount(i)%></td>
                        <td><a href="/Web/ex13/information.jsp?date=<%= reg.getDate(i)%>"><%= reg.getDate(i)%></a></td>   
                        <td><%= rig.data(reg.getSsCam(i)) %></td ></tr>
                        <% }%>
                </tbody>
            </table>
        </article>
    </section>
</body>
</html>
