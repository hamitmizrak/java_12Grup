package com.ecodation.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExamp {

	public static void main ( String [ ] args ) {
		
		//Asenkron: aynı anda birden fazla işlem yapar
		List <String> listem=new ArrayList <String>();
		listem.add ( "Server" );
		listem.add ( "Mert" );
		listem.add ( "Hamit" );
		
		// olmaz ===>  Arrays.sort(listem);
		Collections.sort(listem);
		
		List <String> listem2=new LinkedList <String>();
		listem2.add ( "Servlet" );
		listem2.add ( "JSP" );
		listem2.add ( "JSF" );
		
		//senkron: birisi bitmeden diğeri başlamaz
		Vector <Integer> vector=new Vector<> ( );
		vector.add ( 5 );
		
		//CV
		//Foto
		//Kimlik
		//Diploma
		
		
		//listem.get(0);
		//iterative for
		for ( int i = 0 ; i < listem.size ( ); i++ ) {
			System.out.print (listem.get ( i )+" " );
		}
		
         //	listem.remove ( 2 );
         //    listem.clear ( );
		System.out.println ( "" );
		if(listem.contains ( "Server" )) {
			System.out.println ( "Server var" );
		}else {
			System.out.println ( "yoktur" );
		}
		
		 //boşsa=true dolu=false
		System.out.println ( listem.isEmpty ( ) );
		
		
		System.out.println ( "lastIndex: "+listem.lastIndexOf ( "Server" ) );
		
		System.out.println ("subList "+listem.subList ( 0 ,3 ) );
		
		System.out.println ( "\n*****************************" );
		
		//forEach
		for(String temp  : listem) {
			System.out.print ( temp + " ");
		}
		
		
	}
}
