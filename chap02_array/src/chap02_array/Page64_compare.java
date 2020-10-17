package chap02_array;

import java.util.Arrays;
import java.util.Scanner;

public class Page64_compare {

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
		copy(a, b);
	
	}

	// 연습문제 04. 배열 b의 모든요소를 배열을 복사하는 메서드
	
	static void copy(int []a, int []b) {
		//첫번째) Object.clone() -> 객체 생성후 복제할 떄 사용, 원본 배열 값 변경 안됌
		//같은 내용물을 가진 서로 다른 배열 deep clone
//		a = b.clone();
		
		//두번째) Arrays 클래스 -> 전체(copyOf), 부분 (copyOfRange)
//		a = Arrays.copyOf(b, b.length);  

		//세번째) System.arraycopy() -> 시스템클래스의 배열 복사 메서드 shallow clone
		//원본객체 - 시작위치- 복사받을객체 - 위치 - 복사할 길이값이 인자로 필요함
		//장점: 자바 네이티브 인터페이스 사용으로 속도가 빠름 , 주소값만 복사
		System.arraycopy(b, 0, a , 0, b.length);
		
		System.out.println("A : ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		
		System.out.println("B : ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
	}
}
