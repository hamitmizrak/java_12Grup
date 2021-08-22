package com.hamit.bean;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "managedBean4")
@ApplicationScoped

public class Bean_3_ManagedBean implements Serializable {
	private static final long serialVersionUID = 166005648896455572L;
	
		//Nesne değişkenleri
		private String adi;
		private String soyadi;
		
		//Ctrl+Space
		//constructor: yapıcı metotlar
		//YM:returnsuz
		//Bir sayfa çağrıldığında ilk bu metot işleme alınır.
		public Bean_3_ManagedBean() {}

		
		//Shift+Alt+S
		//Parametreli constructor
		public Bean_3_ManagedBean(String adi, String soyadi) {
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
