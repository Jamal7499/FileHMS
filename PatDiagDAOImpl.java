
package model.dao;
import java.sql.*;
import model.bean.PatDiagEntity;
import model.dao.MyConnection;
public class PatDiagDAOImpl implements PatDiagDAO {


	public boolean insert(PatDiagEntity f) throws Exception {
		//MyConnection.getObj();
		      
		
		    
		     
				Connection con= MyConnection.getObj().getConnection();
				String query1 = "insert into diagnosisdetails values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
				//System.out.println(f.getSdate() +" " +f.getTrdate() +" " +f.getActuald1()+" "+f.getRanged1()+" "+f.getText());
				boolean i= ps.execute();
				return i;
				
		
	}

	 
	public int update(String query) throws Exception {
		Connection con= MyConnection.getObj().getConnection();
		Statement st=con.createStatement();
		int i= st.executeUpdate(query);
		return i;
		
	}

 
	public int delete(String query) {
		return 0;
		
	}

 
	public ResultSet select(String query) throws Exception {
		MyConnection.getObj();
		Connection con= MyConnection.getObj().getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		return rs;
		
	}

}
