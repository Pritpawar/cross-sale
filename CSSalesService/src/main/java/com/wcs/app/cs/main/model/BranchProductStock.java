package com.wcs.app.cs.main.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BranchProductStock {

	@Id
	private int branchProductStock;
	
	@OneToMany
	private Map<ProductPriceMapping,BranchProductStockWiseQuantity> pmap
			=new HashMap<ProductPriceMapping, BranchProductStockWiseQuantity>();
	
	private String date;

	public int getBranchProductStock() {
		return branchProductStock;
	}
	public void setBranchProductStock(int branchProductStock) {
		this.branchProductStock = branchProductStock;
	}
	public Map<ProductPriceMapping, BranchProductStockWiseQuantity> getPmap() {
		return pmap;
	}
	public void setPmap(Map<ProductPriceMapping, BranchProductStockWiseQuantity> pmap) {
		this.pmap = pmap;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
