package DatabseLinkOne.DataLink1;
import java.sql.*;

public class DataLink {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stat = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Nationwide?useLegacyDatetimeCode="
					+ "false&serverTimezone=Europe/London","root","password");
			stat = conn.createStatement();
			stat.executeUpdate("insert into college values(4, 'John', 'English', 57)");
		}
		catch(Exception E) {
			System.out.println(E.toString());
		}
	}
}