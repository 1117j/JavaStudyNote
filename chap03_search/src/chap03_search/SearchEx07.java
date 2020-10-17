package chap03_search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//129p, 시력에 대한 내림차순 정렬의 신체검사 데이터에서 특정 시력을 가진 사람을 검색하는 프로그램을 작성해
public class SearchEx07 {

		// 1. 신검 데이터 정의
		static class PhyscData {
			private String name;
			private int height;
			private double vision;

			// 생성자
			public PhyscData(String name, int height, double vision) {
				this.name = name;
				this.height = height;
				this.vision = vision;
			}

			// 문자열 반환 메서드(정보확인용)
			@Override
			public String toString() {
				return "PhyscData [name=" + name + ", height=" + height + ", vision=" + vision + "]";
			}

			// 내림차순으로 정렬하기 위한 comparator
			public static final Comparator<PhyscData> VIS_ORDER = new VisOrderComparator();

			private static class VisOrderComparator implements Comparator<PhyscData> {
				public int compare(PhyscData d1, PhyscData d2) {
					return (d1.vision < d2.vision) ? 1 : (d1.vision > d2.vision) ? -1 : 0;
				}
			}

		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			PhyscData[] x = { // 시력의 내림차순으로 정렬되어 있습니다.
					new PhyscData("이수민", 175, 2.0),
					new PhyscData("홍준기", 171, 1.5), 
					new PhyscData("이호연", 174, 1.2),
					new PhyscData("이나령", 162, 0.3), 
					new PhyscData("김한결", 169, 0.8),
					new PhyscData("전서현", 173, 0.7), 
					new PhyscData("유지훈", 168, 0.4), 		
					};
			
			System.out.println("시력이 몇인 사람을 찾는가? 입력 방식  0.0");
			double vis = sc.nextDouble(); 
			
			int idx = Arrays.binarySearch(
									x,
									new PhyscData("", 0, vis), 
									PhyscData.VIS_ORDER);
			if(idx < 0)
				System.out.println("요소가 없습니다.");
			
			else {
				System.out.println("x[ " + idx  + " ] 에 있습니다.");
				System.out.println("찾은 데이터  : " + x[idx]);
			}
			}

	}



