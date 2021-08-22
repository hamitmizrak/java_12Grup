package com.ecodation.kalitim2;


public class Kalitim2MainTest {

	public static void main ( String [ ] args ) {
		Msi msi=new Msi ("Gl75","msi","44","çift fan 855s" );
		System.out.println ( msi);
		
		
		System.out.println ( "*******************" );
		
		
		Monster monster=new Monster ( );
		monster.setAdi ( "monster 99" );
		System.out.println ( monster.getAdi ( ) );

	}

}
