package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogOutServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LogOutServlet() {
		super();
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        // Invalidate the session and removes any attribute related to it
        session.invalidate();

        // Get an HttpSession related to this request, if no session exist don't
        // create a new one. This is just a check to see after invalidation the
        // session will be null.
        session = request.getSession(false);

        response.sendRedirect("/Reimbursement/login");
        
        
    }
	

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
