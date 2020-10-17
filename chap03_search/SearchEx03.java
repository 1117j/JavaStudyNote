package do_it_03Search;

import java.util.Scanner;

public class SearchEx03 {
	
//p 117 , 연습문제 03 요솟수 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 
//	배열 idx 의 맨 앞부터 순서대로 저장, 일치한 요솟수를 반환하는 메섣느 작성하기
	
	static int searchIdx(int[]a , int n, int key, int[] idx) {
		
		int count = 0;
		
		for(int i = 0; i < n; i++)
			
			if(a[i] == key) 
				idx[count++] = i;
		
		return count; 
	}
	

	public static void main(String[]args) { 
		
		
		Scanner sc  = new Scanner(System.in); 
		
		System.out.println("배열 x 길이를 정해보소");
		int num = sc.nextInt(); 
		
		int []x = new int[num];
		int []y = new int[num];
		
		System.out.println("배열 속을 채우세요");
		for(int i = 0; i < num; i++) {
			x[i] = sc.nextInt(); 
		}
		
		System.out.println("어떤 숫자를 찾고싶은가요?");
		int key = sc.nextInt();
		
		int cnt = searchIdx(x, num, key, y);
		
		if(cnt == 0)
			System.out.println("요솟값이 없습니다.");
		else			
			for(int i = 0 ; i < cnt ; i++) { 
			System.out.println("요솟값 ㅋㅋㅎㅋ  : " +  y[i] );
			} 
		}
	
	
}


