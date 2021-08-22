package com.ecodation.innerclass;

import com.ecodation.innerclass.Ulke.Sehir;
import com.ecodation.innerclass.Ulke.Sehir.Mahalle;

public class UlkeMainTest {

	public static void main ( String [ ] args ) {
		Ulke ulke=new Ulke ( );
		ulke.setUlkeAdi ( "Türkiye" );
		
		Sehir sehir= new Sehir ( );
		sehir.setSehirAdi ( "Malatya");
		
		Mahalle mahalle=new Mahalle ( );
		mahalle.setMahalle ( "Battalgazi" );
		
		System.out.println ( "Ülke: "+ulke.getUlkeAdi ( )+ " Şehir: "+sehir.getSehirAdi ( )+" Mahalle: "+mahalle.getMahalle ( ) );

	}

}
