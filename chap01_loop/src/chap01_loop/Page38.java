package chap01_loop;

import java.util.Scanner;

public class Page38 {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================곱셈표");	
		//연습문제 12 . 곱셈표 만들기
		System.out.println("   | " + " 1  2  3  4  5  6  7  8  9");
		System.out.println("---+----------------------------");
		int cnt = 1;
		for(int i = 1; i < 10; i++) {
			System.out.print(cnt + "  |");
			cnt++;
			for(int j = 1; j < 10;j++) {
				//printf (fomatted) - > 서식화된 출력 지원
				// %d 의미  : 10진수 형태로 출력  --> 앞에 자리를 확보 3이면 --d값으로 들어감
				System.out.printf("%3d" , i*j);
			}
			//한줄 
			System.out.println();	
		}
		System.out.println("=================================덧셈표");
		
		//연습문제 13. 곱셈이 아니라 덧셈을 출력하는 프로그램 작성 
		System.out.println("   | " + " 1  2  3  4  5  6  7  8  9");
		System.out.println("---+----------------------------");
		int cnt01 = 1;
		for(int i = 1; i< 10; i++) {
			System.out.print(cnt01 + "  |");
			cnt01++;
			for(int j =1 ; j < 10; j++) {
				System.out.printf("%3d", i+j);
			}
			System.out.println();
		
		}
		
		System.out.println("=================================사각형");
		//연습문제 14. 사각형 출력하기 
		System.out.println("정사각형 단의 수를 입력하기 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) { 
			System.out.println();
			for(int j = 1; j <= row; j++) {
			System.out.print("*");
			}
		}
		
		System.out.println();
		System.out.println("=================================");
		
		
		
		
		
		
	} 
}