package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import controller.service.PatDiagBean;
import model.bean.PatDiagEntity;

@WebServlet("/PatientDiagnosisServlet.do")
public class PatDiagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PatDiagServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
		String rid="select report_id.NEXTVAL from dual";
		//String rid=request.getParameter("rid"); //system generated
		String patid=request.getParameter("patid");// will get form db
		String phyid=request.getParameter("phyid");//system generated
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
		PatDiagBean b=new PatDiagBean();
		
		try{
			String  reportid=b.select(rid);
			PatDiagEntity f=new PatDiagEntity(reportid,patid,phyid,sdate,trdate,actuald1,ranged1,actuald2,ranged2,actuald3,ranged3,actuald4,ranged4,actuald5,ranged5,actuald6,ranged6,text,otherinfo);
			
			/*System.out.println(f.getActuald1()+" "+f.getActuald2()+" "+f.getActuald3()+" "+f.getActuald4()+" "+f.getActuald5()+" "+f.getActuald6());
			System.out.println(f.getSdate() +" " +f.getTrdate() +" " +f.getPhyid()+" "+f.getPatid()+" "+f.getReportid() );
			System.out.println(f.getRanged1() +" " +f.getRanged2() +" " +f.getRanged3() +" " +f.getRanged4() +" " +f.getRanged5() +" " +f.getRanged6() +" ");
			System.out.println(f.getOtherinfo()+" "+f.getText());*/
			
			String output=b.buildQuery(f);
			System.out.println(reportid+"   "+patid);
			response.setContentType("text/html");
			if(output.equals("succesfull"))
			{
				response.sendRedirect("view/menu.jsp");
				//response.getWriter().print("hello");
				response.getWriter().print("<h2>fail</h2>");
			  }
			
			 else
			  {
				response.getWriter().print("<h2>pass</h2>");
				response.sendRedirect("view/menu.jsp");
				
			  }
			}
				catch(Exception e){
				  e.getStackTrace();	
				
				}
				}
		
		
		
	}


