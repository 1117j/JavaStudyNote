package chap03_search;

import java.util.Scanner;

//p117 연습문제 04 : 이진 검색의 과정을 자세히 출력하는 프로그램 작성하기
public class SearchEx04 {

	static int binSearch(int a[], int n, int key) {

		int l = 0;
		int r = n - 1;

		do {
			int c = (l + r) / 2;

			if (a[c] == key)
				return c;
			else if (a[c] < key)

				l = c + 1;

			else
				r = c - 1;

		} while (l <= r);

		return -1;

	}

	// 해답지
	static int binSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		int pl = 0; // 검색범위 맨 앞의 index
		int pr = n - 1; // 검색범위 맨 뒤의 index

		do {
			int pc = (pl + pr) / 2; // 중앙요소의 index
			System.out.print("   |");
			if (pl != pc)
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
			if (pc != pr)
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
			else
				System.out.println("->");
			System.out.printf("%3d|", pc);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[pc] == key)
				return pc; // 검색성공
			else if (a[pc] < key)
				pl = pc + 1; // 검색범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);
		return -1; // 검색실패
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("입력하라 요소개수를");
		int num = sc.nextInt();

		int x[] = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.println("입력하라 요소를");
			x[i] = sc.nextInt();
		}

		System.out.println("찾고싶은 값을 입력하라");

		int key = sc.nextInt();

		int idx = binSearch(x, num, key);

		if (idx == -1)
			System.out.println("찾고자 하는 값은 없다.");
		else
			System.out.println("찾고자 하는 값은 " + idx + "에 있다 ");

	}
}
