package com.hamit.multithread;


public class ThreadMainTest3 {

	public static void main ( String [ ] args ) throws InterruptedException {
		Thread thread=new Thread ( new Runnable( ) {
			
			@Override
			public void run ( ) {
				for ( int i = 0 ; i < 10 ; i++ ) {
					try {
						Thread.sleep ( 100 );
						System.out.println ( (i+1));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
			}
		} );
		
		thread.start ( );
	
		

	}

}
