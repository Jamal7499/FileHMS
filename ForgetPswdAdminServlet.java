package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.service.Bean;
import model.bean.Forward;

@WebServlet("/ForgetPswdAdminServlet")
public class ForgetPswdAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ForgetPswdAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fname=request.getParameter("fname1");
		//String lname=request.getParameter("lname");
		String dob=request.getParameter("date");
		String unm=request.getParameter("user");
		String pswd= (null);
		String result;
		
		//HttpSession session=request.getSession();
		
		System.out.println("values from " +"fname " +fname +" dob "+dob+" unm "+unm);
          Bean b= new Bean();
	    try{
	    response.setContentType("text/html");	
		Forward out=b.ForgetPassword(unm );
		System.out.println("1");
		System.out.println("fname "+out.getF_name()+" lname "+out.getL_name()+" dob "+out.getDob()+" unm "+unm);
		if((out.getF_name()).equals(fname) && (out.getDob()).equals(dob))	
		{
			pswd=out.getPassword();
			System.out.println("password "+pswd);
			response.getWriter().print(out.getAdmin_id()+"<br>"+out.getPassword());
			//this.getServletContext().setAttribute("out", out);
		}
		else
		{
			result="wrong";
			System.out.println("wrong ");
			response.getWriter().print("wrong");
			//this.getServletContext().setAttribute("result", result);
		}
		
		
		
		}
			catch(Exception e){
			  e.getStackTrace();	
			
			}
	    
	    
	    
	    
	    
			}
			
	}


