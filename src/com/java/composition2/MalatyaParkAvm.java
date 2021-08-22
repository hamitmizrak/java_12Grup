package com.java.composition2;

import java.util.ArrayList;
import java.util.List;

//1
public class MalatyaParkAvm {

	private String avmAdi;
	
	//composition
	private List <MediaMarket> mediaMarketList;
	
	public MalatyaParkAvm ( ) {
		// TODO Auto-generated constructor stub
	}

	public MalatyaParkAvm ( String avmAdi ) {
	if(mediaMarketList==null) {
		this.mediaMarketList=new ArrayList <MediaMarket>();
	}
		this.avmAdi = avmAdi;
	}

	@Override
	public String toString ( ) {
		return "MalatyaParkAvm [avmAdi=" + avmAdi + "]";
	}

	
	public String getAvmAdi ( ) {
		return avmAdi;
	}

	
	public void setAvmAdi ( String avmAdi ) {
		this.avmAdi = avmAdi;
	}
	//composition getter and setter

	
	public List <MediaMarket> getMediaMarketList ( ) {
		return mediaMarketList;
	}

	
	public void setMediaMarketList ( List <MediaMarket> mediaMarketList ) {
		this.mediaMarketList = mediaMarketList;
	}
	
	
	
}
