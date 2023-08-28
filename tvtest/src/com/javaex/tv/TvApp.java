package com.javaex.tv;

public class TvApp {
	public static void main(String[] args) {
		
		
		Tv tv = new Tv( 7, 20, false);  	
		        
		tv.status();
		
		tv.Power( true );
        tv.volume( 120 );
        tv.status();		          
        
        tv.volumeUp( false );
        tv.status();
        
        tv.channel( 0 );
        tv.status();		          
        
        tv.channelUp( true );
        tv.channelUp( true );
        tv.channelUp( true );
        tv.status();

        tv.Power( false );
        tv.status();      	
			
		
	}
		
	
}
