package com.hamit.optional;

import java.util.Optional;

public class OrnekOptional {

	public static void main ( String [ ] args ) {
		OptionalBilgisayar bilgisayar=new OptionalBilgisayar ( "bilgisayarAdi" , "bilgisayarFiyati" , "bilgisayarMarkasi" , "bilgisayarFabrikasi" );
		Optional optional= Optional.ofNullable (bilgisayar );
	}
}
