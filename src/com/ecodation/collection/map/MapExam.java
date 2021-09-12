package com.ecodation.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.ecodation.collection.list.Student;

public class MapExam {
	public static void main ( String [ ] args ) {
		
		//HashTable ==> null değer veremeyiz Senkron
		//HashMap
		//LinkedMap
		//TreeMap
		Map <String , Object> mapList=new HashMap<> () ;
		mapList.put ( "1" , new Student ( "Server" ) );
		mapList.put ( "1" , new Student ( "Serverx" ) );
		mapList.put ( "2" , new Student ( "Mert" ) );
		mapList.put ( "3" , new Student ( "Hamit" ) );
		
		
		//key
		for(String key:mapList.keySet ( )) {
			System.out.print ( key +" ");
		}
		
		System.out.println ( "\n***********************" );
		
		//value
		for(Object value:mapList.values ( )) {
			System.out.print ( value +" ");
		}
		
		System.out.println ( "\n***********************" );
		for(String ulke:mapList.keySet()){
	             Object hepsi=mapList.get(ulke);
	             System.out.println(ulke+" "+hepsi);   
	        }

		
		System.out.println ( "\n***********iterator************" );
		//Iterator
		Set set=mapList.keySet ( );
		Iterator iterator=set.iterator ( );
		while(iterator.hasNext ( )) {
			System.out.print ( mapList.get ( iterator.next ( ) ) +" " );
		}
		
		System.out.println ( "\n**********Megl-es*************" );
		//MEgl-es
		for(Map.Entry<String , Object> temp:mapList.entrySet()){
	            System.out.println(temp);
	        }
		
		System.out.println ( "*********forEach**************" );
		
		//tek satırda
		mapList.entrySet ( ).forEach ( System.out::println );

	}
}
