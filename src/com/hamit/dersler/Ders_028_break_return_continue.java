package com.hamit.dersler;


public class Ders_028_break_return_continue {

	
	public static void main(String[] args) {
		
		//break    :  döngüyü kýrar
		//continue : sadece o döngüde çalýþma sonra devam et
		//return   : metotu kýrar
		
		//new      : hafýzada benim için yer aç
		//null     : hiç oluþturulmamýþ gibi  davranýþ
		//sýfýr    : hafýza bir yer kaplýyor ancak deðeri sýfýr
		
		//debug: hata ayýklamak için kullanýyoruz.
		
		int toplam=0;
		for (int i = 0; i <=25; i++) {
			// 0 1 2  
			if(i==3) 
				continue;
			if(i==4)
				break;
			toplam+=i;
			
		}
		
		System.out.println(toplam);
	}
}
