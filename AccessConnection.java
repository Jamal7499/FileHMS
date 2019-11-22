package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccessConnection {

	
	public static void main(String arg[])
	{
		 System.out.println("hii3");
	
	try{  
		   String database="D://761529//Access//ForImportingCsv.accdb";//Here database exists in the current directory  
		  
		   String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + database + ";DriverID=22;READONLY=true";  
		  
		   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
		   Connection c=DriverManager.getConnection(url);  
		   Statement st=c.createStatement(); 
		   System.out.println("Going");
		   ResultSet rs=st.executeQuery("select * from DriverDetail");  
		   System.out.println("out");
		    
		   while(rs.next()){  
		    System.out.println(rs.getString(1));  
		   }  
		  
		}
	catch(Exception ee){System.out.println(ee);}  
		  
		}
}
