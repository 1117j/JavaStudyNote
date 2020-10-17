package chap01_loop;

import java.util.Scanner;

public class Page40 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();	
//		triLB(n);

//		int a = sc.nextInt();
//		triLU(a);
		
//		int b = sc.nextInt();
//		triLU(b); 

//		int c = sc.nextInt();
//		triRB(c); 
		
		spira(n); 
	}

	// 연습문제 15-1. 직각 이등변 삼각형을 출력하는 부분을 메서드로 해봐
//	static void triLB(int n) {
//		for(int i = 1; i <= n; i++) {
//			for(int j =1 ; j <= i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

	// 연습문제 15-2. 왼쪽 위가 직각인 이등변 삼각형 출력
//	static void triLU(int n) {
//		for (int i = 1; i <= n; i++) { // i행 (i= 1, 2, ~, n)
//
//			for (int j = 1; j <= n - i + 1; j++) { // n-i+1개의 별을 나타냄
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
//	}

	// 연습문제 15-3. 오른 위가 직각인 이등변 삼각형 출력
//	static void triRU(int n) {
//		for (int i = 1; i <= n; i++) { 
//			for (int j = 1; j <= i - 1; j++) { 
//				System.out.print(" "); //공백출력 
//			}			
//			for (int j = 1; j <= n - i + 1; j++) { 
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//	}

	// 연습문제 15-4. 오른 아래가 직각인 이등변 삼각형 출력
//	static void triRB(int n) {
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j <= n - i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i; j++) { 
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

	// 연습문제 16. n단 피라미드
	static void spira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= (n - i)/2; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			for(int j = 1; j <= (n - i)/2; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	// 연습문제 17. n단 숫자 피라미드
	static void npira(int n) {

	}

}
