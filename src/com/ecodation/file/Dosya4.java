package com.ecodation.file;

import java.io.File;
import java.io.IOException;

public class Dosya4 {

	public static void main ( String [ ] args ) throws IOException {
		
		
		String pathname=Yol.path;
		File file=new File ( pathname );
		
		if(file.exists ( )) {
			file.delete ( );
			System.out.println ( "Dosya silindi" );
		}else {
			System.out.println ( "Dosya silinmedi" );
		}
		

	}

}
