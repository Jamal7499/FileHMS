package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.service.DrInsertionBean;
import model.bean.DrInsertionEntity;

@WebServlet("/DoctorInsertionServlet12.do")
public class DoctorInsertionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DoctorInsertionServlet1() {
        super();}
         

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		System.out.println("ddd");
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
		String hospitality=request.getParameter("hospitality");
		String speciality=request.getParameter("speciality");
		String degree=request.getParameter("degree");
		String WorkingHours=request.getParameter("Working Hours");
		String  pid="select physician_id.NEXTVAL from dual";
		System.out.println(pid+" "+fname+lname+" "+age+" "+gender+" "+dob+" "+contact+" "+altcontact+" "+email+" "+pswd+" "+address1+" "+address2+" "+city+" "+state+" "+zipcode+" "+hospitality+" "+speciality+" "+WorkingHours);
		
		DrInsertionBean b= new DrInsertionBean();
		
		
		try{
			
			String  physicianid=b.select(pid);
			System.out.println(physicianid);
			DrInsertionEntity f=new DrInsertionEntity(physicianid,fname,lname,age,gender,dob,contact,altcontact,  email,   pswd,  address1,  address2,  city,  state, zipcode,hospitality,speciality,degree,WorkingHours);
			
			String output=b.buildQuery1(f);
			
			
			if(output.equals("successful"))
			{
				
				response.sendRedirect("view/menu.jsp");
				System.out.println("pass");
				//response.getWriter().print("pass");
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


