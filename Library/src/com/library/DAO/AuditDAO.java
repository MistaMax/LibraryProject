package com.library.DAO;

import java.util.ArrayList;
import java.util.List;

import com.library.model.Audit;

public class AuditDAO {
	private static AuditDAO instance = null;
	private List<Audit> audits;
	
	private AuditDAO() {
		audits = new ArrayList<Audit>();
	}
	
	public static AuditDAO getInstance() {
		if(instance == null)
			instance = new AuditDAO();
		return instance;
	}
	
	public List<Audit> getAudits(){
		return audits;
	}
}
