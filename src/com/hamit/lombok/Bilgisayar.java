package com.hamit.lombok;

import java.io.Serializable;

public class Bilgisayar implements Serializable{
	private static final long serialVersionUID = 4732046243755404990L;
	
	private String bilgisayarAdi;
	private String bilgisayarFiyati;
	private String bilgisayarMarkasi;
	private String bilgisayarFabrikasi;
	
	
	public Bilgisayar ( ) {
		// TODO Auto-generated constructor stub
	}


	public Bilgisayar (
			String bilgisayarAdi , String bilgisayarFiyati , String bilgisayarMarkasi , String bilgisayarFabrikasi
	) {
		super ( );
		this.bilgisayarAdi		= bilgisayarAdi;
		this.bilgisayarFiyati	= bilgisayarFiyati;
		this.bilgisayarMarkasi	= bilgisayarMarkasi;
		this.bilgisayarFabrikasi	= bilgisayarFabrikasi;
	}


	@Override
	public String toString ( ) {
		return "Bilgisayar [bilgisayarAdi=" + bilgisayarAdi + ", bilgisayarFiyati=" + bilgisayarFiyati
				+ ", bilgisayarMarkasi=" + bilgisayarMarkasi + ", bilgisayarFabrikasi=" + bilgisayarFabrikasi + "]";
	}


	@Override
	public int hashCode ( ) {
		final int prime = 31;
		int result = 1;
		result	= prime * result + ((bilgisayarAdi == null) ? 0 : bilgisayarAdi.hashCode ( ));
		result	= prime * result + ((bilgisayarFabrikasi == null) ? 0 : bilgisayarFabrikasi.hashCode ( ));
		result	= prime * result + ((bilgisayarFiyati == null) ? 0 : bilgisayarFiyati.hashCode ( ));
		result	= prime * result + ((bilgisayarMarkasi == null) ? 0 : bilgisayarMarkasi.hashCode ( ));
		return result;
	}


	@Override
	public boolean equals ( Object obj ) {
		if ( this == obj )
			return true;
		if ( obj == null )
			return false;
		if ( getClass ( ) != obj.getClass ( ) )
			return false;
		Bilgisayar other = ( Bilgisayar ) obj;
		if ( bilgisayarAdi == null ) {
			if ( other.bilgisayarAdi != null )
				return false;
		} else if ( !bilgisayarAdi.equals ( other.bilgisayarAdi ) )
			return false;
		if ( bilgisayarFabrikasi == null ) {
			if ( other.bilgisayarFabrikasi != null )
				return false;
		} else if ( !bilgisayarFabrikasi.equals ( other.bilgisayarFabrikasi ) )
			return false;
		if ( bilgisayarFiyati == null ) {
			if ( other.bilgisayarFiyati != null )
				return false;
		} else if ( !bilgisayarFiyati.equals ( other.bilgisayarFiyati ) )
			return false;
		if ( bilgisayarMarkasi == null ) {
			if ( other.bilgisayarMarkasi != null )
				return false;
		} else if ( !bilgisayarMarkasi.equals ( other.bilgisayarMarkasi ) )
			return false;
		return true;
	}


	
	public String getBilgisayarAdi ( ) {
		return bilgisayarAdi;
	}


	
	public void setBilgisayarAdi ( String bilgisayarAdi ) {
		this.bilgisayarAdi = bilgisayarAdi;
	}


	
	public String getBilgisayarFiyati ( ) {
		return bilgisayarFiyati;
	}


	
	public void setBilgisayarFiyati ( String bilgisayarFiyati ) {
		this.bilgisayarFiyati = bilgisayarFiyati;
	}


	
	public String getBilgisayarMarkasi ( ) {
		return bilgisayarMarkasi;
	}


	
	public void setBilgisayarMarkasi ( String bilgisayarMarkasi ) {
		this.bilgisayarMarkasi = bilgisayarMarkasi;
	}


	
	public String getBilgisayarFabrikasi ( ) {
		return bilgisayarFabrikasi;
	}


	
	public void setBilgisayarFabrikasi ( String bilgisayarFabrikasi ) {
		this.bilgisayarFabrikasi = bilgisayarFabrikasi;
	}
	
	
}
