package model.dao;

import java.util.ArrayList;


import model.bean.DrInsertionEntity;
import model.bean.DrSearchEntityView;

public class DrSearchDAO {
     public interface AdminHomeDAO {
		ArrayList<DrInsertionEntity> getDetails(DrSearchEntityView psb) throws Exception;
		 
	}
}




