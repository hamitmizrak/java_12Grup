package com.hamit.dizi;

import java.util.Arrays;

public class TekBoyutluDiziler {

	// diziler: aynı türdeki verileri bir noktada barındırmak.
	// eleman sayısı belli olan
	// eleman sayısı belli olmayan
	
	//NOT: Diziler sıfırıncı indiste başlar
	//NOT: Diziler length
	//NOT: Dizilere eleman eklenmezse sıfır kabul edilir.
	
	public static void main(String[] args) {
		
//
//		int [] diziAdi=new int [5];
//		diziAdi[0]=44;
//		diziAdi[1]=11;
//		diziAdi[4]=44;
//		diziAdi[2]=22;
		
		int [] diziAdi = {44,11,22,33};
		
		// 0 1 2 3 4 
		for (int i = 0; i < diziAdi.length; i++) {
			System.out.print(diziAdi[i]+" ");
		}
		
		Arrays.sort(diziAdi);
		System.out.println("\n****************************************");
		for (int i = 0; i < diziAdi.length; i++) {
			System.out.print(diziAdi[i]+" ");
		}
		

		int result= Arrays.binarySearch(diziAdi, 448);
		System.out.println();
		
		String sonuc=result>-1 ?" bulunuyor" :"bulunmuyor";
		System.out.println("\n"+sonuc);
		
		
		
	}
}
