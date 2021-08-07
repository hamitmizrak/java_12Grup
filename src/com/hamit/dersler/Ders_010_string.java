package com.hamit.dersler;

public class Ders_010_string {

	private int sayi; // nesne değişkeni
	private static int sayi2; // sınıf değişkeni

	// local variable ==> sadece o scope kapsamda olmasını istiyorsak
	// global variable ==> büütn her yerden çağırmak istiyorsak

	public static void main(String[] args) {
		// String ==> primitive değildir. wrapper class (Referans type)
		// String çift kullanılır.
		// char tek tırnak kullanılır.

		String kelime = "JavaSe Servlet git"; // Jsp Jsf Springboot Hibernate Mysql Git
		System.out.println("harf sayısı: " + kelime.length());
		System.out.println("trimlenmiş : " + kelime.trim().length());
		System.out.println("harf sayısı: " + kelime.length());
		System.out.println("herşey küçük: " + kelime.toLowerCase());
		System.out.println("herşey büyük: " + kelime.toUpperCase());

		System.out.println(kelime.charAt(0));
		System.out.println("sonuna ekle: " + kelime.concat("Jsp Jsf Springboot Hibernate Mysql Git"));
		System.out.println(kelime.contains("JavaSe"));
		System.out.println(kelime.endsWith("t"));
		System.out.println("mutlaka aynı olacak: " + kelime.equals("JavaSe Servlet git"));
		System.out.println("ister küçük ister büyük girin: " + kelime.equalsIgnoreCase("JavaSe SERvlet Git"));

		System.out.println(kelime.indexOf("Se"));
		System.out.println(kelime.lastIndexOf("Se"));
		System.out.println(!kelime.isEmpty());
		System.out.println(kelime.replace(kelime, "JavaSe Servlet gitJavaSe Servlet git değiştirdim"));
		System.out.println(kelime.substring(4));
		System.out.println(kelime.substring(4, 10)); // 4<=x<=(10-1)

		System.out.println("***************************");

		String kelime2 = "JavaSe,Servlet && git Jsp || Jsf Springboot Hibernate Mysql Git";
		String[] dizi = kelime2.split(",");
		for (String temp : dizi) {
			System.out.println(temp);
		}

		// System.out.println(kelime.);
		// System.out.println(kelime.);
		// System.out.println(kelime.);
		// System.out.println(kelime.);
		// System.out.println(kelime.);
		// System.out.println(kelime.);
		// System.out.println(kelime.);
		// System.out.println(kelime.);
		// System.out.println(kelime.);
		// System.out.println(kelime.);

	}

}
