package com.controller.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.DatabaseController;
import com.controller.Encription;
import com.util.StringUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	DatabaseController databaseController = new DatabaseController();
       
    
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String userName = req.getParameter(StringUtil.USER_NAME);
			String password = Encription.encrypt(req.getParameter(StringUtil.PASSWORD));
			
			
			
			
			int result = databaseController.getUserLoginInfo(userName, password);
			
			if(result == 1 ) {
				System.out.println("login ne vayo haii");
			}else if (result == 0) {
				System.out.println("tero ta password ra user name nai mileyna");
			}else {
				System.out.println("tero ta kai ne mileyna vai");
			}
			
			
		
		}

}
