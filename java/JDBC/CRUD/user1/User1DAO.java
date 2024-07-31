package user1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import sub2.User1VO;

public class User1DAO {

	// 싱글톤
		private static User1DAO instance = new User1DAO();
		public static User1DAO getInstance() {
			return instance;
		}
		private User1DAO() {}
		
		
		// DB 정보
		private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
		private final static String USER = "root";
		private final static String PASS = "1234";
		
		// CRUD 메서드
		public void insertUser(User1VO vo) {
			
			String sql = "INSERT INTO `user1` values (?,?,?,?,?)";
			
			try {
				Connection conn = DriverManager.getConnection(HOST, USER, PASS);
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, vo.getUid());
				psmt.setString(2, vo.getName());
				psmt.setString(3, vo.getBirth());
				psmt.setString(4, vo.getPh());
				psmt.setInt(5, vo.getAge());
				
				psmt.executeUpdate();
				
				psmt.close();
				conn.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public User1VO selectUser(String uid) {
			
			String sql = "select * from `user1` where `uid`=?";
			User1VO user = null;
			
			try {
				Connection conn = DriverManager.getConnection(HOST, USER, PASS);
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, uid);  //쿼리의 1번째 매개변수에 uid 값을 설정
				
				ResultSet rs = psmt.executeQuery();
				
				// 조회결과가 1 또는 0이기 때문에 while 대신 if문으로 next()
				if(rs.next()) {
					user = new User1VO();
					user.setUid(rs.getString(1));  //1번째 컬럼 값을 설정
					user.setName(rs.getString(2));
					user.setBirth(rs.getString(3));
					user.setPh(rs.getString(4));
					user.setAge(rs.getInt(5));
				}
				rs.close();
				psmt.close();
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return user;
		}
		
		public List<User1VO> selectUsers() {
			
			String sql = "select * from `user1`";
			List<User1VO> users = new ArrayList<>();
			
			try {
				Connection conn = DriverManager.getConnection(HOST, USER, PASS);
				Statement stmt = conn.createStatement();
				//모든 데이터를 조회하는 단순한 쿼리로 파라미터를 사용하지 않기에 prepared를 활용할 필요가 없다.
				ResultSet rs = stmt.executeQuery(sql);
				
				while(rs.next()) {  //모든 행을 반복하기 위해 next로 처리하여 리스트를 반환
					User1VO vo = new User1VO();
					vo.setUid(rs.getString(1));
					vo.setName(rs.getString(2));
					vo.setBirth(rs.getString(3));
					vo.setPh(rs.getString(4));
					vo.setAge(rs.getInt(5));
					
					users.add(vo);
				}
				
				rs.close();
				stmt.close();
				conn.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return users;
		}
		
		public int updateUser(User1VO vo) {
			
			String sql = "update `user1` set `name`=?, `birth`=?, `hp`=?, `age`=? where `uid`=?";
			int result = 0;
			
			try {
				Connection conn = DriverManager.getConnection(HOST, USER, PASS);
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, vo.getName());
				psmt.setString(2, vo.getBirth());
				psmt.setString(3, vo.getPh());
				psmt.setInt(4, vo.getAge());
				psmt.setString(5, vo.getUid());
				
				// sql이 적용되는 row 카운터 반환
				result = psmt.executeUpdate();
				
				psmt.close();
				conn.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		
			return result;
		}
		
		public int deleteUser(String uid) {
			
			String sql = "delete from `user1` where `uid`=?";
			int result = 0;
			
			try {
				Connection conn = DriverManager.getConnection(HOST, USER, PASS);
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, uid);
				
				// sql이 적용되는 row 카운터 반환
				result = psmt.executeUpdate();
				
				psmt.close();
				conn.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return result;
		}
}
