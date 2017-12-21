package fajfr.filter.testFilter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFilter implements Filter {
	private static final Logger log = LoggerFactory.getLogger(MyFilter.class);
	
	public void init(FilterConfig arg0) throws ServletException {  
		//Aby mi to vypisovalo informace na konsoli, musím mít ve zdrojích log4j.xlm!!
		log.info("Ted se inicializuje Filter");
	}
	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {  
		log.info("Pred zpracovanim pozadavku 1"); 
		
	    PrintWriter out=resp.getWriter();
	    out.print("filter is invoked before");  
	    
	    //Toto předá požadavky HelloServlet.java aby na něj vytiskli out.print()!!
	    //Pomocí  Response resp je vytiskne
	    chain.doFilter(req, resp);//sends request to next resource 
	    
	    log.info("Po zpracovani pozadavku");
	          
	    out.print("filter is invoked after");  
	} 	
	    public void destroy() {
	    	log.info("Likvidace MyFilter");
	    	
	    }  

}
