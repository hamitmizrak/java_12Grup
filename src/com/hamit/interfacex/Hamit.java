package com.hamit.interfacex;


public class Hamit implements IMarket {

	@Override
	public void anahtariAl ( ) {
		System.out.println ( "anahtarı aldım" );
		
	}

	@Override
	public void arabaKullan ( ) {
		System.out.println ( "araba kullandım" );
		
	}

	@Override
	public void marketeGit ( ) {
		System.out.println ( "markete gittim" );
		
	}

	@Override
	public String eveGel ( String geldinMi ) {
		
		return "eve geldim";
	}

}
