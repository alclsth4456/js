package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
        String host = "jdbc:mysql://127.0.0.1:3306/studydb";
        String user = "root";
        String pass = "1234";
        try {
            Connection conn = DriverManager.getConnection(host,user,pass);
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("delete from `user1` where `uid`=?");
            conn.close();
            stmt.close();

        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Delete 완료");
    }

}
