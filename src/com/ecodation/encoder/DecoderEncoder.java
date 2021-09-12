package com.ecodation.encoder;


import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class DecoderEncoder {

	
	public static String kelimeGir() {
		
		Scanner klavye=new Scanner(System.in);
		System.out.println ( "Lütfen bir kelime giriniz" ); 
		
		String kelime=klavye.nextLine ( );
		return kelime;
	}
	
     public static String getEncoder(String kelime) {
     	Encoder encoder44 = Base64.getEncoder();
     	String title= encoder44.encodeToString(kelime.getBytes());
     	System.out.println ( "şifrelenmiş kelime: "+title );
		return title;
	}
	
	public static void getDecoder() {
		Base64.Decoder decoder3 = java.util.Base64.getMimeDecoder();
		String dStr = new String(decoder3.decode(getEncoder ( kelimeGir ( ) )));
		System.out.println ( dStr );

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main ( String [ ] args ) {
		getDecoder ( );
	}
	
	
	
}
