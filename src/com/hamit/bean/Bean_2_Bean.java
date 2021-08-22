package com.hamit.bean;

import java.io.Serializable;

public class Bean_2_Bean implements Serializable {
	private static final long serialVersionUID = -6382658340134945558L;
	
		//Nesne değişkenleri
		private String adi;
		private String soyadi;
		
		//Ctrl+Space
		//constructor: yapıcı metotlar
		//YM:returnsuz
		//Bir sayfa çağrıldığında ilk bu metot işleme alınır.
		public Bean_2_Bean() {}

		
		//Shift+Alt+S
		//Parametreli constructor
		public Bean_2_Bean(String adi, String soyadi) {
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

        //hashcode
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((adi == null) ? 0 : adi.hashCode());
			result = prime * result + ((soyadi == null) ? 0 : soyadi.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Bean_2_Bean other = (Bean_2_Bean) obj;
			if (adi == null) {
				if (other.adi != null)
					return false;
			} else if (!adi.equals(other.adi))
				return false;
			if (soyadi == null) {
				if (other.soyadi != null)
					return false;
			} else if (!soyadi.equals(other.soyadi))
				return false;
			return true;
		}
	
	
		
	
	
}
