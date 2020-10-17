package studyNote;

import java.util.Scanner;

public class BinarySearch {

	// 이진 검색법 : sort된 배열에서 검색하는 알고리즘

	// 이진 검색법 장점: 선형 검색보다 좀 더 빠르게 검색이 가능
	// 전제조건 : 데이터가 키 값으로 이미 정렬되어 있음

	static int binSearch(int[] a, int n, int key) {

		int l = 0; // 검색 첫 인덱스
		int r = n - 1; // 검색 마지막 인덱스

		do {
			int c = (l + r) / 2; // 중앙요소 인덱스
			if (a[c] == key)
				return c;

			else if (a[c] < key)
				l = c + 1; // 검색 범위 시작인덱스를 c로 옮겨 반으로 줄이기

			else
				r = c - 1; // 검색 범위 마지막 인덱스를 c로 옮겨 반으로 줄이기

		} while (l <= r);

		return -1; // 검색 실패시 -1 리턴

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("배열 길이");

		int num = sc.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하시오");
		
		System.out.println("첫번째 요소를 입력하세요");
		x[0] = sc.nextInt(); 

		for (int i = 1; i < num; i++) {
			do {
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]); // 앞 요소보다 작으면 다시 입력
		}

		System.out.println("찾을 값을 입력하세요");
		int key = sc.nextInt();

		int idx = binSearch(x, num, key);

		if (idx == -1)
			System.out.println("찾는값이 없습니다.");

		else
			System.out.println("찾는 값은 " + (idx + 1) + "번 째에 있습니다.");
	}

}
