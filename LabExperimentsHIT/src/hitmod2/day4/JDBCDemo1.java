package hitmod2.day4;
import java.sql.Connection;
import java.sql.DriverManager;


public class JDBCDemo1 {
		public static void main(String[] args) throws Exception{
			
			//step1 - Load or register the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2 - Establish a connection
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/aspire","root","root");
			
			System.out.println(con);
			

}
}