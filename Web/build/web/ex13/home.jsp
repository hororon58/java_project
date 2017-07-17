<%-- 
    Document   : home
    Created on : 2017/02/08, 20:29:41
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
    <body class="back">
        <div class="pos">
            <!-- Wide card with share menu button -->
            <div class="demo-card-wide mdl-card mdl-shadow--2dp">
                <div class="mdl-card__title">
                    <h2 class="mdl-card__title-text">ようこそ</h2>
                </div>
                <div class="mdl-card__supporting-text">
                    個人的な趣味で作りたかったものの実装を目指したもののいろいろな弊害があり普通なものになったHP
                    にようこそ
                </div>
                <div class="mdl-card__actions mdl-card--border">
                    <a href="registration_page.jsp" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
                        メインページへ
                    </a>
                </div>
            </div>
        </div>
    </body>
</html>