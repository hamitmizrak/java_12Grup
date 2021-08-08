package com.hamit.dersler;

public final class Ders_030_throw { 
	
	public static void main(String[] args) {
		//throw new ArithmeticException("Sýfýra bölme hatasý");
		
		//istisna ile Hata ayný þey deðildir.
		
		//error 3
		//1-) syntax error==> gramer hatasý
		int sayi;
		
		//2-)logic error
		String sayi2="10";
		int sayi3=20;
		System.out.println(sayi2+sayi3);
		
		//3-) run time error 
		//ram þiþirdik
		//db.close();
		
		//istisna ==> 4/0 AritmeticExcepiton
		
//		try {
//			
//		} catch (ArithmeticException ar) {
//			// TODO: handle exception
//		}catch (ClassNotFoundException cnot) {
//			// TODO: handle exception
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
		
       try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		
		
	
}	

}

