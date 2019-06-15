package com.wcs.app.cs.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcs.app.cs.main.model.BranchProductTarget;
import com.wcs.app.cs.main.service.Iservice;

@CrossOrigin("*")
@RestController
@RequestMapping("/salebm")
public class BranchManagerController 
{
	@Autowired
	Iservice service;
	
	@RequestMapping("/saleBm")
	public String adminData()
	{
		return "Sales Branch Manager";
	}
	
	@RequestMapping(value="/getalldata")
	public List getalldata() {
		
		List  list=service.getinvoiceproductstock();
		return list;
	}
	/*ye dosti hum nahi todenge
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	@RequestMapping(value="/getBranchProductStock")
	public List getBranchProductStock() {
		
		List  list=service.getBranchProductStock();
		return list;
	}
}
