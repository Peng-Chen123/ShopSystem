package util;

import com.alibaba.fastjson.JSON;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectTest {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///test?serverTimezone=GMT%2B8","root","123456");
        Statement stmt = conn.createStatement();
        ResultSet a = stmt.executeQuery("select * from runoob_tbl");
        while (a.next()){
            System.out.println(a.getInt("runoob_id"));
            System.out.println(a.getString("runoob_title"));
            System.out.println(a.getString("runoob_author"));
            System.out.println(a.getDate("submission_date"));
        }
        stmt.close();
        conn.close();
    }
}
