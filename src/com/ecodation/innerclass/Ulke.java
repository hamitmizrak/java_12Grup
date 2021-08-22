package com.ecodation.innerclass;


public  class Ulke {

	//ulke
	private String ulkeAdi;

	
	public String getUlkeAdi ( ) {
		return ulkeAdi;
	}

	
	public void setUlkeAdi ( String ulkeAdi ) {
		this.ulkeAdi = ulkeAdi;
	}

	
	//şehir
	public static class Sehir{
		private String sehirAdi;

		
		public String getSehirAdi ( ) {
			return sehirAdi;
		}

		
		public void setSehirAdi ( String sehirAdi ) {
			this.sehirAdi = sehirAdi;
		}
		
		//mahalle
		public static class Mahalle{
			private String mahalle;

			
			public String getMahalle ( ) {
				return mahalle;
			}

			
			public void setMahalle ( String mahalle ) {
				this.mahalle = mahalle;
			}
			
		}
		
	}
}

