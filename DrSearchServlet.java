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
import controller.service.DrSearchBean;
import model.bean.DrInsertionEntity;
import model.bean.DrSearchEntityView;



@WebServlet("/DoctorSearchServlet.do")
public class DrSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DrSearchServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			System.out.println("1");
			HttpSession session=request.getSession(false);
			String drid=request.getParameter("drid");
			System.out.println("2"+drid);
			String drname=request.getParameter("drname");
			DrSearchEntityView psb= new DrSearchEntityView(drname,drid);
			System.out.println("dr id "+psb.getDrid() +" dr name" +psb.getDrname());
			DrSearchBean ahs=new DrSearchBean();
			System.out.println("4");
		    ArrayList<DrInsertionEntity> al=ahs.getDetails(psb);
		    System.out.println("5");
		
			session.setAttribute("id", al);
			
		response.sendRedirect("view/DrSearchView.jsp");
		
		/*RequestDispatcher rd=request.getRequestDispatcher("view/DrSearchView.jsp");
		rd.forward(request,response);*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

		
		
		
	}


