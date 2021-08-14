package com.hamit.dizi;

import java.util.Arrays;

public class CiftBoyutluDiziler2 {

	// diziler: aynı türdeki verileri bir noktada barındırmak.
	// eleman sayısı belli olan
	// eleman sayısı belli olmayan
	
	//NOT: Diziler sıfırıncı indiste başlar
	//NOT: Diziler length
	//NOT: Dizilere eleman eklenmezse sıfır kabul edilir.
	
	public static void main(String[] args) {

		
	int [][] matrix=new int[5][3];
    matrix[0][1]=1;
	
    // ilk bileşen: satır 
	// ikinci bileşen sutun
		
	for (int i = 0; i < 5; i++) {
		for (int k = 0; k < 3; k++) {
			System.out.print(matrix[i][k]);
		}
		System.out.println();
	}
	
		
	}
}
