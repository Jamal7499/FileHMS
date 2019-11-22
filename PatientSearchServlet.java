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



@WebServlet("/PatientSearchServlet1.do")
public class PatientSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PatientSearchServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			System.out.println("1");
			HttpSession session=request.getSession();
			String patid=request.getParameter("patid"); 
			String patname=request.getParameter("patname"); 
			//System.out.println("2"+patname);
			PatientSearchEntityView psb= new PatientSearchEntityView(patname,patid);
			//System.out.println("3");
			PatientSearchBean ahs=new PatientSearchBean();
			//System.out.println("4");
		    ArrayList<PatientSearchEntity> al=ahs.getDetails(psb);
		   // System.out.println("55");
		    session.setAttribute("id", al);
		    //System.out.println("66");
		    
			
		response.sendRedirect("view/PatientSearch.jsp");
//		RequestDispatcher rd=request.getRequestDispatcher("view/PatientSearch.jsp");
//		rd.forward(request,response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

		
		
		
	}


