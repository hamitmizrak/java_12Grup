package com.hamit.multithread;


public class AsenkronExtends2 implements Runnable{
	private String interfaceAdi;
	

	
	public String getInterfaceAdi ( ) {
		return interfaceAdi;
	}


	
	public void setInterfaceAdi ( String interfaceAdi ) {
		this.interfaceAdi = interfaceAdi;
	}


	@Override
	public void run ( ) {
		for ( int i = 0 ; i < 10 ; i++ ) {
			try {
				Thread.sleep ( 100 );
				System.out.println ( (i+1)+" " +getInterfaceAdi ( ));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	





	
	
}
