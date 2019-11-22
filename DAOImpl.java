package model.dao;
import java.sql.*;
import model.bean.InsertForward;

public class DAOImpl implements DAO{
	public int insert(InsertForward f) throws Exception
	{
		
		//MyConnection.getObj();
		Connection con= MyConnection.getObj().getConnection();
		String query1 = "insert into patient values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query1);
		ps.setInt(1, Integer.parseInt(f.getPatientid()));
		ps.setString(2, f.getFname());
		ps.setString(3, f.getLname());
		ps.setInt(4,Integer.parseInt( f.getAge()));
		ps.setString(5, f.getGender());
		ps.setString(6, f.getDob());
		ps.setString(7, (f.getContact()));
		ps.setString(8,( f.getAltcontact()));
		ps.setString(9, f.getEmail());
		ps.setString(10, f.getPswd());
		ps.setString(11, f.getAddress1());
		ps.setString(12, f.getAddress2());
		ps.setString(13, f.getCity());
		ps.setString(14, f.getState());
		ps.setInt(15, Integer.parseInt(f.getZipcode()));
		System.out.println(f.getPatientid()+" " +f.getFname() +" " +f.getLname()   +" " +f.getAge() +" " + f.getGender()+" "   + f.getDob());
		System.out.println(f.getContact()+" "  +f.getAltcontact() +" " +f.getEmail() +" " +f.getPswd()  +" "+f.getAddress1()+" "  +f.getAddress2()+" "  +f.getCity() +" " +f.getState() +" "+f.getZipcode());
		int i= ps.executeUpdate();
		System.out.println("sts "+i);
		return i;
	}
	
	public int update(String query) throws Exception
	{
		
		Connection con= MyConnection.getObj().getConnection();
		Statement st=con.createStatement();
		int i= st.executeUpdate(query);
		return i;
	}
	
	public int delete(String query){
		
		
		
		
		return 0;}
	public ResultSet select(String query) throws Exception
	{
		System.out.println("hiiselect1");
		MyConnection.getObj();
		Connection con= MyConnection.getObj().getConnection();
		System.out.println("hiiselect2");
		Statement st=con.createStatement();
		System.out.println("hiiselect3");
		ResultSet rs=st.executeQuery(query);
		System.out.println("hiiselect4");
		return rs;
	}
	
}
