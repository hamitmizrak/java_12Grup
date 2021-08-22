package com.hamit.oop;

public class MainKitapTest {

	public static void main(String[] args) {
		Kitap kitap; //gc
		kitap=new Kitap("içindeki devi uyandır", 55, "2014");
		System.out.println(kitap);
		
		System.out.println("*****************************");
		
		Kitap2 kitap2; //gc
		kitap2=new Kitap2("içindeki devi uyandır", 55, "2014");
		System.out.println(kitap2);

	}

}
