package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.service.PatientSearchBean;
import model.bean.PatDiagEntity;
import model.bean.PatientSearchEntity;
import model.bean.PatientSearchEntityView;

@WebServlet("/PatientUpdateDiagnosisServlet.do")
public class PatientUpdateDiagnosisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public PatientUpdateDiagnosisServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			System.out.println("111");
			HttpSession session=request.getSession(false);
			
			
			PatientSearchBean ahs=new PatientSearchBean();
			
			 String st=request.getParameter("patientid");
			//String st1=(String)session.getAttribute("patid11");
			System.out.println("lll "+st);
             session.setAttribute("patientid", st);
			PatDiagEntity al1=ahs.getDiagnosisDetails(st);
		    System.out.println("77");
			session.setAttribute("id1", al1);
			 System.out.println("88");
			  
			  response.sendRedirect("view/PatientUpdateView.jsp");
//		  RequestDispatcher rd=request.getRequestDispatcher("view/PatientUpdateView.jsp");
//		rd.forward(request,response); 
 		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

		
		
		
		
	}


