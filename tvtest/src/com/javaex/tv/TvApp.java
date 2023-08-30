package com.javaex.tv;

public class TvApp {
	public static void main(String[] args) {
		
		System.out.println( " tv 초기설정 " );
		System.out.println();
		
		Tv tv = new Tv( 7, 20, false);  	
		        
		tv.status();
		
		System.out.println();
        System.out.println( " tv 전원 ON , 볼륨 120 " );
		System.out.println();
		
		tv.Power( true );
        tv.volume( 120 );
        tv.status();		          
        
		System.out.println();
        System.out.println( " tv 볼륨 off " );
        System.out.println();
        
        tv.volume( false );
        tv.status();
        
        System.out.println();
        System.out.println( " tv 체널 0으로 이동 " );
        System.out.println();
        
        tv.channel( 0 );
        tv.status();		          
        
        System.out.println();
        System.out.println( " tv 체널 up 3회 " );
        System.out.println();
        
        tv.channel( true );
        tv.channel( true );
        tv.channel( true );
        tv.status();
        
        System.out.println();
        System.out.println( " tv 전원 off " );
        System.out.println();
        
        tv.Power( false );
        tv.status();    
        
		
	}
		
	
}
