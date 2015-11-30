package org.yatian.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.yatian.entity.keystream;
import org.yatian.service.impl.generateServiceImpl;

public class generateServlet extends HttpServlet {

	private generateServiceImpl generateService = new generateServiceImpl();

	/**
	 * The doPost method of the servlet. <br>
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}
	
	
	/**
	 * The doGet method of the servlet. <br>
	 *
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String method = request.getParameter("method");
		if ("generate".equals(method)) {
			generate(request,response);
		}
	}


	private void generate(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		String times = request.getParameter("times");
		String plaintext = request.getParameter("plaintext");
		String keylength = request.getParameter("keylength");
		//String position = request.getParameter("position");
		keystream keystreamin = new keystream();
		keystreamin.setKeylength(Integer.valueOf(keylength));
		keystreamin.setPlaintext(plaintext);
		keystreamin.setTimes(Integer.valueOf(times));
		
		generateService.generate(keystreamin);
		try {
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
	}

}
