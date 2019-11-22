package model.dao;

import java.sql.*;
import model.bean.DrInsertionEntity;

public interface DrInsertionDAO {
	
	int insert(DrInsertionEntity d) throws Exception;
	int update(String query) throws Exception;
	int delete(String query);
	ResultSet select(String query)throws Exception;

}
