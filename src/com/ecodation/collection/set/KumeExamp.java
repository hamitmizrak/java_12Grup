package com.ecodation.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class KumeExamp {

	public static void main ( String [ ] args ) {
		//H
		//L
		//T
		//Set <Integer> kume=new HashSet<> ( );
		//Set <Integer> kume=new LinkedHashSet<> ( );
		Set <Integer> kume=new TreeSet<> ( );
		kume.add ( 10 );
		kume.add ( 10 );
		kume.add ( 30 );
		kume.add ( 20 );
		
		
		for(Object temp:kume) {
			System.out.print ( temp+" " );
		}
	}
}
