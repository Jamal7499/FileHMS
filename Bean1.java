package controller.service;


import model.bean.Forward;
import model.bean.InsertForward;
import model.dao.DAOImpl;
import model.dao.MyConnection;
import java.sql.*;

public class Bean1 {
	
	public String buildQuery1(InsertForward f) throws Exception
	{
		//System.out.println("debug33");
		DAOImpl daoimpl1=new DAOImpl();
		//String query1="insert into patient values('"+patientid+"','"+fname+"','"+lname+"','"+age+"' ,'"+gender+"','"+dob+"','"+contact+"','"+altcontact+"','"+email+"','"+pswd+"' ,'"+address1+"','"+address2+"','"+city+"' ,'"+state+"','"+zipcode+"' )";
		//System.out.println(query1);
		//InsertForward f=new InsertForward(patientid,fname,lname,age,gender,dob,contact,altcontact,  email,   pswd,  address1,  address2,  city,  state, zipcode);
		int status = daoimpl1.insert(f);
		if(status == 1)
		{
			return "succesfull";
	
		}
		else
		{
			return "unsuccesfull";
		
		}
	}
	public String select(String selectquery)throws Exception
	{
		DAOImpl daoimpl=new DAOImpl();
 		ResultSet rs=daoimpl.select(selectquery);
 		if(rs.next())
                return rs.getString(1);
 		else
 			return "no result";
	}
	
		
	}
	

