package studynote;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearchTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 입력: ");
		
		int num = sc.nextInt();
		int[]x = new int[num];
		
		System.out.println("오름차순으로 배열을 채우세요ㅋㅎ");
		
		
		x[0] = sc.nextInt(); //배열의 첫 요소를 먼저 입력 
		
		for(int i = 1; i < num; i++) { 
			do {
				x[i] = sc.nextInt(); 
			}while (x[i] < x[i-1]);  //바로 앞 요소보다 작으면 다시 입력
		}
		
		System.out.println("검색할 값 : ");
		int key = sc.nextInt(); 
		
		int idx = Arrays.binarySearch(x, key);  //배열 x에서 키값이 key인 요소를 검색
		
		if(idx < 0)
			System.out.println("그 값의 요소가 없습니다.");
			
		else 
			System.out.println("ㅎ");
	
	}

}
