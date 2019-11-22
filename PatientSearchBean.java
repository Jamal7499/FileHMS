package controller.service;

import java.util.ArrayList;

import model.bean.InsertForward;
import model.bean.PatDiagEntity;
import model.bean.PatientSearchEntity;
import model.bean.PatientSearchEntityView;
import model.dao.PatientSearchDAOImpl;

public class PatientSearchBean {
    
	 // select query for patients
	PatientSearchDAOImpl ald=new PatientSearchDAOImpl();
	public ArrayList<PatientSearchEntity> getDetails(PatientSearchEntityView psb) throws Exception 
	{
		ArrayList<PatientSearchEntity> output=ald.getDetails(psb);
			return output;
	  }
	
	
	
	
	//select query for diagnosis
	public PatDiagEntity getDiagnosisDetails(String psb) throws Exception 
	  {
		PatDiagEntity diagDetail=ald.getDiagnosisDetailsDAO(psb);
			return diagDetail;
	  }
	
	
	
	
	
	//update query for  patient profile
	PatientSearchDAOImpl ald1=new PatientSearchDAOImpl();
	public String profileUpdate(InsertForward f1) throws Exception
	{
		 int output1=ald1.profileUpdate(f1);
		if(output1==1)	
		   return "success";
		else
			return "unsucess";
	}
	
	
	
	
	
     //upadte query for diagnosis details	
	 public String diagnosisUpdate(PatDiagEntity f1) throws Exception
		{
			int output1=ald1.diagnosisUpdate(f1);
			System.out.println("w " +(output1==1));
			if(output1==1)	
			   return "success";
			else
				return "unsucess";
		}
	 
	 
	 //patient delete query
	 public String patientdelete(String pat) throws Exception
		{
			int output1=ald1.patientdeletedao(pat);
			System.out.println("w " +(output1==1));
			if(output1==1)	
			   return "success";
			else
				return "unsucess";
		}

}
