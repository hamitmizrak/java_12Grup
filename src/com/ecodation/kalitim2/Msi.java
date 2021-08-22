package com.ecodation.kalitim2;


public class Msi  extends Bilgisayar{

	
private String msiOzellik;


public Msi ( ) {
	// TODO Auto-generated constructor stub
}


public Msi ( String adi , String marka , String fiyat,String msiOzellik ) {
	super ( adi , marka , fiyat );
	super.superMethod ( );
	this.msiOzellik=msiOzellik;
}

//Ctrl+Shift+S



public String getMsiOzellik ( ) {
	return msiOzellik;
}


public void setMsiOzellik ( String msiOzellik ) {
	this.msiOzellik = msiOzellik;
}









@Override
public String toString ( ) {
	return "Msi [msiOzellik=" + msiOzellik + ", getFiyat()=" + getFiyat ( ) + ", getAdi()=" + getAdi ( ) + ", getMarka()="
			+ getMarka ( ) + ", getClass()=" + getClass ( ) + ", hashCode()=" + hashCode ( ) + ", toString()="
			+ super.toString ( ) + "]";
}

	
	
	
	
}
