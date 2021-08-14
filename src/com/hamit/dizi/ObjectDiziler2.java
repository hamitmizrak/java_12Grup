package com.hamit.dizi;

import java.util.Random;
import java.util.Scanner;

public class ObjectDiziler2 {
	/*
 konsoldan kaç elemanlı elemanlı bir dizi olacak  
-a) konsoldan rastgele sayı için başlangıç ve bitişi consolden kullanıcı yazacak  ve bu elemanlara rastgele bilgisayar tarafında sayılar girecek
-b) dizide eleman sayısını kullanıcıdan alsın bu sayıları bir diziye atayalım
-c-) rastgele gelen sayıları küçükten büyüğe sıralıyalım ?
-d) ilk sayı ile son sayının toplamını alalım.
-e) bütün sayıların toplamı ?
-f) ortalaması ?
-g) bütün sayı toplamını  metota verecem metot şunu yapacak girilen sayının 10 küçük olup olmadığını kontol edecek.

	 */
		
public int elemanSayisi() {
	Scanner klavye=new Scanner(System.in);
	System.out.println("dizi eleman sayısını giriniz");
	int sayi=klavye.nextInt();
	return sayi;
}



public void rastgeleSayilar() {
	Scanner klavye=new Scanner(System.in);
	int baslangic,bitis;
	
	int elemanSayiDegisken=  elemanSayisi();
	int [] diziSayisi=new int[elemanSayiDegisken];
	
	System.out.println("rastgele başlangıç sayısını giriniz");
	baslangic=klavye.nextInt();
	
		System.out.println("rastgele bitiş sayısını giriniz");
	bitis=klavye.nextInt();
	
	
	
	for (int i = 0; i < diziSayisi.length; i++) {
		Random random=new Random();
		int sayilar=baslangic+ random.nextInt(bitis);
		diziSayisi[i]=sayilar;
	}
	
	for(int temp: diziSayisi) {
		System.out.print(temp+" ");
	}
	

}

public static void main(String[] args) {
	ObjectDiziler2 diziler2=new ObjectDiziler2();
	diziler2.rastgeleSayilar();
}

		
	
}
