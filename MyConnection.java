package model.dao;
import java.sql.*;
public class MyConnection {

	private static String driver="oracle.jdbc.driver.OracleDriver";
	private static String url="jdbc:oracle:thin:@localhost:1521:XE";
	private MyConnection(){}
	
	private static MyConnection mc;
	private static Connection con;
	public static MyConnection getObj()throws Exception
	{
		System.out.println("connectio1");
		if(mc==null)
		{
			mc=new MyConnection();
			crtCon();
			System.out.println("connectio2");
		}
		
		return mc;
	}
	
	private static void crtCon() throws Exception
	{
		Class.forName(driver);
		con=DriverManager.getConnection(url,"project","project");
		System.out.println("connectio3");
		
	}
	public Connection getConnection()
	{
		return con;
	}
	
	
	
}
