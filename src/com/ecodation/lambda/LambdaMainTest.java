package com.ecodation.lambda;


public class LambdaMainTest {

	public static void main ( String [ ] args ) {
		LambdaExamples lambdaExamples=new LambdaExamples( ) {
			
			@Override
			public void lambdaMethod ( ) {
				System.out.println ( "Lambda kullanmadan methodum budur." );
				
			}
		};
		
		lambdaExamples.lambdaMethod ( );
		
		System.out.println ( "************************************************" );
		LambdaExamples lambdaExamples2 = ()-> {System.out.println ( "Lambda kullanmadan methodum budur." );};
		lambdaExamples2.lambdaMethod ( );
		
		

	}

}
