package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SelectTest {

	public static void main(String[] args) {

		//db정보
				String host = "jdbc:mysql://127.0.0.1:3306/studydb";
				String user = "root";
				String pass = "kimsj1234";
				
				List<User2VO> users= new ArrayList<>();
				
				try {
					//1단계- 데이터베이스 접속
					Connection conn = DriverManager.getConnection(host, user, pass);
					
					//2단계- SQL 실행 객체 (PreparedStatement) 생성 후 매핑
					PreparedStatement psmt = conn.prepareStatement("select * from `user2`");
					
					//3단계- SQL 실행
					ResultSet rs = psmt.executeQuery();
					
					// 4단계 - ResultSet 결과처리
					while(rs.next()) {
						User2VO vo = new User2VO();
						vo.setUid(rs.getString(1));
						vo.setName(rs.getString(2));
						vo.setBirth(rs.getString(3));
						vo.setAddr(rs.getString(4));
						
						users.add(vo);
					}
					// 5단계 - 데이터베이스 종료
					conn.close();
					psmt.close();
					rs.close();
					
					}catch(Exception e) {
						e.printStackTrace();
				}
	}

}
