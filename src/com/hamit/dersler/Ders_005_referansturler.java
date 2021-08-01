package com.hamit.dersler;

public class Ders_005_referansturler {

	public static void main(String[] args) {

		// Datatype: veri türü anlamına gelmektedir.
		// 2 'e ayrılır 1-)Primitive 2-)Wrapper (Referans Türler)

		// 1-)Primitive Type
		/*
		 * 8 tane primitive bulunur hepsi küçük harflerle yazılır f-L f=float L=Long tamsayılar: byte short int long
		 * virgüllü sayılar: float double karar: boolean char İlkeldir Hızlıdır new oluşturmadan kullanırız. Stack
		 * hafızayı kullanır. Stack hafıza: eleman sayısıbelli olan hafıza türüdür. Heap'e göre daha hızlıdır. Ram
		 * Bellekte bilgiler tutulur. Bilgisayarımızı resetlediğimizde silinir. oop uzaktır. Java'nın 100 100 oop
		 * olmaması için istisnadır. Başlangıç değeri vermek zorunda değiliz.
		 */

		// primitive = 8 tane
		// f -L

		// tamsayılar
		// b s i l
		byte b1 = 44;
		short s1 = 250;
		int i1 = 351;
		long l1 = 4525552L;

		// virgüllü sayılar
		float f2 = 15.554f;
		double d2 = 45155.8585;

		// boolean
		boolean b3 = true;
		b3 = false;
		b3 = 14 > 5;

		// char
		char c4 = 'a';
		// ascii unicode
		c4 = '\u5255';
		System.out.println(c4);

		// 2-)Referans Type
		/*
		 * 11+ primitive bulunur ilk harfi büyük harflerle yazılır sonrasında küçük harfle (pascal case) tamsayılar:
		 * Byte Short Integer Long virgüllü sayılar: Float Double karar: Boolean Character GEliişmiştir primitive göre
		 * yavaştır new oluşturmadan kullanamayız. Heap hafızayı kullanır. Heap hafıza: eleman sayısı belli olmayan
		 * hafıza türüdür. Stack'e göre daha yavaştır. Ram Bellekte bilgiler tutulur. Bilgisayarımızı resetlediğimizde
		 * silinir Başlangıç değeri vermek zorundayız. OOP'ye daha yakındır.
		 */

		Byte rb1 = new Byte((byte) 44);
		Short rs1 = new Short((short) 250);
		Integer ri1 = new Integer(351);
		Long rl1 = new Long(4525552L);

		// virgüllü sayılar
		Float rf2 = new Float(15.554f);
		Double rd2 = new Double(45155.8585);

		// Boolean
		Boolean rb3 = new Boolean(true);
		rb3 = false;
		rb3 = 14 > 5;

		// Character
		Character rc4 = new Character('a');
		// ascii unicode
		rc4 = '\u5255';
		System.out.println(rc4);

	}

}
