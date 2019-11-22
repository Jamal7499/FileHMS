package model.dao;

import java.sql.*;
import model.bean.DrInsertionEntity;


public class DrInsertionDAOImpl implements DrInsertionDAO {

	public int insert(DrInsertionEntity f) throws Exception
	{
		
		//MyConnection.getObj();
		System.out.println("hii11");
				Connection con= MyConnection.getObj().getConnection();
				System.out.println("hii22");
				String query1 ="insert into physician values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(query1);
				
				System.out.println("hii999");
				System.out.println(" "+f.getPhysicianid() +" "+f.getFname()+" "+f.getLname()+" "+f.getAge() +" "+f.getGender() +" "+f.getDob() +" "+f.getContact() +" "+f.getAltcontact() +" "+f.getEmail());
				System.out.println(" "+f.getPswd()+" "+f.getAddress1()+" "+f.getAddress2()+" "+f.getCity()+" "+f.getState()+" "+f.getZipcode()+" "+f.getDegree()+" "+f.getSpeciality()+" "+f.getWorkingHours()+" "+f.getHospitality());
				
				System.out.println("hii333");
				ps.setString(1,f.getPhysicianid());
				System.out.println("abc1");

				ps.setString(2, f.getFname());
				ps.setString(3, f.getLname());
				ps.setInt(4,Integer.parseInt( f.getAge()));
				System.out.println("abc2");
				ps.setString(5, f.getGender());
				ps.setString(6, f.getDob());
				ps.setString(7,  (f.getContact()));
				System.out.println("abc3");

				ps.setString(8,( f.getAltcontact()));
				System.out.println("abc4");

				ps.setString(9, f.getEmail());
				ps.setString(10, f.getPswd());
				ps.setString(11, f.getAddress1());
				ps.setString(12, f.getAddress2());
				ps.setString(13, f.getCity());
				ps.setString(14, f.getState());
				ps.setInt(15, Integer.parseInt(f.getZipcode()));
				System.out.println("abc4");

				ps.setString(16, f.getDegree());
				ps.setString(17, f.getSpeciality());
				ps.setString(18, f.getWorkingHours()); 
				ps.setString(19, f.getHospitality());
				System.out.println(" "+f.getPhysicianid() +" "+f.getFname()+" "+f.getLname()+" "+f.getAge() +" "+f.getGender() +" "+f.getDob() +" "+f.getContact() +" "+f.getAltcontact() +" "+f.getEmail());
				System.out.println(" "+f.getPswd()+" "+f.getAddress1()+" "+f.getAddress2()+" "+f.getCity()+" "+f.getState()+" "+f.getZipcode()+" "+f.getDegree()+" "+f.getSpeciality()+" "+f.getWorkingHours()+" "+f.getHospitality());
				int i= ps.executeUpdate();
				System.out.println(i+"helowwww");
				return i;
	}
	
	public int update(String query) throws Exception
	{
		
		Connection con= MyConnection.getObj().getConnection();
		Statement st=con.createStatement();
		int i= st.executeUpdate(query);
		return i;
	}
	
	public int delete(String query){return 0;}
	public ResultSet select(String query) throws Exception
	{
		MyConnection.getObj();
		Connection con= MyConnection.getObj().getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		return rs;
	}

}
