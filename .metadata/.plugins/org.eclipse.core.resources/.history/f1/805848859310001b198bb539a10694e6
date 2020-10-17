package do_it_03Search;

import java.util.Scanner;

//p 115 , 연습문제 01 
public class SeqSearchEx01 {
	// 선형검색 보초법 
	 // while 루프를 for로 변경하기
	static int SeqSearchfor(int a[], int n, int key) { 
		
	
		for(int i = 0; i < n ; i++)
			if(a[i] == key) 
				return key;
			return -1; 
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력하세요. 요소개수를");
		int num = sc.nextInt(); 
		
		int x[] = new int[num+1];
		
		
		for(int i = 0 ; i < num ; i++) { 
			System.out.println("입력하시오. 요소를");
			x[i] = sc.nextInt(); 
		}
		
		System.out.println("찾고싶은 값을 입력해");
		int key = sc.nextInt();
		
		x[num] = key;
		
		int idx = SeqSearchfor(x, num, key);

		if (idx == -1) {
			System.out.println("찾는값은 없다네");
		} else 
			System.out.println("찾는값은 "  + (idx+1) + "번째 숫자라네");
		
		
	}

}
