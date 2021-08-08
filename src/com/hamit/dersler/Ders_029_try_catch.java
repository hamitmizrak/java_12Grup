package com.hamit.dersler;

import java.io.IOException;
import java.sql.DriverManager;

public final class Ders_029_try_catch { //extends edemezsin
	final int sayi=5;
	
	final public void deneme() { //override 
		
	}
	
	public static void main2() throws ArithmeticException,IOException  {
			int sayi=4/0;
			System.out.println(sayi);
			//db.close()  port.close() 
		//try with resources
//		try (DriverManager driverManager;){
//			int sayi=4/0;
//			System.out.println(sayi);
//			//db.close()  port.close() 
//		} catch (Exception e) {
//			System.out.println("Hata: "+e);
//			//e.printStackTrace();
//		}
		//System.out.println("son yazý");
	}
	
	public static void main3() {
		
	}
	
	public static void main(String[] args) {
		try {
			//main2();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
