package com.hamit.dersler;


public class Ders_028_break_return_continue {

	
	public static void main(String[] args) {
		
		//break    :  d�ng�y� k�rar
		//continue : sadece o d�ng�de �al��ma sonra devam et
		//return   : metotu k�rar
		
		//new      : haf�zada benim i�in yer a�
		//null     : hi� olu�turulmam�� gibi  davran��
		//s�f�r    : haf�za bir yer kapl�yor ancak de�eri s�f�r
		
		//debug: hata ay�klamak i�in kullan�yoruz.
		
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
