package com.hamit.dersler;

public class Ders_016_StringBuilder {

	public static void main(String[] args) {
		// StringBuilder
		String kelime = "  JavaSE " + "JavaEE" + " Servlet" + " JSP" + " JSF";
		System.out.println(kelime);

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(" ").append(" JavaSE").append(" JavaEE").append(" Servlet").append(" JSP").append(" JSF")
				.append(" ");

		String cevir = stringBuilder.toString();
		System.out.println(cevir);

	}

}
