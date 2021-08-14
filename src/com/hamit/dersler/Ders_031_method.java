package com.hamit.dersler;

public  class Ders_031_method { 
	
     //Method: sürekli çalıştığımız , kodlalarımızı çalıştığımız ve 
	//kaynak yönetimi
	//clean codes
	
	
	
	//1-) voidliParametresiz
	public static void voidliParametresiz() {
		System.out.println("voidliParametresiz");
	}
	
	
	
	//2-) voidliParametreli
	public static void voidliParametreli(String adSoyad) {
		System.out.println("voidliParametreli "+adSoyad);
	}
		
		
		
	//3-) voidsizParametresiz
	public static String voidsizParametresiz() {
		return "voidsizParametresiz";
	}
			
			
	//4-) voidsizParametreli
	public static String voidsizParametreli(String adSoyad,String diller) {	
		return "başarılı"+ adSoyad+" "+diller;
	}
	
	
	// aşırı yüklemek
	// overloading
     public static String voidsizParametreli(String adSoyad,double diller) {
		return "başarılı"+ adSoyad+" "+diller;
	}
	
	public static void main(String[] args) {
		//Ders_031_method method = new Ders_031_method();
		//method.voidliParametresiz();
		
		//halka arz edilmişsse
		//design pattern
		Ders_031_method.voidliParametresiz();
		Ders_031_method.voidliParametreli("Hamit Mızrak");
		
		String temp1= Ders_031_method.voidsizParametresiz(); 
		System.out.println(temp1);
		
		String temp2=Ders_031_method.voidsizParametreli("Hamit Mızrak","Java");
		System.out.println(temp2);
		
	}
	

}

