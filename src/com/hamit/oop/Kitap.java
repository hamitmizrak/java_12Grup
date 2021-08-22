package com.hamit.oop;

public class Kitap {

	//field ==> nesne değişkenleri
	private String kitapAdi;
	private double kitapFiati;
	private String _basimYili;
	
	
	//this ==> bu
	//1-) this ==>  global değişkenlere erişmek için
	//2-) this ==>  başka constructorı çağırmak için
	
	//constructor ==> yapıcı metotlar
	/*
	 * 1-) return yazılmaz
	 * 2-) public olmalı ki new instance yapabilelim
	 * 3-) class ismiyle aynı olmak zorunda
	 * 4-) overloading yapabiliriz. ==> parametre sayıları farklı method isimleri aynı
	 */
	
	//parametresiz constructor
	public  Kitap () {
		this("sınırsız güç Anthony Robbins",25,"2012");
	}
	
	//parametreli constructor
	public  Kitap (String kitapAdi,double kitapFiati44,String basimYili) {
		this.kitapAdi=kitapAdi;
		this.kitapFiati=kitapFiati44;
		this._basimYili=basimYili;
	}

	@Override
	public String toString() {
		return "kitapAdi=" + kitapAdi + ", kitapFiati=" + kitapFiati + ", _basimYili=" + _basimYili;
	}

	//getter and setter
	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		
		this.kitapAdi = kitapAdi;
	}

	public double getKitapFiati() {
		
		return kitapFiati;
	}

	public void setKitapFiati(double kitapFiati) {
		if(this.kitapFiati==0) {
			this.kitapFiati=0;
		}
		this.kitapFiati = kitapFiati;
	}

	public String get_basimYili() {
		return _basimYili;
	}

	public void set_basimYili(String _basimYili) {
		this._basimYili = _basimYili;
	}
	
	
	
	
}
