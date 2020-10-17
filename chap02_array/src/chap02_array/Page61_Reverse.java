package chap02_array;

import java.util.Scanner;

public class Page61_Reverse {
	
	public static void main(String []arsgs) {
	
		Scanner sc = new Scanner(System.in);
		
//		int num = sc.nextInt(); //배열 요소수 
//		int [] arr = new int[num]; 
//		
//		
//		for(int i = 0; i< arr.length; i++) {
//			System.out.println("["+ (i+1) +"]" + ": " );
//			arr[i] = sc.nextInt();
//		}
//		
//		int sum = sumOf(arr);
//		System.out.println("sum : " +  sum);
		
//		
//		reverse(arr); 
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println((i+1)+"번째: " + arr[i]);
//		}
		
	}
	//요소n개인 배열 요소를 역순으로 정렬하는 알고리즘  : for(i=0; i</2; i++) - > a[i]와 a[n-i-1]값을 교환
	
	
	//배열 요소 교환
	static void swap (int[] a, int idx1, int idx2) { 		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a,  i, a.length-i-1);
		}
	}
	
	//연습문제 02. 역순으로 정렬하는 프로그램 작성 
	static void printReverse(int[] a) {
		for(int i = 0; i < a.length / 2;  i++) {
			swap(a, i, a.length-i-1);
			System.out.println("a ["+ i +"] 와 " +  "a[ " + (a.length-i-1) + "]를 교환합니다." );
			System.out.println();
			
		}
	}
	
	
	//연습문제 03. 배열 a의 모든 요소의 합계를 구해 반환하는 메서드;	
	static int sumOf(int[] a){
		int sum = 0;		
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}	
		return sum; 	
		}
	
	}


