package com.hamit.dersler;


public class Ders_027_if_elseif_else_switchcase {

	
	public static void main(String[] args) {

		int sayi=5;
//		if(sayi==1) {
//			System.out.println("say� 1");
//		}else if(sayi==2) {
//			System.out.println("say� 2");
//		}
//		else if(sayi==3) {
//			System.out.println("say� 3");
//		}
//	
//		else if(sayi==4) {
//			System.out.println("say� 4");
//		}
//	
//		else if(sayi==5) {
//			System.out.println("say� 5");
//		}
//	
//		else {
//			System.out.println("say� farkl�d�r");
//		}
	
		switch (sayi) {
		case 1:
			System.out.println("say� 1");
			break;
case 2:
	System.out.println("say� 2");
			break;
case 3:
	System.out.println("say� 3");
	break;
case 4:
	System.out.println("say� 4");
	break;
case 5:
	System.out.println("say� 5");
	break;
	

		default:
			System.out.println("farkl�d�r");
			break;
		}
	
	
		
	}

}
