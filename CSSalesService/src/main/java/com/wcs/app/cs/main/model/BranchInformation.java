package com.wcs.app.cs.main.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BranchInformation {
	@Id
	private String branchCode;
	private String branchName;
	@ManyToOne
	private State state;
	@ManyToOne
	private District district;
	private String branchAddress;
	private int branchPincode;
	private long branchContactNumber;
	private String branchEmailId;
	
	private String branchStatus;
	private String branchType;
	private String openingDate;

	public String getBranchType() {
		return branchType;
	}

	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public int getBranchPincode() {
		return branchPincode;
	}

	public void setBranchPincode(int branchPincode) {
		this.branchPincode = branchPincode;
	}

	public long getBranchContactNumber() {
		return branchContactNumber;
	}

	public void setBranchContactNumber(long branchContactNumber) {
		this.branchContactNumber = branchContactNumber;
	}

	public String getBranchEmailId() {
		return branchEmailId;
	}

	public void setBranchEmailId(String branchEmailId) {
		this.branchEmailId = branchEmailId;
	}


	public String getBranchStatus() {
		return branchStatus;
	}

	public void setBranchStatus(String branchStatus) {
		this.branchStatus = branchStatus;
	}

	public String getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}



	
}
