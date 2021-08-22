package com.java.composition;

public class CompositionMainTest {

	public static void main ( String [ ] args ) {
		// kim olmazsa olmaz
		
		//1
		Yazar yazar=new Yazar ("Anthony","Robbins" );
		
		//N
		Kitap kitap=new Kitap ("Sınırsız Güç","65" );
		kitap.setYazar ( yazar );
		kitap.getYazar ( ).getKitaplar ( ).add ( kitap );
		
		
		Kitap kitap2=new Kitap ("İçindeki Devi Uyandır","135" );
		kitap2.setYazar ( yazar );
		kitap2.getYazar ( ).getKitaplar ( ).add ( kitap2 );
		
		System.out.println ( yazar );
		System.out.println ( "**************" );
		
		for(Kitap temp:kitap2.getYazar ( ).getKitaplar ( )) {
			System.out.println ( temp );
		}
		


	}

}
