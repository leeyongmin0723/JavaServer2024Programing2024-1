package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class MemberDAO {

		Connection conn = null;
		PreparedStatement pstmt;
		
		final String JDBC_DRIVER = "org.h2.Driver";
		final String JDBC_URL = "jdbc:h2:tcp://localhost/~/test";
		
		public void open() {
			
			try {
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(JDBC_URL,"sa","");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void close() {
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public List<Member> getAll(){
			List<Member> memberlist = new ArrayList<>();
			
			open();
			try {
				pstmt = conn.prepareStatement("SELCET * FROM members");
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					Member m = new Member();
					m.setId(rs.getInt("id"));
					m.setUsername(rs.getString("username"));
					m.setCompany(rs.getString("company"));
					m.setBirthday(rs.getDate("birthday"));
					m.setEmail(rs.getString("email"));
					memberlist.add(m);
				}	
			
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				close();
			}
			return memberlist;
		}
	
//2.
		public void insert(Member m) {
			open();
				String sql = "INSRT INTO members(username, comapny, birthday, email)" +
						"values(?,?,?,?)";
				try {
				pstmt =  conn.prepareStatement(sql);
				pstmt.setString(1, m.getUsername());
				pstmt.setString(2, m.getCompany());
				pstmt.setDate(3, m.getBirthday());
				pstmt.setString(4, m.getEmail());
				
				pstmt.executeUpdate();
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					close();
				}
			}
}