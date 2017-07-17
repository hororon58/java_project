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

public class FileDB {

    /* 1. フィールドの定義 */
    protected int[] cam_id = new int[1000]; //ファイルNo
    protected String[] cam_name = new String[1000];
    //protected String[] name = new String[100]; //ファイル名
    //protected String[] description = new String[100];
    protected String[] date = new String[1000];
    protected int num; //データ取得件数 

    /* 2. メソッド */
 /* 2.1 データベースからのデータ取得メソッド */
    public void dataload() throws Exception { //エラー処理が必要にする
/* 2.1.1 データベースに接続 */
        num = 0; //取得件数の初期化
        Class.forName("com.mysql.jdbc.Driver").newInstance(); //com.mysql.jdbc.Driverはドライバのクラス名
        String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8"; //データベース名：文字エンコードはUTF-8
        Connection conn = DriverManager.getConnection(url, "softd", "softd"); //上記URL設定でユーザ名とパスワードを使って接続

        /* 2.1.2 SELECT文の実行 */ String sql = "SELECT * FROM registration_info INNER JOIN campany ON registration_info.cam_id = campany.cam_id"; //SQL文の設定 ?などパラメータが必要がない場合は通常のStatementを利用
        PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
        stmt.setMaxRows(100); //最大の数を制限
        ResultSet rs = stmt.executeQuery(); //ステートメントを実行しリザルトセットに代入

        /* 2.1.3 結果の取り出しと表示 */
        while (rs.next()) { //リザルトセットを1行進める．ない場合は終了
            this.cam_id[num] = rs.getInt("cam_id");
            this.cam_name[num] = rs.getString("cam_name");
            this.date[num] = rs.getString("registration_date");
            num++;
        }

        /* 2.1.4 データベースからの切断 */
        rs.close(); //開いた順に閉じる
        stmt.close();
        conn.close();
    }
    
       public void dataload3() throws Exception { //エラー処理が必要にする
/* 2.1.1 データベースに接続 */
        num = 0; //取得件数の初期化
        Class.forName("com.mysql.jdbc.Driver").newInstance(); //com.mysql.jdbc.Driverはドライバのクラス名
        String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8"; //データベース名：文字エンコードはUTF-8
        Connection conn = DriverManager.getConnection(url, "softd", "softd"); //上記URL設定でユーザ名とパスワードを使って接続

        /* 2.1.2 SELECT文の実行 */ String sql = "SELECT * FROM campany"; //SQL文の設定 ?などパラメータが必要がない場合は通常のStatementを利用
        PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
        stmt.setMaxRows(1000); //最大の数を制限
        ResultSet rs = stmt.executeQuery(); //ステートメントを実行しリザルトセットに代入

        /* 2.1.3 結果の取り出しと表示 */
        while (rs.next()) { //リザルトセットを1行進める．ない場合は終了
            this.cam_id[num] = rs.getInt("cam_id");
            this.cam_name[num] = rs.getString("cam_name");
            num++;
        }

        /* 2.1.4 データベースからの切断 */
        rs.close(); //開いた順に閉じる
        stmt.close();
        conn.close();
    }

    /* 2.2 データベースへのインサートメソッド */
    public int insert(int cam_id) {
        int count = 0; //登録件数のカウント
        try {

            /* 2.2.1 データベースに接続 */
            Class.forName("com.mysql.jdbc.Driver").newInstance(); // SELECTの時と同じ
            String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8";
            Connection conn = DriverManager.getConnection(url, "softd", "softd");

    
            /* 2.2.2 INSERT文の実行 */
            String sql = "INSERT INTO registration_info (cam_id,registration_date) VALUES (?,now())"; //SQL文の設定 INSERTはパラメータが必要なことが多い

            PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
            stmt.setInt(1, cam_id); //1つ目の？に引数をセットする
            /* 2.2.3 実行（UpdateやDeleteも同じメソッドを使う） */
            count = stmt.executeUpdate();

            /* 2.2.4 データベースからの切断 */
            stmt.close();
            conn.close();
            return count;
        } catch (Exception e) {
            return 0;
        }
    }

        /* 2.2 データベースへのインサートメソッド */
    public int delete(int cam_id) {
        int count = 0; //登録件数のカウント
        try {

            /* 2.2.1 データベースに接続 */
            Class.forName("com.mysql.jdbc.Driver").newInstance(); // SELECTの時と同じ
            String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8";
            Connection conn = DriverManager.getConnection(url, "softd", "softd");

            /* 2.2.2 INSERT文の実行 */
            String sql = "delete from registration_info where cam_id="+cam_id; //SQL文の設定 INSERTはパラメータが必要なことが多い

            PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
            /* 2.2.3 実行（UpdateやDeleteも同じメソッドを使う） */
            count = stmt.executeUpdate();

            /* 2.2.4 データベースからの切断 */
            stmt.close();
            conn.close();
            return count;
        } catch (Exception e) {
            return 0;
        }
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

    /*
    public String getName(int i) {
        if (i >= 0 && num > i) {
            return name[i];
        } else {
            return "";
        }
    }

    public String getDescription(int i) {
        if (i >= 0 && num > i) {
            return description[i];
        } else {
            return "";
        }
    }
     */
    public String getDate(int i) {
        if (i >= 0 && num > i) {
            return date[i];
        } else {
            return "";
        }
    }

    public String getCamName(int i) {
        if (i >= 0 && num > i) {
            return cam_name[i];
        } else {
            return "";
        }
    }

    public int getNum() {
        return num; // データ件数
    }

    public boolean getComid(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
