package com.hamit.dersler;

import java.util.Scanner;

public class Ders_011_Scanner {
	// .ini
	// startup üstünde
	// -vm
	// C:\Program Files\Java\jdk-16.0.1\bin\javaw.exe

	public static void main(String[] args) {

		// Scanner : Kullanıcıdan bilgi almak için kullanıyoruz.
		Scanner klavye = new Scanner(System.in);
		String adi, soyadi;
		int teknoloji;

		System.out.println("Lütfen adınızı giriniz");
		adi = klavye.nextLine();

		System.out.println("Lütfen soyadınızı giriniz");
		soyadi = klavye.nextLine();

		System.out.println("Lütfen teknolojileri giriniz");
		teknoloji = klavye.nextInt();

		System.out.println(adi + " " + soyadi + " " + teknoloji);
	}

}
