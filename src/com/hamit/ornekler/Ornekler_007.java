package com.hamit.ornekler;




public class Ornekler_007 {


	public static void main(String[] args) {
		String gunler="sali";
		switch (gunler) {
		case "pazartesi":
			System.out.println("g�nlerden pazartesi");
			break;
		case "sali":
			System.out.println("g�nlerden sali");
			break;
		case "carsamba":
			System.out.println("g�nlerden carsamba");
			break;
		case "per�embe":
			System.out.println("g�nlerden per�embe");
			break;
		case "cuma":
			System.out.println("g�nlerden cuma");
			break;
		case "cumartesi":
			System.out.println("g�nlerden cumartesi");
			break;
		case "pazar":
			System.out.println("g�nlerden pazar");
			break;

		default:
			System.out.println("g�nlerden farkl� bir �ey girdiniz");
			break;
		}
	}
}
