package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DestinationServelet
 */
@WebServlet("/DestinationServelet")
public class DestinationServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletRequest request;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DestinationServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.setContentType("text/html");
		//RequestDispatcher rd=request.getRequestDispatcher("SourceServelet.html");
		//rd.include(request, response);
		PrintWriter pw=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("SourceServelet.html");
		rd.include(request, response);
		pw.println("This is Destination Servelet "+"</br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}
