package model.dao;

import java.util.ArrayList;

import model.bean.PatientSearchEntity;
import model.bean.PatientSearchEntityView;

public class PatientSearchDAO {
     public interface AdminHomeDAO {
		ArrayList<PatientSearchEntity> getDetails(PatientSearchEntityView psb) throws Exception;
		ArrayList<PatientSearchEntity> profileUpdate(PatientSearchEntityView psb) throws Exception;
		ArrayList<PatientSearchEntity> diagnosisUpdate(PatientSearchEntityView psb) throws Exception;
		
	}
}
