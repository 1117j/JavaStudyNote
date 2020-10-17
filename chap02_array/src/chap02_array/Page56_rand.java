package chap02_array;

import java.util.Random;

public class Page56_rand {
	public static void main(String[]args) {
		
		//난수를 뽑쟈
		Random ra = new Random();
		
		int n = ra.nextInt(10); //10미만의 사람수를 난수로 뽑기
		int[] a = new int[n];  //n개의 배열a 선언
		
		for(int i = 0; i < a.length; i++) {
			a[i] = 100 + ra.nextInt(91); //키 난수로 넣기
			System.out.println("["+ (i+1) +"번]" +  a[i] + "cm");
		}
		
		System.out.println("총 인원 :  " + n + "명");
		System.out.println("제일 키가 큰 학생은 " + maxArrRand(a) + "cm 입니다.");
		}
	
	//연습문제 01. 사람수와 키를 난수로 설정
	static int maxArrRand(int[] a){
		 int max = a[0];	 
		 for(int i = 0; i < a.length; i++) {
			 if(max < a[i]) {
				 max = a[i];
			 }
		 }
		return max; 
	}

}
