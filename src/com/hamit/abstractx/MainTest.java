package com.hamit.abstractx;


public class MainTest {

	public static void main ( String [ ] args ) {
		
		//Diller diller=new Diller ( );
		
		Diller java=new Java ( ); //polymorphism
		java.setDilAdi ( "Java" );
		java.deneme ( );  //polymorphism
		java.deneme2Gövdesiz ( );
		java.simdikiTarihiVer ( );
		
		
		String result= (java instanceof Java) ? "Evet Java ait"   :  "Hayır"  ;
		System.out.println ( result );
		System.out.println ( "******************" );
		
		Diller cSharp=new CSharp ( ); //polymorphism
		cSharp.setDilAdi ( "c#" );
		cSharp.deneme ( ); //polymorphism
		cSharp.deneme2Gövdesiz ( );
		cSharp.simdikiTarihiVer ( );
		

	}

}
