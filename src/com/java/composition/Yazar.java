package com.java.composition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Composition: has-a
 * ilişkiler
 * Yazar(1) Kitaplar(N)
 */

//1
public class Yazar {
	
	protected String yazarAdi;
	protected String yazarSoyadi;
	protected Date yazarTarih;
	
	//composition
	protected List <Kitap> kitaplar;
	
	
	public Yazar ( ) {
		
	
	}
	
	public Yazar ( String yazarAdi , String yazarSoyadi  ) {
		this.yazarAdi		= yazarAdi;
		this.yazarSoyadi	= yazarSoyadi;
		kitaplar=new ArrayList<Kitap> ( );
	
	}


	@Override
	public String toString ( ) {
		return "Yazar [yazarAdi=" + yazarAdi + ", yazarSoyadi=" + yazarSoyadi + ", yazarTarih=" + yazarTarih + "]";
	}


	//getter and setter 
	public String getYazarAdi ( ) {
		return yazarAdi;
	}


	
	public void setYazarAdi ( String yazarAdi ) {
		this.yazarAdi = yazarAdi;
	}


	
	public String getYazarSoyadi ( ) {
		return yazarSoyadi;
	}


	
	public void setYazarSoyadi ( String yazarSoyadi ) {
		this.yazarSoyadi = yazarSoyadi;
	}


	
	public Date getYazarTarih ( ) {
		return yazarTarih;
	}


	
	public void setYazarTarih ( Date yazarTarih ) {
		this.yazarTarih = yazarTarih;
	}


	//getter and setter composition
	public List <Kitap> getKitaplar ( ) {
		return kitaplar;
	}


	
	public void setKitaplar ( List <Kitap> kitaplar ) {
			
		this.kitaplar = kitaplar;
	}


	

	
	
	

	
}
