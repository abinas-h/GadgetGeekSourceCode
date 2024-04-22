package com.util;

public class StringUtil {
	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String USER_NAME = "userName";
	public static final String EMAIL  = "email";
	public static final String GENDER  = "gender";
	public static final String DOB = "dob";
	public static final String PHONE = "phoneNumber";
	public static final String PASSWORD  = "password";
	public static final String ADDRESS  = "address";
	public static final String SEARCH_PRODUCT  = "search";
	
	
	
	public static final String INSERT_USER = "INSERT INTO USERS"+
										"(user_name, first_name, last_name, dob, gender, email, phone_number,password, address)"
										+ "VALUES(?,?,?,?,?,?,?,?,?)";
	
	public static final String GET_LOGIN_INFO = "SELECT * FROM users where user_name =? AND password =?";
	public static final String PRODUCT_SEARCH = "SELECT * FROM product WHERE NAME like ? ";
	
	
	
	public static final String SUCCESS_REGISTER_MESSAGE = "Successfully Registered";
	public static final String REGISTER_ERROR_MESSAGE	= "Please correct the form data";
	public static final String SERVER_ERROR_MESSAGE		= "An unexpected server error occurred";
	public static final String SUCCESS_MESSAGE			= "successMessage";
	public static final String ERROR_MESSAGE			= "errorMessage";
}
