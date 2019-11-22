package model.dao;

import java.sql.*;
import model.bean.PatDiagEntity;

public interface PatDiagDAO {

	boolean insert(PatDiagEntity f) throws Exception;
	int update(String query) throws Exception;
	int delete(String query);
	ResultSet select(String query)throws Exception;
}
