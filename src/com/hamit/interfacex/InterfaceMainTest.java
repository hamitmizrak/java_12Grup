package com.hamit.interfacex;


public class InterfaceMainTest {

	public static void main ( String [ ] args ) {
		
		IMarket iMarket1 = new Hamit ( ); //polymorphism
		IMarket iMarket2=new Mert ( );    //polymorphism
		IMarket iMarket3=new Server ( ); //polymorphism
		
		Hamit hamit=new Hamit ( );
		hamit.arabaKullan ( );
		
		Mert mert=new Mert ( );
		mert.arabaKullan ( );
		
		Server server=new Server ( );
		server.arabaKullan ( );

	}

}
