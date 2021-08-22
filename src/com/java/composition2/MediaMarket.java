package com.java.composition2;

//N
public class MediaMarket {

	private String marketAdi;
	private String fiyat;
	
	//composition
	private MalatyaParkAvm malatyaParkAvm;
	
	
	public MediaMarket ( ) {
		// TODO Auto-generated constructor stub
	}


	public MediaMarket ( String marketAdi , String fiyat ) {
		super ( );
		this.marketAdi	= marketAdi;
		this.fiyat	= fiyat;
	}


	@Override
	public String toString ( ) {
		return "MediaMarket [marketAdi=" + marketAdi + ", fiyat=" + fiyat + "]";
	}


	
	public String getMarketAdi ( ) {
		return marketAdi;
	}


	
	public void setMarketAdi ( String marketAdi ) {
		this.marketAdi = marketAdi;
	}


	
	public String getFiyat ( ) {
		return fiyat;
	}


	
	public void setFiyat ( String fiyat ) {
		this.fiyat = fiyat;
	}
	//composition getter and setter


	
	public MalatyaParkAvm getMalatyaParkAvm ( ) {
		return malatyaParkAvm;
	}


	
	public void setMalatyaParkAvm ( MalatyaParkAvm malatyaParkAvm ) {
		this.malatyaParkAvm = malatyaParkAvm;
	}
	
	
	
}
