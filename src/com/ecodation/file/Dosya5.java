package com.ecodation.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Dosya5 {

	public static void main ( String [ ] args ) throws IOException {
		
		
		String pathname=Yol.path;
		File file=new File ( pathname );
		
		Locale locale=new Locale ( "tr","TR" );
		SimpleDateFormat dateFormat=new SimpleDateFormat ( "dd/MMMM/yyyy hh:mm" , locale );
		
		Date tarih=new Date (file.lastModified ( ) );
		String degistir=dateFormat.format ( tarih );
		
		System.out.println (  "değiştirme tarihi: "+ degistir);
		

	}

}
