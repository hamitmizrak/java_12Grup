package com.hamit.dersler;

public class Ders_015_Donusturme {

	public static void main(String[] args) {
		// donusturme
		// db socket servis
		// primitive türler OOP değildir.
		System.out.println(12 + 5);
		System.out.println("12" + 5);

		// 1-) cast: float,Long ==> f-L
		float f1 = 44.44f;
		float f2 = (float) 44.44;
		long l1 = 44525555855L;

		// 2-) cast: boxing unboxing
		// boxing: kutulama ==> primitive Wrapper Class
		// primitive

		// BOXING
		int primitive;
		primitive = 5;
		// sayi = null;
		// oop değildir.
		Integer referans = primitive;
		referans = null;

		// UNBOXING
		Integer referans2 = new Integer(44);
		int primitive2 = referans2;

		// 3-) String ==> sayıya çevir
		String kelime = "16";
		int sayi = 14;
		System.out.println(sayi + kelime);

		int cevir = Integer.valueOf(kelime); // Integer ==> Object daha yakın olmasını sağlıyorsun. ram bellekte fazla
												// kaplıyor
		int cevir2 = Integer.parseInt(kelime); // int ==> Object uzaktır. daha hızlıdır.
		System.out.println(sayi + cevir);
		System.out.println(sayi + cevir2);

		// 4-)sayıyı String' çevirmek
		int sayi4 = 20;
		String cevir4 = String.valueOf(sayi4);
		String cevir5 = Integer.toString(sayi4); //toString

		int sayi5 = 30;
		System.out.println((sayi4 + sayi5));
		System.out.println((cevir4 + sayi5));
		System.out.println((cevir5 + sayi5));

	}

}
