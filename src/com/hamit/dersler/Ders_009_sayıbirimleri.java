package com.hamit.dersler;

public class Ders_009_sayıbirimleri {

	public static void main(String[] args) {

		// 2 lik tabanda ==> 0 1
		int ikilikTabanda = 0b010;
		System.out.println("ikilik tabanda: " + ikilikTabanda);

		// 8 lik tabanda ==> 0 1 2 3 4 5 6 7
		int sekizlikTabanda = 0010;
		System.out.println("sekizlik Tabanda : " + sekizlikTabanda);

		// 10 lik tabanda ==> 0 1 2 3 4 5 6 7 8 9
		int onlukTabanda = 11;
		System.out.println("onluk Tabanda : " + onlukTabanda);

		// 16 lik tabanda ==> 0 1 2 3 4 5 6 7 8 9 A B C D E F
		int onaltilikTabanda = 0xABC;
		System.out.println("onluk Tabanda : " + onaltilikTabanda);
	}

}
