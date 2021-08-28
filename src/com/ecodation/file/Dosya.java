package com.ecodation.file;

import java.io.File;
import java.io.IOException;

public class Dosya {

	public static void main ( String [ ] args ) throws IOException {
		
		
		String pathname=Yol.path;
		File file=new File ( pathname );
		System.out.println ( "can" );
		System.out.println ("çalışabilir mi? "+ file.canExecute ( ) );
		System.out.println ("okuyabilir miyim? "+ file.canRead ( ) );
		System.out.println ("yazabilir miyim? "+  file.canWrite ( ) );
		System.out.println ( "******************************************" );
		
		//is boolean  : true false
		System.out.println ( "is" );
		System.out.println ("gizli mi? "+ file.isHidden ( ) );
		System.out.println ("bu dosya mı? "+ file.isFile ( ) );
		System.out.println ("bu dizin mi? " +file.isDirectory ( ) );
		System.out.println ( file.isAbsolute ( ));
		
		System.out.println ( "******************************************" );
		
		System.out.println ( "get" );
		System.out.println ("bütün yol:  "+ file.getPath ( ) );
		System.out.println ("adi: "+ file.getName ( ) );
		System.out.println ("ebeveyn: "+ file.getParent ( ) );
		System.out.println ("classı "+ file.getClass ( ) );
		System.out.println ("boş alan: "+ file.getFreeSpace ( ) );
		System.out.println ( file.getUsableSpace ( ) );
		System.out.println ("absolute path "+ file.getAbsolutePath ( ) );
		System.out.println ( file.getCanonicalPath ( ) );
		
		System.out.println ( "set" );
		System.out.println ( file.canExecute ( ) );
		System.out.println ( file.setExecutable ( false ) );
		System.out.println ( file.canExecute ( ) );
	
		System.out.println ("harf sayısı : "+  file.length ( ) );
		//System.out.println ( file.delete ( ) );
		
		//System.out.println ( file.createNewFile ( ) );
		//System.out.println ( file. );
//		System.out.println ( file. );
//		System.out.println ( file. );

	}

}
