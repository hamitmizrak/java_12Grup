package com.hamit.multithread;


public class AsenkronExtends extends Thread {
	TimerEcodation timerEcodation;
	
	

	
	public TimerEcodation getTimerEcodation ( ) {
		return timerEcodation;
	}
	
	/*
	 * 1.thread HashCode : 366712642
        2.thread HashCode : 1829164700
	 */


	
	public void setTimerEcodation ( TimerEcodation timerEcodation ) {
		this.timerEcodation = timerEcodation;
	}


	@Override
	public void run ( ) {
		
		for ( int i = 0 ; i < 10 ; i++ ) {
			try {
				Thread.sleep ( 100 );
				System.out.println ( (i+1)+" " +timerEcodation.getTimerAdi ( ) );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	
	
}
