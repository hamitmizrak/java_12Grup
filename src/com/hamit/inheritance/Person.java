package com.hamit.inheritance;


public class Person {

	//access identifier
	/*
	 * 1-) public==> her yerden erişim sağlayabiliriz.
	 * 2-) protected ==> sadece aynı pakettekiler erişim sağlayabilir farklı pakettekiler erişim sağlayamaz. ancak subClass'a yani extends ise erişim sağlayabilir.
	 * 3-) private ==> aynı paketin aynı classında sadece erişim apabilirsin
	 * 4-) default ==> sadece aynı pakettekiler erişim sağlayabilir.
	 * 
	 * NOT: extends kullanacaksam yani abstract yani inheritance için nesne değişkenleri protected
	 */
	
	protected String adi;
	protected String soyadi;
	protected int yas;
	
	protected String genelNesne;
	
	//aynı paket aynı class
	//aynı paket farklı class
	//farklı paket
	//sub class
	
	//aynı paket aynı class
	public void deneme() {
		System.out.println ( this.genelNesne );
	}
	
	
	public Person ( ) {
		// TODO Auto-generated constructor stub
	}


	public Person ( String adi , String soyadi , int yas ) {
		this.adi		= adi;
		this.soyadi	= soyadi;
		this.yas		= yas;
	}


	@Override
	public String toString ( ) {
		return "Person [adi=" + adi + ", soyadi=" + soyadi + ", yas=" + yas + "]";
	}


	
	public String getAdi ( ) {
		return adi;
	}


	
	public void setAdi ( String adi ) {
		this.adi = adi;
	}


	
	public String getSoyadi ( ) {
		return soyadi;
	}


	
	public void setSoyadi ( String soyadi ) {
		this.soyadi = soyadi;
	}


	
	public int getYas ( ) {
		return yas;
	}


	
	public void setYas ( int yas ) {
		this.yas = yas;
	}
	
}
