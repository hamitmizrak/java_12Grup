package com.hamit.dersler;


public class Ders_027_if_elseif_else_switchcase {

	
	public static void main(String[] args) {

		int sayi=5;
//		if(sayi==1) {
//			System.out.println("sayý 1");
//		}else if(sayi==2) {
//			System.out.println("sayý 2");
//		}
//		else if(sayi==3) {
//			System.out.println("sayý 3");
//		}
//	
//		else if(sayi==4) {
//			System.out.println("sayý 4");
//		}
//	
//		else if(sayi==5) {
//			System.out.println("sayý 5");
//		}
//	
//		else {
//			System.out.println("sayý farklýdýr");
//		}
	
		switch (sayi) {
		case 1:
			System.out.println("sayý 1");
			break;
case 2:
	System.out.println("sayý 2");
			break;
case 3:
	System.out.println("sayý 3");
	break;
case 4:
	System.out.println("sayý 4");
	break;
case 5:
	System.out.println("sayý 5");
	break;
	

		default:
			System.out.println("farklýdýr");
			break;
		}
	
	
		
	}

}
