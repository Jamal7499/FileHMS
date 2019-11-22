package controller.service;

import java.sql.ResultSet;

import model.bean.DrInsertionEntity;
import model.dao.DrInsertionDAOImpl;

public class DrInsertionBean {

	public String buildQuery1(DrInsertionEntity f) throws Exception
	{
		//System.out.println("debug33");
		DrInsertionDAOImpl daoimpl1=new DrInsertionDAOImpl();
		//String query1="insert into patient values('"+patientid+"','"+fname+"','"+lname+"','"+age+"' ,'"+gender+"','"+dob+"','"+contact+"','"+altcontact+"','"+email+"','"+pswd+"' ,'"+address1+"','"+address2+"','"+city+"' ,'"+state+"','"+zipcode+"' )";
		//System.out.println(query1);
		//InsertForward f=new InsertForward(patientid,fname,lname,age,gender,dob,contact,altcontact,  email,   pswd,  address1,  address2,  city,  state, zipcode);
		System.out.println("41");
		System.out.println(f.getPhysicianid());
		int status = daoimpl1.insert(f);
		System.out.println("4");
		
		System.out.println(status);
		if(status == 1)
		{
			System.out.println("5");
			return "successful";
	
		}
		else
		{
			System.out.println("6");
			return "unsuccessful";
		
		}
	}
	public String select(String selectquery)throws Exception
	{
		
		DrInsertionDAOImpl daoimpl=new DrInsertionDAOImpl();
 		ResultSet rs=daoimpl.select(selectquery);

 		if(rs.next())
            return rs.getString(1);
		else
			return "no result";
 		
		
	
	}
		
	}


