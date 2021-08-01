package com.hamit.dersler;

public class Ders_002_operatorler {

	public static void main(String[] args) {

		// aritmetik operatörler
		int sayi1 = 12, sayi2 = 2;
		System.out.println("toplama : " + (sayi1 + sayi2));
		System.out.println("cıkarma : " + (sayi1 - sayi2));
		System.out.println("çarpma : " + (sayi1 * sayi2));
		System.out.println("bölme : " + (sayi1 / sayi2));
		System.out.println("bölümünde kalan : " + (sayi1 % sayi2));

		// artırma operatörü
		++sayi2; // önce 1 artır sonra işlem yap
		sayi2++; // önce işlem yap sonra 1 artır
		System.out.println(sayi2);
	}

}
