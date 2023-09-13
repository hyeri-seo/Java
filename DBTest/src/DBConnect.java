import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	// DB Connection
	public static Connection getConnection() {
	// MariaDB JDBC드라이버를 로드함
	// testdb 데이터베이스에 root 사용자로 연결함
	// 연결이 성공하면 Connection 객체를 반환하고, 실패하면 예외 처리
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			//지정된 클래스를 동적으로 로드함
			//드라이버 클래스가 클래스패스에 존재하고 사용 가능하게 만듦
			//JDBC 드라이버 클래스는 DB와 연결을 가능하게 함
			conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb","root","1234");
			//JDBC URL을 사용해 DB와의 연결을 생성함
			//jdbc:mariadb:// 마리아DB 데이터베이스 사용
			//localhost:3306 데이터베이스의 서버의 호스트 및 포트 지정
			//testdb 연결하려는 데이터베이스의 이름
			//root 데이터베이스에 로그인할 사용자 이름
			//1234 사용자 암호
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		//연결이 성공적으로 설정되면 Connection 객체인 conn 반환
	}
	
	public static void close(Connection conn) {
	// 데이터베이스 연결을 닫는 메서드. DB 연결을 안전하게 종료 가능
		try {
			if(conn!=null) conn.close();
			//conn 객체가 null이 아닌 경우에만 연결 닫음.
			//null인 연결 닫으려고 하면 예외가 발생할 수 있음.
			//conn.close()는 Connection 객체를 닫음
			//연결을 닫으면 DB와의 연결이 종료됨
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insertUser(String id, String name) {
	// 데이터 삽입 메서드. user 테이블에 새로운 레코드를 삽입함
		Connection conn = null;
		String sql = String.format("insert into user (id, name) values ('%s', '%s')", id, name);
		//DB에 삽입할 레코드를 삽입하는 SQL 쿼리가 포매팅되어 저장됨
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			//conn.createStatement() 사용해 Statement 객체 생성
			//이 객체 사용해 SQL 쿼리 실행 가능
			int cnt = stmt.executeUpdate(sql);
			//SQL 쿼리를 실행하고, 실행된 행의 수 반환
			//데이터 삽입이므로 삽입된 행의 수가 반환됨
			System.out.println(cnt+"개 데이터 삽입");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) stmt.close();
				//Statement 객체 닫고
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
			//DB 연결 닫음
		}
	}

	public static void updateUserName(String id, String name) {
	// 데이터 수정 메서드. user 테이블에서 특정 id에 해당하는 레코드 이름 수정
		Connection conn = getConnection();
		Statement stmt = null;
		try {
			String sql = String.format("update user set name='%s' where id='%s'", name, id);
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt+"개 수정");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void deleteUser(String id) {
	// 데이터 삭제 메서드. user 테이블에서 특정 id에 해당하는 레코드 삭제
		Connection conn = getConnection();
		Statement stmt = null;
		try {
			String sql = String.format("delete user id=%s", id);
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt+"개 데이터 삭제");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void userInfo(String id) {
	// 특정 id에 해당하는 사용자 정보를 조회함
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String sql=String.format("select * from user where id='%s'", id);
			stmt=conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs!=null && rs.next()) {
				String rid = rs.getString("id");
				String rname = rs.getString("name");
				System.out.println(rid+","+rname);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				 if(rs!=null) rs.close();
				 if(stmt!=null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void allUserInfo() {
	// user 테이블의 모든 사용자 정보를 조회함
	// SQL SELECT문을 사용하여 모든 레코드를 가져옴
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;	// 결과를 저장하는 객체
		try {
			String sql="select * from user";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			if(rs!=null) {
				while(rs.next()) {
					String rid=rs.getString(1);	//아이디 추출
					String rname=rs.getString(2);//이름 추출
					System.out.println(rid+","+rname);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void main(String[] args) {
		// insertUser("song", "송길동");
		// updateUserName("song", "송송이");
		// deleteUser("song");
		// userInfo("hong");
		allUserInfo();
	}

}
