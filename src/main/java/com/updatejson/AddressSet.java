package com.updatejson;

public class AddressSet {
	
	private String addressType;
	private String contact;
	private String district;
	public AddressSet(String addressType, String contact, String district) {
		super();
		this.addressType = addressType;
		this.contact = contact;
		this.district = district;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

}
