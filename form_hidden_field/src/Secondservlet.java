

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Secondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Secondservlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter w=response.getWriter();
		//fetch input data from Firstservlet.
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		String s3=request.getParameter("t3");
		//response from browser to display form.
		w.println("<form action='Thirdservlet' method='post'>");
		w.println("Skills:<input type='text' name='t4'><br><br>");
		w.println("Salary:<input type='text' name='t5'><br><br>");
		w.println("<input type='submit'>");
		//stores the fetch data from Firstservlet in hidden fields.
		w.println("<input type='hidden' name='t1' value="+"'"+s1+"'>");
		w.println("<input type='hidden' name='t2' value="+"'"+s2+"'>");
		w.println("<input type='hidden' name='t3' value="+"'"+s3+"'>");
		w.println("</form>");
		
	}
	

}
