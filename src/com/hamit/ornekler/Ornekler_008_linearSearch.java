package com.hamit.ornekler;

import java.util.Arrays;

//linear Search


public class Ornekler_008_linearSearch {
 
	//1 5 6 9 5 6 85 6   6 
	//linear search dizi
	public static int linearSearch(int [] dizi , int aranacakSayi) {
		//iterative for
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i] ==aranacakSayi)
				return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
	
		int [] dizi= {4,9,6,63,85,96};
		//Arrays.sort(dizi);
		int sayi=685;
		
	int donenSayi=Ornekler_008_linearSearch.linearSearch(dizi, sayi);
	if(donenSayi!=-1) {
		System.out.println((donenSayi+1)+ ".nci indinde "+sayi+ " sayısı vardır ");
	}else {
		System.out.println("Böyle bir sayı yoktur");
	}
	}

}
