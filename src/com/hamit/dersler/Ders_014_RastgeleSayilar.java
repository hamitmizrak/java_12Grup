package com.hamit.dersler;

import java.util.Random;

public class Ders_014_RastgeleSayilar {

	public static void main(String[] args) {

		// rastgele sayılarda
		// 1-) Math
		System.out.println(Math.random() * 2 + 1);

		// 2-) Random class
		Random random = new Random();
		int sayi = random.nextInt(9) + 1; // 1 <=x<=9
		System.out.println(sayi);

	}

}
