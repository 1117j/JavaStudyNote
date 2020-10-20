package algorithm;

public class GCF {
	
	public static void main(String [] args ) { 
		
		int a = 10;
		int b = 23;

		int r = gcd(a,b);
		
		System.out.println(r);
		
		
	}
	
	static int gcd(int a, int b){
		
		while(b!=0){
			int r = a%b;				
			a= b;						
			b= r;						
		}								
		return a;
	}
										

}
