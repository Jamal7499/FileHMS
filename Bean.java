package controller.service;
import model.bean.Forward;
import java.sql.ResultSet;

import model.dao.DAOImpl;

public class Bean {

	public Forward buildQuery(String unm,String pswd) throws Exception
	{
	
		DAOImpl daoimpl=new DAOImpl();
		String query="select adminid,firstname,lastname,dob,contact,image,pswd from Admin where AdminID='"+unm+"'  ";
		String password=new String();
		ResultSet rs=daoimpl.select(query);
		Forward ob=null;
		if(rs.next())
		{
			 ob=new Forward(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));	
		}
		System.out.println(ob.getImage());
	return ob;
	}
	
	public Forward ForgetPassword(String unm ) throws Exception
	{
	
		DAOImpl daoimpl=new DAOImpl();
		String query="select adminid,firstname,lastname,dob,contact,image,pswd from Admin where AdminID='"+unm+"'  ";
		ResultSet rs=daoimpl.select(query);
		Forward ob=null;
		if(rs.next())
		{
			 ob=new Forward(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));	
		}
		
	return ob;
	}
	
	
	
	
	
	
	
	
	
	
}
