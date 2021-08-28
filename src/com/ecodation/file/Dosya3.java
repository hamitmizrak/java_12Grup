package com.ecodation.file;

import java.io.File;
import java.io.IOException;

public class Dosya3 {

	public static void main ( String [ ] args ) throws IOException {
		
		
		String pathname=Yol.path;
		File file=new File ( pathname );
		
		if(file.createNewFile ( )) {
			System.out.println ( "dosya yoktur" );
		}else {
			System.out.println ( "dosya bulunuyor" );
		}

	}

}
