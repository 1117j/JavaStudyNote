package do_it_03Search;

import java.util.Scanner;

//p117 연습문제 05. binSearch 메서드 작성하기
public class SearchEx05 {
	
	static int binSearchX(int a[], int n, int key) { 
		
		int l = 0; 
		int r = n-1; 	
		
		do {
			int c = (l+r)/ 2;
			
			if(a[c] == key) {
				for(; c < l ; c--)	//key와 같은 맨 앞의 요소를 찾습니다. 
					if(a[c-1] < key)
						break;
				return c; //검색성공시
			}
			
			else if(a[c] > key) 
				l = c + 1;
			
			else 
				r = c - 1;
			
		} while(l <= r);
		
		
		return -1;
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		int x[] = new int[num];
	}

}
