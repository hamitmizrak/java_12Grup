package com.ecodation.file.filewriterreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.ecodation.file.Yol;

public class FileReaderWriter {

	public static void dosyaYaz() {
		try(BufferedWriter bufferedWriter=new BufferedWriter ( new FileWriter ( Yol.path,true ) )) {
			bufferedWriter.append ( "Hamit " );
			bufferedWriter.append ( "Server " );
			bufferedWriter.append ( "Mert " );
			bufferedWriter.flush ( );
			System.out.println ( "dosyalar yazıldı" );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void dosyaOku() {
		try(BufferedReader bufferedReader=new BufferedReader ( new FileReader( Yol.path) )) {
		String okunan="",satir="";	
		while(  (satir=bufferedReader.readLine ( ))!=null  ) {
			okunan+=satir+	"\n";
		}
		System.out.println ( "okunan: "+"\n" +okunan+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main ( String [ ] args ) {
		//dosyaYaz ( );
		dosyaOku ( );
	}
	
}
