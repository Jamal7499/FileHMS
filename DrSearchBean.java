package controller.service;

import java.util.ArrayList;

import model.bean.DrSearchEntityView;

import model.bean.DrInsertionEntity;
import model.dao.DrSearchDAOImpl;

public class DrSearchBean {

	public ArrayList<DrInsertionEntity> getDetails(DrSearchEntityView psb) throws Exception 
	  {
		
		DrSearchDAOImpl ald=new DrSearchDAOImpl();
		ArrayList<DrInsertionEntity> output=ald.getDetails(psb);
		
			return output;
	  }

}







