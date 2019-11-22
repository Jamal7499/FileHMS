package controller.service;
import model.dao.PatDiagDAOImpl;
import model.bean.PatDiagEntity;
import model.dao.DAOImpl;
import model.dao.MyConnection;
import java.sql.*;
public class PatDiagBean {

	public String buildQuery(PatDiagEntity f) throws Exception
	{
		
		PatDiagDAOImpl daoimpl1=new PatDiagDAOImpl();
		boolean status = daoimpl1.insert(f);
		System.out.println(status);
		if(status )
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
