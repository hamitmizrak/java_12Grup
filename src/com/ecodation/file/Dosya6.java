package com.ecodation.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Dosya6 {

	//sorgu
	public int sorgu() {
		System.out.println ( "Lütfen bir seçim yapınız" );
		System.out.println ( "\n1-)Ekleme\n2-)Silme\n3-)listeleme\n4-)Değiştirme Tarihi\n5-)Çıkış" );
		Scanner klavye=new Scanner(System.in);
		int sonuc=klavye.nextInt ( );
		return sonuc;
	}
	
	//karar
	public void sonuc() {
		try {
			int key=sorgu ( );
			switch ( key ) {
				case 1 :
					System.out.println (Karar.Ekleme.name ( )  );
				    Ekleme();
					break;
				case 2 :
					System.out.println (Karar.Silme.name ( )  );
					Silme();
					break;
				case 3 :
					System.out.println (Karar.Listeleme.name ( )  );
					Listeleme();
					break;
				case 4 :
					System.out.println ("Değiştirme tarihi "  );
					degistirmeTarihi();
					break;
				case 5 :
					System.out.println (Karar.Cikis.name ( )+" ..."  );
					System.exit ( 0 );
					break;

				default :
					System.out.println ( "Lütfen belirtilen sayıyı giriniz." );
					break;
			}
		} catch (Exception e) {
			System.out.println ( "hata: "+e );
		}
	}

	
	
	
	private void degistirmeTarihi ( ) throws IOException {

		String path=Ekleme ( );
		File file=new File(path);
		
		Locale locale=new Locale ( "tr","TR" );
		SimpleDateFormat dateFormat=new SimpleDateFormat ( "dd/MMMM/yyyy hh:mm" , locale );
		
		Date tarih=new Date (file.lastModified ( ) );
		String degistir=dateFormat.format ( tarih );
		
		System.out.println (  "değiştirme tarihi: "+ degistir);
		
	}

	private String Ekleme ( ) throws IOException {
		//C:\\fileIO\\bütün gruplar
		
		System.out.println ( "****************************" );
		Scanner klavye=new Scanner(System.in);
		String disk,dosya;
		
		System.out.println ( "Lütfen Disk seçiniz" );
		disk=klavye.nextLine ( ).toUpperCase ( );
		
		System.out.println ( "Lütfen dosya adı giriniz" );
		dosya=klavye.nextLine ( );
		
		StringBuilder builder=new StringBuilder ( );
		builder.append ( disk).append ( ":\\fileIO\\bütün gruplar\\" ).append ( dosya );
		String pathname=builder.toString ( );
		File file=new File ( pathname );
		
		if(file.createNewFile ( )) {
			System.out.println ( "dosya ekleniyor "+pathname);
		}else {
			System.out.println ( "zaten dosya bulunuyor" );
		}
		
		return pathname;
		
	}
	
	private void Silme ( ) throws IOException {

		System.out.println ( "****************************" );
		String path=Ekleme ( );
		File file=new File(path);
		
		Scanner klavye=new Scanner(System.in);
		System.out.println ( "Silmek istiyor musunuz E / H" );
		String sorgu=klavye.nextLine ( );
		if(sorgu.equalsIgnoreCase ( "e" )) {
			if(file.exists ( )) {
				file.delete ( );
				System.out.println ( "Dosya silindi" );
			}
		}else {
			System.out.println ( "Silinmedi" );
		}
		
		
		
	}
	
	private void Listeleme ( ) throws IOException {
		String path=Ekleme ( );
		File file=new File(path);
		for(String temp: file.list ( )) {
			System.out.println ( "Dosyalar: "+temp );
		}
		
	}



	

}
