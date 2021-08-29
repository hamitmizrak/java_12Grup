package com.ecodation.generics;

public class GenericsClass3 <T> {

	//nesne değişkenleri
	private T adi;
	private int dil;
	
	
	public GenericsClass3 ( ) {}
	
	public GenericsClass3 ( T adi , int dil ) {
		this.adi	= adi;
		this.dil	= dil;
	}
	
	public void deneme(String adi) {}
	
	public <K extends Number> String deneme(K adi) { return null;}

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
