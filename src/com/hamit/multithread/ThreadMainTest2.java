package com.hamit.multithread;


public class ThreadMainTest2 {

	public static void main ( String [ ] args ) throws InterruptedException {
		Thread thread=new Thread ( new AsenkronExtends2 ( ) );
		
		thread.start ( );
	
		

	}

}
