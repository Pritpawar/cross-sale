package com.wcs.app.cs.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class ProductPriceMapping {
	@Id
	private int pricemappingid;
	
	private double buyingPrice;
	private double sellingPrice;
	
	@ManyToOne
	private Tax tax;

	@OneToOne
	private ProductInformation productInformation;
	
	@ManyToOne
	private VenderInformation venderInformation;
	
	public VenderInformation getVenderInformation() {
		return venderInformation;
	}

	public void setVenderInformation(VenderInformation venderInformation) {
		this.venderInformation = venderInformation;
	}

	public ProductInformation getProductInformation() {
		return productInformation;
	}

	public void setProductInformation(ProductInformation productInformation) {
		this.productInformation = productInformation;
	}


	public double getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "" + pricemappingid + "";
	}

}
