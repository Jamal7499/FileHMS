package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.InsertForward;
import model.bean.PatDiagEntity;
import model.bean.PatientSearchEntity;
import model.bean.PatientSearchEntityView;

public class PatientSearchDAOImpl {
	 public String patidDiag=new String();
	
	//select query for patient
	public ArrayList<PatientSearchEntity> getDetails(PatientSearchEntityView psb) throws Exception {
	    
		Connection con=MyConnection.getObj().getConnection();
		PreparedStatement ps;
		if( psb.getPid()==null)
		{
			final String sql="select * from patient where FIRSTNAME=?";
			  ps=con.prepareStatement(sql);
			ps.setString(1, psb.getPname());
			
			final String sql2 ="select patientid from patient where FIRSTNAME=?";
			PreparedStatement ps1=con.prepareStatement(sql2);
			ps1.setString(1, psb.getPname());
			

		}
		else
		{
			final String sql="select * from patient where PATIENTID=?";
			  ps=con.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(psb.getPid()));
		}
		ArrayList<PatientSearchEntity> al=new ArrayList<PatientSearchEntity>();
		ResultSet rs = ps.executeQuery();
	     while(rs.next())
		{
	    	 PatientSearchEntity sb=new PatientSearchEntity(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
	    	 al.add(sb);
		}
		return al;
	}
	
	
	
	
	
	//select query for diagnosis table
	public PatDiagEntity getDiagnosisDetailsDAO(String psb) throws Exception {
		 
		Connection con=MyConnection.getObj().getConnection();
		PreparedStatement ps;
		patidDiag=psb;
		
			final String sql="select * from diagnosisdetails where PATIENTID=?";
			ps=con.prepareStatement(sql);
			 ps.setInt(1, Integer.parseInt(psb)); 
			 System.out.println("value of 12"+ psb);
			PatDiagEntity sb=new PatDiagEntity();
		ResultSet rs = ps.executeQuery();
	     while(rs.next())
		{
	    	   sb=new PatDiagEntity(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19));
	    	  
		}
		return sb;
	}
	
	
	
	  
	
	
	  // pat update profile
	   public int profileUpdate(InsertForward f1) throws Exception {
 		 
		 
		Connection con= MyConnection.getObj().getConnection();
		String query1 = " update patient set PATIENTID=?,FIRSTNAME=?,LASTNAME=?,AGE=?,GENDER=?,DOB=?,CONTACTNUMBER=?,ALTCONTACTNUMBER=?,EMAILID=?,PSWD=?,ADDRESS1=?,ADDRESS2=?,CITY=?,STATE=?,ZIPCODE=? where PATIENTID='"+f1.getPatientid()+"'";
		PreparedStatement ps=con.prepareStatement(query1);
		ps.setInt(1, Integer.parseInt(f1.getPatientid()));
		ps.setString(2, f1.getFname());
		ps.setString(3, f1.getLname());
		ps.setInt(4,Integer.parseInt( f1.getAge()));
		ps.setString(5, f1.getGender());
		ps.setString(6, f1.getDob());
		ps.setInt(7, Integer.parseInt(f1.getContact()));
		ps.setInt(8,Integer.parseInt( f1.getAltcontact()));
		ps.setString(9, f1.getEmail());
		ps.setString(10, f1.getPswd());
		ps.setString(11, f1.getAddress1());
		ps.setString(12, f1.getAddress2());
		ps.setString(13, f1.getCity());
		ps.setString(14, f1.getState());
		ps.setInt(15, Integer.parseInt(f1.getZipcode()));
		
		System.out.println(f1.getPatientid() +f1.getFname() +f1.getLname() +f1.getAge() +f1.getGender()  +f1.getDob() +f1.getContact() +f1.getAltcontact());
        System.out.println(f1.getEmail() +f1.getPswd() +f1.getAddress1() +f1.getAddress2() +f1.getCity() +f1.getState() +f1.getZipcode());
		System.out.println(query1);
		int i= ps.executeUpdate();
		System.out.println(i);
		return i;
	}
	   
	   
	   
	   
	   
	   //update diagnosis details
	   public int diagnosisUpdate(PatDiagEntity f) throws Exception {
	 		 
			 
			Connection con= MyConnection.getObj().getConnection();
			String query1 = "update diagnosisdetails set REPORTID=?,PATIENTID=?,PHYSICIANID=?,SERVICEDATE=?,TESTRESULTDATE=?,D1NR=?,D1AV=?,D2NR=?,D2AV=?,D3NR=?,D3AV=?,D4NR=?,D4AV=?,D5NR=?,D5AV=?,D6NR=?,D6AV=?,PHYCOMMENT=?,OTHERINFO=? where patientid='"+f.getPatid()+"'";
			PreparedStatement ps=con.prepareStatement(query1);
			
			ps.setInt(1, Integer.parseInt(f.getReportid()));
			ps.setString(2, f.getPatid());
			ps.setString(3, f.getPhyid());
			ps.setString(4, f.getSdate());
			ps.setString(5, f.getTrdate());
			ps.setInt(6,Integer.parseInt( f.getActuald1()));
			ps.setInt(7, Integer.parseInt(f.getRanged1()));
			ps.setInt(8,Integer.parseInt( f.getActuald2()));
			ps.setInt(9, Integer.parseInt(f.getRanged2()));
			ps.setInt(10,Integer.parseInt( f.getActuald3()));
			ps.setInt(11, Integer.parseInt(f.getRanged3()));
			ps.setInt(12,Integer.parseInt( f.getActuald4()));
			ps.setInt(13, Integer.parseInt(f.getRanged4()));
			ps.setInt(14,Integer.parseInt( f.getActuald5()));
			ps.setInt(15, Integer.parseInt(f.getRanged5()));
			ps.setInt(16,Integer.parseInt( f.getActuald6()));
			ps.setInt(17, Integer.parseInt(f.getRanged6()));
			ps.setString(18, f.getText());
			ps.setString(19, f.getOtherinfo());
			System.out.println(f.getSdate() +" " +f.getTrdate() +" " +f.getActuald1()+" "+f.getRanged1()+" "+f.getText());
			System.out.println(query1);
			int i= ps.executeUpdate();
			System.out.println(i);
			return i;
			
		
		}
	   
	   //patient delete
	   public int patientdeletedao(String pat) throws Exception {
		   Connection con= MyConnection.getObj().getConnection();
			String query1 = "delete from patient where PATIENTID='"+pat+"'";
			PreparedStatement ps=con.prepareStatement(query1);
			int i= ps.executeUpdate();
			System.out.println(i);
			return i;
			
		   
	    
		   
	   }
	
	
	

}
