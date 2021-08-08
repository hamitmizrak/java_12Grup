package com.hamit.ornekler;

import java.util.Scanner;


public class Ornekler_005 {

	/*
	kullanýcý tarafýndan baþlangýç,bitiþ sayýlarý verilsin
s1-)  baþlangýç,bitiþ sayýlarýn toplamý
s2-)  baþlangýç,bitiþ çift  sayýlarýn toplamý
s2-)  baþlangýç,bitiþ  kadar teksayýlar  sayýlarýn toplamý
s3-)  baþlangýç,bitiþ sayýlarýn toplamý ancak 5'e bölünebilen sayýlar hariç

	 */
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		
		//toplama etkisiz eleman: 0 çarpmada etkisiz eleman=1s
		
		int baslangic,bitis,ciftToplam=0,tekToplam=0;
		System.out.println("lütfen baþlangýç sayýyýsýný giriniz");
		baslangic=klavye.nextInt();
		System.out.println("lütfen bitiþ sayýyýsýný giriniz");
		bitis=klavye.nextInt();
		
		System.out.println("Baþlangýç ve bitiþ sayý toplamlarý: "+(baslangic+bitis));
		
		for (int i = baslangic; i <= bitis; i++) {
			if(i%2==0) {
				ciftToplam=ciftToplam+i;
			}else {
				tekToplam+=i;
			}
		}
		
		System.out.println("Tek sayý toplamý: "+tekToplam);
		System.out.println("Çift sayý toplamý: "+ciftToplam);
//0 1 2 3 4
	}
}
