package chap01_loop;

import java.util.Scanner;

public class Page30 {

	public static void main(String[]args) {
		
		 Scanner sc = new Scanner(System.in); 
		 
		 //연습문제 07. 1~n의 sum 구하기
		 int n = sc.nextInt();
		 int sum = 0; 
		 
		 for(int i = 1; i <= n; i++) { 
			 sum += i; 	 
		 }
		 
		 System.out.println(sum);
		 System.out.println("======================================");

		 
		 //연습문제 08. 가우스
		 int a = sc.nextInt();
		 int sum2 = a*(a+1) / 2;
		 
		 System.out.println(sum2);
		 System.out.println("======================================");
		 
		 //연습문제 09
		 int c = sc.nextInt(); 
		 int d = sc.nextInt();
		 
		 int sum3 = Page30_1.sumof(c, d);
		 System.out.println(sum3);
		 
	}

}
