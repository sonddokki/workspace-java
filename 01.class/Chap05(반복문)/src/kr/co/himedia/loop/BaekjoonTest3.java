package kr.co.himedia.loop;

public class BaekjoonTest3 {
	public static void main(String[] args) {
		String[] name = new String[7];
		
		name[0] = new String("홍길동");
		name[1] = new String("홍길금");
		name[2] = new String("홍길은");
		name[3] = new String("청길동나라금나라");
		name[4] = new String("녹길동");
		name[5] = new String("황길동");
		name[6] = new String("적길동");
		
	    int cnum = 0;
	    
	    for (int i=0;i<name.length;i++) {
	    	System.out.println(name[i]);
	    	cnum += name[i].length();
	    }
	    
	    System.out.println("총 문자의 수 : " + cnum);

    }
}
 