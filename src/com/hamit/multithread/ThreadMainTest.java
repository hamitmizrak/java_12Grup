package com.hamit.multithread;


public class ThreadMainTest {

	public static void main ( String [ ] args ) throws InterruptedException {
		AsenkronExtends asenkronExtends=new AsenkronExtends ( );
		TimerEcodation bir=new TimerEcodation ("deneme-1" );
		asenkronExtends.setTimerEcodation ( bir );
		
		
		AsenkronExtends asenkronExtends2=new AsenkronExtends ( );
		TimerEcodation iki=new TimerEcodation ("deneme-2" );
		asenkronExtends2.setTimerEcodation ( iki );
		
		
		System.out.println ( "1.thread Id: "+asenkronExtends.getId ( ) );
		System.out.println ( "2.thread Id: "+asenkronExtends2.getId ( ) );
		System.out.println ( "1.thread Name : "+asenkronExtends.getName ( ) );
		System.out.println ( "2.thread Name : "+asenkronExtends2.getName ( ) );
          System.out.println ( "1.thread Name : "+asenkronExtends.getName ( ) );
		System.out.println ( "1.thread HashCode : "+asenkronExtends.hashCode ( ) );
		System.out.println ( "2.thread HashCode : "+asenkronExtends2.hashCode ( ) );
		
		System.out.println ( "************************" );
		
		AsenkronExtends asenkronExtends3=new AsenkronExtends ( );
		TimerEcodation uc=new TimerEcodation ("deneme-3" );
		asenkronExtends3.setTimerEcodation ( uc );
		
		asenkronExtends.start ( );
		asenkronExtends2.start ( );
		
	
		if(asenkronExtends.isAlive ( )) {
			System.out.println ( "1.Thread yaşıyor" );
		}else {
			System.out.println ( "1.Thread yaşamıyoooooooorrrrr" );
		}
		
		
		//asenkronExtends.join ( ); //üstekiler bitmeden altakiler devam edemez.
		//asenkronExtends.wait ( );
		//asenkronExtends.notify ( );
	
		//asenkronExtends.destroy ( );
		//asenkronExtends.setPriority ( newPriority );
		
		
		asenkronExtends.setName ("Değişti" );
		System.out.println ( "2.thread Name : "+asenkronExtends.getName ( ) );
		//asenkronExtends2.stop ( );
	
		

	}

}
