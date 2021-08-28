package com.ecodation.file;

import java.io.File;
import java.io.IOException;

public class Dosya2 {

	public static void main ( String [ ] args ) throws IOException {
		
		
		String pathname=Yol.path;
		File file=new File ( pathname );
		
		if(file.isFile ( )) {
			System.out.println ( "bu bir dosyadır" );
		}else {
			System.out.println ( "hayır dosya değildir" );
		}

	}

}
