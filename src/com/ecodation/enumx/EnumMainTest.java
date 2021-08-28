package com.ecodation.enumx;


public class EnumMainTest {
public static void main ( String [ ] args ) {
	HaftaninGunleri gunler=HaftaninGunleri.cumartesi;
	System.out.println ("ordinal: "+ gunler.ordinal ( ) );
	System.out.println ("hashcode: "+ gunler.hashCode ( ));
	System.out.println ("name: "+ gunler.name ( ));
	
	System.out.println ( "constructor: "+gunler.getGun ( ) );
	
	for(HaftaninGunleri temp: gunler.values ( )) {
		System.out.println ( temp );
	}
}
}
