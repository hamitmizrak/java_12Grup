package com.ecodation.collection.list;

import java.util.Arrays;
import java.util.List;

public class ArrayListExamp2 {

	public static void main ( String [ ] args ) {
		
		Student student1=new Student ( "Server" );
		Student student2=new Student ( "Mert" );
		Student student3=new Student ( "Hamit" );
		
		List <Student> listem= Arrays.asList ( student1,student2,student3 );
		
		for(Student temp: listem) {
			if(temp.getAdi ( )=="Server") {
				System.out.println ( "Server var" );
			}
		}
		
		
		
	}
}
