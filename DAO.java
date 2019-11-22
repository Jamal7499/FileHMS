package model.dao;
import java.sql.*;
import model.bean.InsertForward;

public interface DAO {

	int insert(InsertForward f) throws Exception;
	int update(String query) throws Exception;
	int delete(String query);
	ResultSet select(String query)throws Exception;
}
