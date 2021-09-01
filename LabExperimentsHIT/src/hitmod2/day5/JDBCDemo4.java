package hitmod2.day5;

public class JDBCDemo4 {
	
	public static void main(String[] args) {
		JDBCDemo obj=JDBCDemo.getJDBCDemo();
		JDBCDemo.getJDBCDemo();
		JDBCDemo.getJDBCDemo();
		JDBCDemo.getJDBCDemo();
		JDBCDemo.getJDBCDemo();
	}
}
class JDBCDemo{
	//singleton pattern
	private JDBCDemo() {
		System.out.println("JDBCDemo object created...");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static JDBCDemo jdbcDemo;
	public static JDBCDemo getJDBCDemo() {
		if(jdbcDemo==null) {
			jdbcDemo=new JDBCDemo();
		}
		return jdbcDemo;
	}
	
	public void doOperation1() {
		
	}
}