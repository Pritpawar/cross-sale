package com.wcs.app.cs.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saleadmin")
public class AdminController 
{
	@RequestMapping("/saleAdmin")
	public String adminData()
	{
		return "Sales Admin";
	}
}
