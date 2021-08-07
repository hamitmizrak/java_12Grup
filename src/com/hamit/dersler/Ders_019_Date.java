package com.hamit.dersler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ders_019_Date {

	// Date
	// @Deprecated ==> Date
	public static void main(String[] args) {

		Locale locale = new Locale("tr", "TR");
		// SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", locale);
		// SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", locale);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MMMM.yyyy hh:mm.ss zzzz", locale);

		Date date = new Date();

		String cevir = simpleDateFormat.format(date);

		System.out.println(date);
		System.out.println("1.gun: " + date.getHours());
		date.setHours(11);
		System.out.println("değiştiirlmiş saat: " + date.getHours());
		System.out.println(date.getHours());
		System.out.println(cevir);

	}

}
