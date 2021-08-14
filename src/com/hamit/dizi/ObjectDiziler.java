package com.hamit.dizi;

import java.util.Arrays;

public class ObjectDiziler {
	/*
S1-) 0,5,3,2,1,4 bu sayıları bir diziye atayın bu diziniden clonelanmış dizi elde edilecektir.
s2-) clonelanmış dizi bu sayıları küçükten  büyüğe doğru sıralayın
s3-) clonelanmış dizi  Bunların içinde çift sayı toplamları ,tek sayı toplamı

	 */
		
	public static void main(String[] args) {
		int tekToplam=0,tekSayi=0,ciftToplam=0,ciftSayi=0;
		
		int[] originalDizi= {5,1,3,2,0};
		int[] kopyaDizi=new int[originalDizi.length];
	
	
		//iterative
		for (int i = 0; i < originalDizi.length; i++) {
			kopyaDizi[i]=originalDizi[i];
		}
		
		Arrays.sort(kopyaDizi);
		
		for(int temp :kopyaDizi) {
			System.out.print(temp+" ");
		}
		System.out.println("\n********************");
		//forEach
		for(int temp :kopyaDizi) {
			if(temp%2==0) {
				ciftToplam+=temp;
				ciftSayi++;
	
			}else {
				tekToplam=tekToplam+temp;
				tekSayi++;
			}
		}
		
		System.out.println(ciftSayi+" tane çift sayı ve çift sayı toplamları "+ ciftToplam);
		System.out.println(tekSayi+" tane tek sayı ve tek sayı toplamları "+ tekToplam);
		
	}
		
	
}
