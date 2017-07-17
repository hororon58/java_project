<%-- 
    Document   : q
    Created on : 2017/01/20, 19:02:09
    Author     : g031n047
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ファイルのアップロード</title>
    </head>
    <body>
        <article>
            <h1>ファイルを選択</h1>

            <!-- (1)<FORM>タグにmultipart/form-dataを指定 -->
            <form method="POST" enctype="multipart/form-data" action="/Web/UploadFile">
                <!-- (2)ファイルを選択する<input type="file">タグを指定 -->
                <input type="file" name="name" />
                <input type="submit" value="送信" />
            </form>

        </article>
    </body>
</html>
