package fajfr.filter.servlet;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class HelloServlet extends HttpServlet {  
	
    public void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {  
    	
    	
        response.setContentType("text/html"); 
        
      //Zde se pomocí response tiskne "práce" filtru pomocí proměnné response
        PrintWriter out = response.getWriter();  
      
        out.print("<br>welcome to servlet<br>");  
          
    }  
  
}