package DatabseLinkOne.DataLink1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GUILinkEHandler implements ActionListener{
	TextField Input1, Input2, Input3;
	Connection conn = null;
	Statement stat = null;
	
	public GUILinkEHandler(TextField A, TextField B, TextField C){
		Input1 = A;
		Input2 = B;
		Input3 = C;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Nationwide?useLegacyDatetimeCode="
					+ "false&serverTimezone=Europe/London","root","password");
			stat = conn.createStatement();
		}
		catch(Exception E) {
			System.out.println(E.toString());
		}
	}
	
	public void actionPerformed(ActionEvent Trigger) {	
		String RegNo,Name,Marks;
		String insertQuery="";
		RegNo = Input1.getText();
		Name = Input2.getText();
		Marks = Input3.getText();
		insertQuery = "insert into school values("+RegNo+",'"+Name+"',"+Marks+")";
		try {        
			stat.executeUpdate(insertQuery);                
			}        
		catch(Exception E) {    
			System.out.println(E.toString());      
			}
	}
}