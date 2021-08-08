package com.hamit.dersler;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Ders_021_Calendar {

	// Date
	// @Deprecated ==> Date
	public static void main(String[] args) {

		Locale locale = new Locale("tr", "TR");
		// SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", locale);
		// SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", locale);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MMMM.yyyy hh:mm.ss zzzz", locale);

		Calendar calendar = Calendar.getInstance();
		String cevir = simpleDateFormat.format(calendar.getTime());

		System.out.println(calendar);
		System.out.println(cevir);

	}

}
