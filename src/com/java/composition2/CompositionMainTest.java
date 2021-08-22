package com.java.composition2;


public class CompositionMainTest {
public static void main ( String [ ] args ) {

	//1
	MalatyaParkAvm avm=new MalatyaParkAvm ( "Malatya Avm");
	
	//N
	MediaMarket mediaMarket=new MediaMarket ( "media" , "5000" );
	mediaMarket.setMalatyaParkAvm ( avm );
     mediaMarket.getMalatyaParkAvm ( ).getMediaMarketList ( ).add ( mediaMarket )	;
     
     MediaMarket teknosa=new MediaMarket ( "teknosa" , "8000" );
     teknosa.setMalatyaParkAvm ( avm );
     teknosa.getMalatyaParkAvm ( ).getMediaMarketList ( ).add ( teknosa )	;
     
     System.out.println ( avm );
     
     for(MediaMarket temp:teknosa.getMalatyaParkAvm ( ).getMediaMarketList ( ) ) {
     	System.out.println ( temp );
     }
}
}
