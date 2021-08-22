package com.java.composition;

import java.util.Date;

//N
public class Kitap {
	
	protected String kitapAdi;
	protected String kitapFiyati;
	protected Date kitapTarih;
	
	//composition
	protected Yazar yazar;
	
	
	public Kitap ( ) {
		// TODO Auto-generated constructor stub
	}


	public Kitap ( String kitapAdi , String kitapFiyati  ) {
		super ( );
		this.kitapAdi		= kitapAdi;
		this.kitapFiyati	= kitapFiyati;
	}


	@Override
	public String toString ( ) {
		return "Kitap [kitapAdi=" + kitapAdi + ", kitapFiyati=" + kitapFiyati + ", kitapTarih=" + kitapTarih + "]";
	}


	
	public String getKitapAdi ( ) {
		return kitapAdi;
	}


	
	public void setKitapAdi ( String kitapAdi ) {
		this.kitapAdi = kitapAdi;
	}


	
	public String getKitapFiyati ( ) {
		return kitapFiyati;
	}


	
	public void setKitapFiyati ( String kitapFiyati ) {
		this.kitapFiyati = kitapFiyati;
	}


	
	public Date getKitapTarih ( ) {
		return kitapTarih;
	}


	
	public void setKitapTarih ( Date kitapTarih ) {
		this.kitapTarih = kitapTarih;
	}
	
	//getter and setter composition
	public Yazar getYazar ( ) {
		return yazar;
	}


	
	public void setYazar ( Yazar yazar ) {
		this.yazar = yazar;
	}
	
	
	
}
