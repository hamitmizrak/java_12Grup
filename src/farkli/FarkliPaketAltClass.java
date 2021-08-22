package farkli;

import java.io.Serializable;

import com.hamit.inheritance.Person;

public class FarkliPaketAltClass extends Person implements Cloneable,Serializable {


	public void deneme() {
	String deger=  genelNesne;
		System.out.println ( deger );
	}
}
