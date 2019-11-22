package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.bean.InsertForward;
import javax.servlet.RequestDispatcher;
import controller.service.*;

@WebServlet("/Patientregistration.do")

public class PatientInsertion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PatientInsertion() {
        super();
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String age=request.getParameter("age");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String contact=request.getParameter("cont");
		String altcontact=request.getParameter("cont2");
		String email=request.getParameter("email");
		String pswd=request.getParameter("pass");
		String address1=request.getParameter("add1");
		String address2=request.getParameter("add2");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String zipcode=request.getParameter("zipcode");
		String patientquery="select patient_id.NEXTVAL from dual";
		Bean1 b= new Bean1();
		
		System.out.println("1");
		try{
			String patientid=b.select(patientquery);
			System.out.println("ggg1  "+patientid);

			InsertForward f=new InsertForward(patientid,fname,lname,age,gender,dob,contact,altcontact,  email,   pswd,  address1,  address2,  city,  state, zipcode);
			String output=b.buildQuery1(f);
			System.out.println("gggkk  "+patientid);
			if(output.equals("succesfull"))
			{
				
				response.sendRedirect("view/patientdiagnosis.jsp?patientid="+patientid);
				response.getWriter().print("pass ");
			  }
			
			 else
			  {
				response.getWriter().print("fail");
				
			  }
			}
				catch(Exception e){
				  e.getStackTrace();	
				
				}
				}
		
		
		
	
	}


