package chap01_loop;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Page19 {

	// 연습문제  01 (최댓값 구하기)
	static int max4(int a, int b, int c, int d) {
		int max = a;

		if (b > max) {
			max = b;
		}

		if (c > max) {
			max = c;
		}

		if (d > max) {
			max = d;
		}
		return max;
	}

	// 재준형님 -> Arrays.sort 사용하여 오름차순으로 sort
	static int max4_jj(int a, int b, int c, int d) {
		int arr[] = { a, b, c, d };
		Arrays.sort(arr);
		int max = arr[3];
		return max;
	}

	// 연습문제 02 (최솟값 구하기)
	static int min3(int a, int b, int c) {
		int min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		return min;
	}

	// 연습문제 02 (sort사용해서 최솟값 구하기)
	static int min3_sort(int a, int b, int c, int d) {
		Integer[] arr = {a,b,c,d};
		//int[]쓰면 오류남 ㅠㅋㅠ
		Arrays.sort(arr, Collections.reverseOrder());
		int min = 0;
		return min;
	}
	// 연습문제 03 (최솟값 구하기)
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		if (min > d) {
			min = d;
		}
		return min;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int max = max4_jj(a, b, c, d);

		System.out.println(max);


	}

}
