package com.ecodation.enumx;


public enum HaftaninGunleri {
	pazar(1,"Pazar"),pazartesi(2,"Pazartesi"),sali(3,"Salı"),
	carsamba(4,"Çarşamba"),persembe(5,"Perşembe"),cuma(6,"Cuma"),
	cumartesi(7,"Cumartesi");
	
	private final int sayi;
	private final String gun;
	
	private HaftaninGunleri ( int sayi , String gun ) {
		this.sayi	= sayi;
		this.gun	= gun;
	}

	
	public int getSayi ( ) {
		return sayi;
	}

	
	public String getGun ( ) {
		return gun;
	}
	
	
	
	
}
