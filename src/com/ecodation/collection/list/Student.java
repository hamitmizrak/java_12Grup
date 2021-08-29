package com.ecodation.collection.list;


public class Student {

	private String adi;
	
	public Student ( ) {
		// TODO Auto-generated constructor stub
	}

	public Student ( String adi ) {
		super ( );
		this.adi = adi;
	}

	@Override
	public String toString ( ) {
		return "Student [adi=" + adi + "]";
	}

	
	public String getAdi ( ) {
		return adi;
	}

	
	public void setAdi ( String adi ) {
		this.adi = adi;
	}
	
	
	
	
}
