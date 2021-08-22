package com.hamit.bean;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class Bean_4_CDI {

	
	//Nesne değişkenleri
		private String adi;
		private String soyadi;
		
		//Ctrl+Space
		//constructor: yapıcı metotlar
		//YM:returnsuz
		//Bir sayfa çağrıldığında ilk bu metot işleme alınır.
		public Bean_4_CDI() {}

		
		//Shift+Alt+S
		//Parametreli constructor
		public Bean_4_CDI(String adi, String soyadi) {
			super();
			this.adi = adi;
			this.soyadi = soyadi;
		}
		
		//getter and setter
		//Ctrl+Shift+S
		public String getAdi() {
			return adi;
		}
		public void setAdi(String adi) {
			this.adi = adi;
		}
		public String getSoyadi() {
			return soyadi;
		}
		public void setSoyadi(String soyadi) {
			this.soyadi = soyadi;
		}


		
	//toString ==> sınıfın bir kimliğidir.
		@Override
		public String toString() {
			return "Bean_2_Bean [adi=" + adi + ", soyadi=" + soyadi + "]";
		}
	
	
	
	
}
