package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTest {

	public static void main(String[] args) {

		//db정보
				String host = "jdbc:mysql://127.0.0.1:3306/studydb";
				String user = "root";
				String pass = "kimsj1234";
				
				try {
					//1단계- 데이터베이스 접속
					Connection conn = DriverManager.getConnection(host, user, pass);
					
					//2단계- SQL 실행 객체 (PreparedStatement) 생성 후 매핑
					String sql = "update `user2` set `name`=?, `addr`=? where `uid`=? ";
					PreparedStatement psmt = conn.prepareStatement(sql);
					psmt.setString(1, "김철수");
					psmt.setString(2, "부산광역시");
					psmt.setString(3, "J101");
						  
					
					//3단계- SQL 실행
					psmt.executeUpdate();

					// 4단계 - ResultSet 결과처리
					// 5단계 - 데이터베이스 종료
					conn.close();
					psmt.close();
					
					}catch(Exception e) {
					
						e.printStackTrace();
				}
	}

}
