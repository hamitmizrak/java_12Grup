package com.ecodation.generics;


public class GenericsClass <T> {

	private T adi;
	private int dil;
	
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
