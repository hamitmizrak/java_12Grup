package com.hamit.dersler;

public class Ders_017_StringBuffer {

	public static void main(String[] args) {
		// StringBuffer: daha güvenli ancak StringBuilder'e göre daha yavaştır.
		String kelime = "  JavaSE " + "JavaEE" + " Servlet" + " JSP" + " JSF";
		System.out.println(kelime);

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(" ").append(" JavaSE").append(" JavaEE").append(" Servlet").append(" JSP").append(" JSF")
				.append(" ");

		String cevir = stringBuffer.toString();
		System.out.println(cevir);

	}

}
