package com.controller.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.controller.DatabaseController;
import com.model.Product;
import com.util.StringUtil;


@WebServlet(asyncSupported = true, urlPatterns = { "/SearchServlet" })
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String searchProduct = "%"+request.getParameter(StringUtil.SEARCH_PRODUCT)+"%"; 
		
		DatabaseController databaseController = new DatabaseController();
		
		
		ArrayList<Product> products = databaseController.getProduct(searchProduct);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("productList", products);
		
	}

}
