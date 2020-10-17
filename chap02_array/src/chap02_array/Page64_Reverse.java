package chap02_array;

import java.util.Scanner;

public class Page64_Reverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int a[] = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int b[] = new int[num];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		System.out.print("기존 A : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("기존 B : ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		rcopy(a, b);
	
	}

	// 연습문제 04. 배열 b의 모든요소를 배열을 복사하는 메서드
	
	static void rcopy(int []a, int []b) {
		a = b.clone();
	
		for(int i = 0; i < a.length/2; i++) {
			Page61_Reverse.swap(a, i, a.length-i-1);
		}
		
		//두번째) Arrays 클래스 -> 전체(copyOf), 부분 (copyOfRange)
//		a = Arrays.copyOf(b, b.length);  


		System.out.print("A : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.print("B : ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
