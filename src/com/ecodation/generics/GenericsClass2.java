package com.ecodation.generics;


public class GenericsClass2 <T> {

	//nesne değişkenleri
	private T adi;
	private int dil;
	
	
	public GenericsClass2 ( ) {}
	
	public GenericsClass2 ( T adi , int dil ) {
		this.adi	= adi;
		this.dil	= dil;
	}

	//getter and setter
	public T getAdi ( ) {
		return adi;
	}
	
	public void setAdi ( T adi ) {
		this.adi = adi;
	}
	
	public int getDil ( ) {
		return dil;
	}
	
	public void setDil ( int dil ) {
		this.dil = dil;
	}
	
	
}
