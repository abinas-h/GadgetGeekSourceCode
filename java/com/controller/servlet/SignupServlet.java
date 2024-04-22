package com.controller.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.DatabaseController;
import com.controller.Encription;
import com.model.User;
import com.util.StringUtil;

	


@WebServlet("/signup")
public class SignupServlet extends HttpServlet{
	
	DatabaseController databaseController = new DatabaseController();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter(StringUtil.FIRST_NAME);
		String lname = req.getParameter(StringUtil.LAST_NAME);
		String username = req.getParameter(StringUtil.USER_NAME);
		String email = req.getParameter(StringUtil.EMAIL);
		String gender = req.getParameter(StringUtil.GENDER);
		LocalDate dob = LocalDate.parse(req.getParameter(StringUtil.DOB));
		String phoneNumber = req.getParameter(StringUtil.PHONE);
		String password = Encription.encrypt(req.getParameter(StringUtil.PASSWORD));
		String address = req.getParameter(StringUtil.ADDRESS);
		
//		this is the last work done where adding new user work is done 
		User user = new User(fname, lname, dob, gender, email, phoneNumber, username, password, address);
		
		
		int result = databaseController.addUser(user);
		
		if(result == 1) {
			System.out.println("vayo hai vayo");
		}else if (result == 0) {
			System.out.println("khoy k ho mileyna");
		}else {
			System.out.println("hudai vayena");
		}
	}
	
}
