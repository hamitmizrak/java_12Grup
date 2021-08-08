package com.hamit.ornekler;

import java.util.Scanner;


public class Ornekler_006 {


	public static void main(String[] args) {
		String gunler="sali";
		switch (gunler) {
		case "pazartesi":
			System.out.println("günlerden pazartesi");
			break;
		case "sali":
			System.out.println("günlerden sali");
			break;
		case "carsamba":
			System.out.println("günlerden carsamba");
			break;
		case "perþembe":
			System.out.println("günlerden perþembe");
			break;
		case "cuma":
			System.out.println("günlerden cuma");
			break;
		case "cumartesi":
			System.out.println("günlerden cumartesi");
			break;
		case "pazar":
			System.out.println("günlerden pazar");
			break;

		default:
			System.out.println("günlerden farklý bir þey girdiniz");
			break;
		}
	}
}
