package com.shiva.model;

public class Company {
private String CompanyName;
private String owner;
public Company(String companyName, String owner) {
	super();
	CompanyName = companyName;
	this.owner = owner;
}
public String getCompanyName() {
	return CompanyName;
}
public void setCompanyName(String companyName) {
	CompanyName = companyName;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
@Override
public String toString() {
	return "Company [CompanyName=" + CompanyName + ", owner=" + owner + "]";
}

}
