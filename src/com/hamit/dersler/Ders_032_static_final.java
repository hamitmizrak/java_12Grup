package com.hamit.dersler;

//javada 1 tane public class   var (inner class)
//javada static class  yazamam     (inner class)
public  final class Ders_032_static_final { //bu classı extends edemezsiniz. 
	
    // static: new oluşturmadan nesneleri çağırmak için kullanıyoruz. durağan 
	// 1 tane new oluşturuluru ve sonradan gelen nesneler hepsi oluşturulan new üzerinden devam eder.
	// bir static method başka bir değişkeni çağırmak istiyorsa diğer nesnede static olmak zorundadır.
	
	//final 
	//1-) değişkenlerde sabitlemek için
	//2-) metotlarda kullanırsak @Override edemeyiz
	//3-) classlarda kullanırsak extends edemeyiz.
	
	public final double sabit=4;
	public void deneme() {
		System.out.println("bu metodu @Override edemezsiniz");
	}
	
	
	//Sabitleyici
	public static final String  DEGISKEN_ADI=" değiştirimezsin.";
	

}

 class deneme2{}
