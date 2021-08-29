
package com.ecodation.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Dosya6 {

	// sorgu
	public int sorgu ( ) {
		System.out.println ( "Lütfen bir seçim yapınız" );
		System.out.println (
				"\n1-)Ekleme\n2-)Silme\n3-)listeleme\n4-)Değiştirme Tarihi\n5-)Dosya Yaz \n6-)Dosya Oku\n7-)Çıkış" );
		Scanner klavye = new Scanner ( System.in );
		int sonuc = klavye.nextInt ( );
		return sonuc;
	}

	// karar
	public void sonuc ( ) {
		try {
			int key = sorgu ( );
			switch ( key ) {
				case 1 :
					System.out.println ( Karar.Ekleme.name ( ) );
					Ekleme ( );
					break;
				case 2 :
					System.out.println ( Karar.Silme.name ( ) );
					Silme ( );
					break;
				case 3 :
					System.out.println ( Karar.Listeleme.name ( ) );
					Listeleme ( );
					break;
				case 4 :
					System.out.println ( "Değiştirme tarihi " );
					degistirmeTarihi ( );
					break;
				case 5 :
					System.out.println ( "dosya yazma " );
					dosyaYaz ( );
					break;
				case 6 :
					System.out.println ( "Dosya okuma " );
					dosyaOku ( );
					break;
				case 7 :
					System.out.println ( Karar.Cikis.name ( ) + " ..." );
					System.exit ( 0 );
					break;

				default :
					System.out.println ( "Lütfen belirtilen sayıyı giriniz." );
					break;
			}
		} catch (Exception e) {
			System.out.println ( "hata: " + e );
		}
	}

	private void degistirmeTarihi ( ) throws IOException {
		File file = new File ( Yol.path );
		Locale locale = new Locale ( "tr" , "TR" );
		SimpleDateFormat dateFormat = new SimpleDateFormat ( "dd/MMMM/yyyy hh:mm" , locale );
		Date tarih = new Date ( file.lastModified ( ) );
		String degistir = dateFormat.format ( tarih );
		System.out.println ( "değiştirme tarihi: " + degistir );

	}

	private String Ekleme ( ) throws IOException {
		// C:\\fileIO\\bütün gruplar

		System.out.println ( "****************************" );
		Scanner klavye = new Scanner ( System.in );
		String disk , dosya;
		System.out.println ( "Lütfen Disk seçiniz" );
		disk = klavye.nextLine ( ).toUpperCase ( );
		System.out.println ( "Lütfen dosya adı giriniz" );
		dosya = klavye.nextLine ( );
		StringBuilder builder = new StringBuilder ( );
		builder.append ( disk ).append ( ":\\fileIO\\bütün gruplar\\" ).append ( dosya );
		String pathname = builder.toString ( );
		File file = new File ( pathname );
		if ( file.createNewFile ( ) ) {
			System.out.println ( "dosya ekleniyor " + pathname );
		} else {
			System.out.println ( "zaten dosya bulunuyor" );
		}
		return pathname;
	}

	private void Silme ( ) throws IOException {
		System.out.println ( "****************************" );
		String path = Yol.path;
		File file = new File ( path );
		Scanner klavye = new Scanner ( System.in );
		System.out.println ( "Silmek istiyor musunuz E / H" );
		String sorgu = klavye.nextLine ( );
		if ( sorgu.equalsIgnoreCase ( "e" ) ) {
			if ( file.exists ( ) ) {
				file.delete ( );
				System.out.println ( "Dosya silindi" );
			}
		} else {
			System.out.println ( "Silinmedi" );
		}
	}
	
	/*

        
        String path="C:\\Users\\Java\\Desktop\\file";    //Klasör  
        File file=new File(path);//File oluşturmak için
        
        for(String dosyalar:file.list()){
            System.out.println("+"+dosyalar);
        }
        
System.out.println("--------------------");
        for(File files:file.listFiles()){
            if(files.isDirectory()){
                System.out.println("- "+files.getName());
            }else{
               System.out.println("+ "+files.getName()+files.length());
            }}

	 */

	//dosya Listeleme
	private void Listeleme ( ) throws IOException {
		String pathname = "C:\\fileIO\\bütün gruplar\\";
		File file = new File ( pathname );
		for(String dosyalar:file.list()){
	            System.out.println("\n+"+dosyalar+"\n");
	        }
	}

	//dosya yaz
	public static void dosyaYaz ( ) {
		try ( BufferedWriter bufferedWriter = new BufferedWriter ( new FileWriter ( Yol.path , true ) ) ) {
			Scanner klavye=new Scanner ( System.in );
			System.out.println ( "Lütfen bir şeyler yazınız" );
			String yazilar=klavye.nextLine ( );
			bufferedWriter.append ( yazilar );
			bufferedWriter.flush ( );
			System.out.println ( "dosyalar yazıldı" );
		} catch (IOException e) {
			e.printStackTrace ( );
		}
	}

	public static void dosyaOku ( ) {
		try ( BufferedReader bufferedReader = new BufferedReader ( new FileReader ( Yol.path ) ) ) {
			String okunan = "" , satir = "";
			while ( (satir = bufferedReader.readLine ( )) != null ) {
				okunan += satir + "\n";
			}
			System.out.println ( "okunan: " + "\n" + okunan + "\n" );
		} catch (IOException e) {
			e.printStackTrace ( );
		}
	}

}
