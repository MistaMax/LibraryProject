package com.library.model;

import com.library.DAO.AuditDAO;
import com.library.DAO.BookDAO;
import com.library.DAO.CustomerDAO;
import com.library.DAO.EmployeeDAO;

public class Library {
	private String name;
	private String location;
	private EmployeeDAO employeeDAO;
	private BookDAO bookDAO;
	private CustomerDAO custDAO;
	private AuditDAO auditDAO;
}
