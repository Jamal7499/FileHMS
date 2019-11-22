package controller;
import model.bean.*;
import controller.service.Bean;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public MServlet() {
        super();
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String unm=request.getParameter("t1");
		String pswd=request.getParameter("p1");
		Bean b= new Bean();
		
	    try{
		Forward output=b.buildQuery(unm, pswd);
		response.getWriter().print(pswd);
		if(output.getPassword().equals(pswd))
		{
			
			HttpSession session=request.getSession();
			session.setAttribute("output",output);
			String a="proxy";
			session.setAttribute("delete", a);// for delete session further
			response.sendRedirect("view/menu.jsp");
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


