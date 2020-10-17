package chap01_loop;

import java.util.Scanner;

public class Page30_1{

	//연습문제 09
	public static int sumof(int a, int b) {
		
		int sum = 0;
		int temp;
		
		if(a>b) {
			temp = b;
			b = a; 
			a = temp;	
		}
		
		for(int i = a; i <= b; i++) {
				sum += i;
		}
		
		return sum ; 
	
	}

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt(); 
		/*
		 * int sum = sumof(a,b); System.out.println(sum);
		 */
		System.out.println(sumof(a,b));
	
	}
	

}


