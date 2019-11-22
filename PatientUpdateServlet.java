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
import model.bean.InsertForward;
import model.bean.PatDiagEntity;
import model.bean.PatientSearchEntity;
import model.bean.PatientSearchEntityView;

@WebServlet("/PatientUpdateServlet.do")
public class PatientUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
    public PatientUpdateServlet() {
        super();
   
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			System.out.println("1");
			HttpSession session=request.getSession(false);
			String patid=request.getParameter("patid");
			String patname=request.getParameter("patname");
			System.out.println("2 "+patid);
			
			PatientSearchEntityView psb= new PatientSearchEntityView(patname,patid);
			System.out.println("3 "+patname);
			
			PatientSearchBean ahs=new PatientSearchBean();
			System.out.println("4");
		    ArrayList<PatientSearchEntity> al=ahs.getDetails(psb);
		    System.out.println("5");
			session.setAttribute("id", al);
			
		
			//RequestDispatcher rd=request.getRequestDispatcher("/PatientUpdateDiagnosisServlet.do");
// 			RequestDispatcher rd=request.getRequestDispatcher("view/PatientUpdateList.jsp");
// 			rd.forward(request,response);
			response.sendRedirect("view/PatientUpdateList.jsp");
			
			 
			
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

		
	}


