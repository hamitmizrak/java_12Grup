package com.ecodation.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListeDongu {

	public static void main ( String [ ] args ) {
		
		ArrayList < Integer> listem=new ArrayList<> ( );
		for ( int i = 0 ; i < 5 ; i++ ) {
		listem.add ( i );	
		}
		
		
		//iterative
		for ( int i = 0 ; i < listem.size() ; i++ ) {
			System.out.print ( listem.get ( i )+" " );
		}
		
		System.out.println ( "\n**************************************" );
		
		//isim olarak forEach 
		for(Integer temp :listem) {
			System.out.print ( temp+" " );
		}
		
		System.out.println ( "\n**************************************" );
		
		//iterator
		Iterator <Integer> iterator=listem.iterator ( );
		
		while(iterator.hasNext ( )) {
			System.out.print ( iterator.next ( )+" " );
		}
		
		System.out.println ( "\n**************************************" );
	}
}
