package com.te.demo.prac;

public class Address {
	private String hNo;
	private String city;

	public String gethNo() {
		return hNo;
	}

	public void sethNo(String hNo) {
		this.hNo = hNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String hNo, String city) {
		this.hNo = hNo;
		this.city = city;
	}

	public Address(Address address) {
		this(address.getCity(), address.gethNo());
	}

	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", city=" + city + "]";
	}
}
