package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.service.PatientSearchBean;
import model.bean.PatDiagEntity;
import model.bean.PatientSearchEntity;

@WebServlet("/PatientDeleteServlet.do")
public class PatientDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public PatientDeleteServlet() {
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
            // session.setAttribute("patientid", st);
			String del=ahs.patientdelete(st);
		    if(del.equals("success"))
		    {
		    	
		        ArrayList<PatientSearchEntity> al=(ArrayList)session.getAttribute("id");
		        int i,j;
		        for( i=0;i<al.size();i++)
		       {
		    	   if(st.equals(al.get(i).getPatientid()))
		    	   {
		    		   System.out.println("deleted FDFS "+i);
				       al.remove(i);
				       System.out.println("REMOVED ");
				       session.setAttribute("id", al);
				       session.setAttribute("delete", "success");
				    	response.sendRedirect("view/PatientUpdateList.jsp");
		    	   } 
		       }
		      
		    }
		    else
		    {
		    	response.getWriter().print("delete unsucessful");
		    }
			System.out.println("77");  
			  //response.sendRedirect("view/PatientUpdateView.jsp");
//		  RequestDispatcher rd=request.getRequestDispatcher("view/PatientUpdateView.jsp");
//		rd.forward(request,response); 
 		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

		
		
		
		
	}


