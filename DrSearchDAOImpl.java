package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.*;


public class DrSearchDAOImpl {

	public ArrayList<DrInsertionEntity> getDetails(DrSearchEntityView psb) throws Exception {
		Connection con=MyConnection.getObj().getConnection();
		final String sql;
		 PreparedStatement ps;
		 ArrayList<DrInsertionEntity> al=new ArrayList<DrInsertionEntity>();
		if(psb.getDrid()==null)
		{
		     sql="select * from physician where FNAME=?";
		       ps=con.prepareStatement(sql);
		
		   //ps.setString(1, psb.getPname());
		   ps.setString(1,( psb.getDrname()));  
		   System.out.println("if statement");
		}
		else
		{
			  sql="select * from physician where PHYSICIANID=?";
			     ps=con.prepareStatement(sql);
			
			   //ps.setString(1, psb.getPname());
			   ps.setInt(1,Integer.parseInt( psb.getDrid()));
			   System.out.println("else statement");		
		}
		
		ResultSet rs = ps.executeQuery();
	     while(rs.next())
		{
	    	 System.out.println("In RS");
	    	 DrInsertionEntity sb=new DrInsertionEntity(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19));
	    	 al.add(sb);
			System.out.println(al);
		}
		
		return al;
	}

}



