package com.ecodation.kalitim2;


public class Bilgisayar {

	private String adi;
	private String marka;
	private String fiyat;
	
	
	public Bilgisayar ( ) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Bilgisayar ( String adi , String marka , String fiyat ) {
		this.adi		= adi;
		this.marka	= marka;
		this.fiyat	= fiyat;
	}


	public void superMethod() {
		System.out.println ( "MErhabalar superMEthod" );
	}


	public String getFiyat ( ) {
		return fiyat;
	}

	
	public void setFiyat ( String fiyat ) {
		this.fiyat = fiyat;
	}

	public String getAdi ( ) {
		return adi;
	}
	
	public void setAdi ( String adi ) {
		this.adi = adi;
	}
	
	public String getMarka ( ) {
		return marka;
	}
	
	public void setMarka ( String marka ) {
		this.marka = marka;
	}
	
	
}
