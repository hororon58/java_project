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
public class GetTag {

    
    private final FileDB2 file = new FileDB2();

    public String data(String i){ //エラー処理が必要にする
        if ("モルガン・スタンレーMUFG証券株式会社".equals(i)) {
            return "モルガン危険";
        } else if("GOLDMAN SACHS INTERNATIONAL".equals(i)){
            return "GSは死神";
        }else{
            return "";
        }
    }
}
