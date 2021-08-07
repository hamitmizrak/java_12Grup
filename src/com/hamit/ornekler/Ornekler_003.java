package com.hamit.ornekler;

//hesap makinası
public class Ornekler_003 {

	public static void main(String[] args) {
		// hesap makinası

		int sayi1 = 18, sayi2 = 4, toplama, cikarma, carpma, bolme, kalan;
		toplama = sayi1 + sayi2;
		cikarma = sayi1 - sayi2;
		carpma = sayi1 * sayi2;
		bolme = sayi1 / sayi2;
		kalan = sayi1 % sayi2;

		System.out.println("1.sayı: " + sayi1 + " 2.sayı: " + sayi2 + " toplama: " + toplama);
		System.out.println("1.sayı: " + sayi1 + " 2.sayı: " + sayi2 + " cikarma: " + cikarma);
		System.out.println("1.sayı: " + sayi1 + " 2.sayı: " + sayi2 + " carpma: " + carpma);
		System.out.println("1.sayı: " + sayi1 + " 2.sayı: " + sayi2 + " bolme: " + bolme);
		System.out.println("1.sayı: " + sayi1 + " 2.sayı: " + sayi2 + " kalan: " + kalan);
	}
}
