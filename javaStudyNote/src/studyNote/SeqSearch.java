package studyNote;

import java.util.Scanner;

public class SeqSearch {

	// 선형검색 p.102

	// 요소수가 n인 배열 a에서 key와 같은 요소를 선형 검색하기

	static int seqSearch(int a[], int n, int key) {
		
//		for(int i = 0; i < n ; i++) 		
//			if (a[i] == key) 
//				return i; 
//			return -1;
			
			int i = 0;
		
			while(true) {
			
			if(a[i]==key) 
				return i; 
			if(a[i]!=key)
				return -1; 
			i++; 
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int [] x = new int[num];
		
		for(int i  = 0; i < num ; i++ ) {
			System.out.println("X[" + i + "] :");
			x[i] = sc.nextInt();
		}
		
		System.out.println("검색할 값 입력 : ");
		
		int key = sc.nextInt(); 
		
		int idx = seqSearch(x, num, key);
		
		if (idx == -1) {
			System.out.println("없는 값입니다.");
		}else 
			System.out.println(idx +"번째에  있습니다.");
	
		
	}

}
