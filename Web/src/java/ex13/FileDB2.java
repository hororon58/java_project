/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13;

/**
 *
 * @author g031n047
 */
import java.sql.*; //SQLに関連したクラスライブラリをインポート

public class FileDB2 {

    /* 1. フィールドの定義 */
    protected int[] cam_id = new int[100]; //ファイルNo
    protected String[] cam_name = new String[100];
    protected String[] ss_cam = new String[100];
    protected String[] ss_rate = new String[100];
    protected String[] ss_count = new String[100];
    //protected String[] name = new String[100]; //ファイル名
    //protected String[] description = new String[100];
    protected String[] date = new String[100];
    protected int num; //データ取得件数 

    /* 2. メソッド */
    public void dataload(int code) throws Exception { //エラー処理が必要にする
/* 2.1.1 データベースに接続 */
        num = 0; //取得件数の初期化

        Class.forName("com.mysql.jdbc.Driver").newInstance(); //com.mysql.jdbc.Driverはドライバのクラス名
        String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8"; //データベース名：文字エンコードはUTF-8
        Connection conn = DriverManager.getConnection(url, "softd", "softd"); //上記URL設定でユーザ名とパスワードを使って接続

        /* 2.1.2 SELECT文の実行 */ String sql = "SELECT code,cam_name,sscam,rate,count,date FROM ssi INNER JOIN campany ON ssi.code = campany.cam_id where code=" + code + " ORDER BY date desc"; //SQL文の設定 ?などパラメータが必要がない場合は通常のStatementを利用
        PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
        stmt.setMaxRows(100); //最大の数を制限
        ResultSet rs = stmt.executeQuery(); //ステートメントを実行しリザルトセットに代入

        /* 2.1.3 結果の取り出しと表示 */
        while (rs.next()) { //リザルトセットを1行進める．ない場合は終了
            this.cam_id[num] = rs.getInt("code");
            this.cam_name[num] = rs.getString("cam_name");
            this.ss_cam[num] = rs.getString("sscam");
            this.ss_rate[num] = rs.getString("rate");
            this.ss_count[num] = rs.getString("count");
            this.date[num] = rs.getString("date");
            num++;
        }

        /* 2.1.4 データベースからの切断 */
        rs.close(); //開いた順に閉じる
        stmt.close();
        conn.close();
    }

    public void dataload(String name) throws Exception { //エラー処理が必要にする
/* 2.1.1 データベースに接続 */
        num = 0; //取得件数の初期化
        Class.forName("com.mysql.jdbc.Driver").newInstance(); //com.mysql.jdbc.Driverはドライバのクラス名
        String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8"; //データベース名：文字エンコードはUTF-8
        Connection conn = DriverManager.getConnection(url, "softd", "softd"); //上記URL設定でユーザ名とパスワードを使って接続

        /* 2.1.2 SELECT文の実行 */ String sql = "SELECT code,cam_name,sscam,rate,count,date FROM ssi INNER JOIN campany ON ssi.code = campany.cam_id where sscam=" + name + " ORDER BY date desc"; //SQL文の設定 ?などパラメータが必要がない場合は通常のStatementを利用
        PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
        stmt.setMaxRows(100); //最大の数を制限
        ResultSet rs = stmt.executeQuery(); //ステートメントを実行しリザルトセットに代入
        /* 2.1.3 結果の取り出しと表示 */
        while (rs.next()) { //リザルトセットを1行進める．ない場合は終了
            this.cam_id[num] = rs.getInt("code");
            this.cam_name[num] = rs.getString("cam_name");
            this.ss_cam[num] = rs.getString("sscam");
            this.ss_rate[num] = rs.getString("rate");
            this.ss_count[num] = rs.getString("count");
            this.date[num] = rs.getString("date");
            num++;
        }

        /* 2.1.4 データベースからの切断 */
        rs.close(); //開いた順に閉じる
        stmt.close();
        conn.close();
    }

    public void dataload2(String date) throws Exception { //エラー処理が必要にする
/* 2.1.1 データベースに接続 */
        num = 0; //取得件数の初期化
        Class.forName("com.mysql.jdbc.Driver").newInstance(); //com.mysql.jdbc.Driverはドライバのクラス名
        String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8"; //データベース名：文字エンコードはUTF-8
        Connection conn = DriverManager.getConnection(url, "softd", "softd"); //上記URL設定でユーザ名とパスワードを使って接続

        /* 2.1.2 SELECT文の実行 */ String sql = "SELECT code,cam_name,sscam,rate,count,date FROM ssi INNER JOIN campany ON ssi.code = campany.cam_id where date="+date; //SQL文の設定 ?などパラメータが必要がない場合は通常のStatementを利用
        PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
        stmt.setMaxRows(100); //最大の数を制限
        ResultSet rs = stmt.executeQuery(); //ステートメントを実行しリザルトセットに代入

        /* 2.1.3 結果の取り出しと表示 */
        while (rs.next()) { //リザルトセットを1行進める．ない場合は終了
            this.cam_id[num] = rs.getInt("code");
            this.cam_name[num] = rs.getString("cam_name");
            this.ss_cam[num] = rs.getString("sscam");
            this.ss_rate[num] = rs.getString("rate");
            this.ss_count[num] = rs.getString("count");
            this.date[num] = rs.getString("date");
            num++;
        }

        /* 2.1.4 データベースからの切断 */
        rs.close(); //開いた順に閉じる
        stmt.close();
        conn.close();
    }


    /* 3. アクセッサ */
 /* 3.1 Getアクセッサ */
    public int getCamId(int i) {
        if (i >= 0 && num > i) {
            return cam_id[i];
        } else {
            return 0;
        }
    }

    public String getCamName(int i) {
        if (i >= 0 && num > i) {
            return cam_name[i];
        } else {
            return "";
        }
    }

    public String getSsRate(int i) {
        if (i >= 0 && num > i) {
            return ss_rate[i];
        } else {
            return "";
        }
    }

    public String getDate(int i) {
        if (i >= 0 && num > i) {
            return date[i];
        } else {
            return "";
        }
    }

    public String getSsCam(int i) {
        if (i >= 0 && num > i) {
            return ss_cam[i];
        } else {
            return "";
        }
    }

    public String getSsCount(int i) {
        if (i >= 0 && num > i) {
            return ss_count[i];
        } else {
            return "";
        }
    }

    public int getNum() {
        return num; // データ件数
    }

}
