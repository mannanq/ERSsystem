package com.revature.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AllPendingRequests
 */
//@WebServlet("/allpending")
public class AllPendingRequests extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllPendingRequests() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = null;
		String password = null;
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("user_name") == null && session.getAttribute("password")== null) {
			response.sendRedirect("/Reimbursement/login");
		}else {
						
			 username = (String) session.getAttribute("user_name");
			 password = (String) session.getAttribute("password");
			 
			response.setHeader("Cache-Control", "no-cahce, no-store, must-revalidate");

			 request.getRequestDispatcher("Views/AllPending.html").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
