package com.hamit.ornekler;

import java.util.Scanner;


public class Ornekler_005 {

	/*
	kullan�c� taraf�ndan ba�lang��,biti� say�lar� verilsin
s1-)  ba�lang��,biti� say�lar�n toplam�
s2-)  ba�lang��,biti� �ift  say�lar�n toplam�
s2-)  ba�lang��,biti�  kadar teksay�lar  say�lar�n toplam�
s3-)  ba�lang��,biti� say�lar�n toplam� ancak 5'e b�l�nebilen say�lar hari�

	 */
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		
		//toplama etkisiz eleman: 0 �arpmada etkisiz eleman=1s
		
		int baslangic,bitis,ciftToplam=0,tekToplam=0;
		System.out.println("l�tfen ba�lang�� say�y�s�n� giriniz");
		baslangic=klavye.nextInt();
		System.out.println("l�tfen biti� say�y�s�n� giriniz");
		bitis=klavye.nextInt();
		
		System.out.println("Ba�lang�� ve biti� say� toplamlar�: "+(baslangic+bitis));
		
		for (int i = baslangic; i <= bitis; i++) {
			if(i%2==0) {
				ciftToplam=ciftToplam+i;
			}else {
				tekToplam+=i;
			}
		}
		
		System.out.println("Tek say� toplam�: "+tekToplam);
		System.out.println("�ift say� toplam�: "+ciftToplam);
//0 1 2 3 4
	}
}
