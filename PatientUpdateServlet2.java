package controller;

import java.io.IOException;
import controller.service.Bean;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import controller.service.PatientSearchBean;
import model.bean.InsertForward;
import model.bean.PatDiagEntity;

 
@WebServlet("/PatientUpdateCommandServlet.do")
public class PatientUpdateServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PatientUpdateServlet2() {
        super();
         
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String patientid=request.getParameter("patientid");
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
		
		 
		String rid=request.getParameter("rid");  
		String patid=request.getParameter("patid"); 
		String phyid=request.getParameter("phyid"); 
		String sdate=request.getParameter("sdate");
		String trdate=request.getParameter("trdate");
		String actuald1=request.getParameter("actuald1");
		String ranged1=request.getParameter("ranged1");
		String actuald2=request.getParameter("actuald2");
		String ranged2=request.getParameter("ranged2");
		String actuald3=request.getParameter("actuald3");
		String ranged3=request.getParameter("ranged3");
		String actuald4=request.getParameter("actuald4");
		String ranged4=request.getParameter("ranged4");
		String actuald5=request.getParameter("actuald5");
		String ranged5=request.getParameter("ranged5");
		String actuald6=request.getParameter("actuald6");
		String ranged6=request.getParameter("ranged6");
		String text=request.getParameter("text1");
		String otherinfo=request.getParameter("text2");
		 
		PatDiagEntity f=new PatDiagEntity(rid,patid,phyid,sdate,trdate,actuald1,ranged1,actuald2,ranged2,actuald3,ranged3,actuald4,ranged4,actuald5,ranged5,actuald6,ranged6,text,otherinfo);
		
		System.out.println(f.getActuald1()+" "+f.getActuald2()+" "+f.getActuald3()+" "+f.getActuald4()+" "+f.getActuald5()+" "+f.getActuald6());
		System.out.println(f.getSdate() +" " +f.getTrdate() +" " +f.getPhyid()+" "+f.getPatid()+" "+f.getReportid() );
		System.out.println(f.getRanged1() +" " +f.getRanged2() +" " +f.getRanged3() +" " +f.getRanged4() +" " +f.getRanged5() +" " +f.getRanged6() +" ");
		System.out.println(f.getOtherinfo()+" "+f.getText());
		
		
		try
		{
		System.out.println(patientid+" " +fname+" " +lname+" " +age+" " +gender+" " +dob+" " +contact+" " +altcontact+" " +email+" " +pswd+" " +address1+" " +address2+" " +city+" " +state+" " +zipcode+" ");
		
		InsertForward f1=new InsertForward(patientid,fname,lname,age,gender,dob,contact,altcontact,email,pswd,address1,address2,city,state,zipcode);
		PatientSearchBean ahs1=new PatientSearchBean();
		
		System.out.println("4a");
		
		
		if(f1.getFname()==null)
		{
			String diagnosis=ahs1.diagnosisUpdate(f);
			System.out.println(" q "+diagnosis.equals("success"));
			if(diagnosis.equals("success"))
			{
	
			     response.getWriter().print("diagnosis successful");
			    //response.sendRedirect("view/menu.jsp");
			     
			}
			else
			{
				response.getWriter().print("fail");
			}
		}
		else
		{
			String output=ahs1.profileUpdate(f1);
		  if(output.equals("success"))
		    {
			     response.getWriter().print("profile sucessful");
			     //response.sendRedirect("/PatientUpdateCommandServlet.do");
		     }
		    else
		     {
			     response.getWriter().print("hello");
		     }
		
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

		
		
		
		
		
		
		
	}

}
