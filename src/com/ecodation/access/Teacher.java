package com.ecodation.access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 1-) public ==> her yerden erişim vardır ==> aynı paket farklı paket subClass
 * 2-) protected ==> ayni pakette ancak subClass farklı pakette olsa dahi çalışır
 * 3-) private ==> cimridir yani sadece o classta çalışır.
 * 4-) default ==> sadece o paketteki aynı class veya farklı class
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

	private String adi;
	private String soyadi;
	private String yasi;
	
	//public String genelOzellikler;
	protected String genelOzellikler;
	
	
	public void deneme() {
		System.out.println ( this.genelOzellikler );
	}
}
