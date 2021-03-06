package studyNote_04;

import java.util.Scanner;

import studyNote_04.IntStack.EmptyIntStackException;
import studyNote_04.IntStack.OverflowIntStackException;

public class IntStackTester {
	// 스택을 사용하는 프로그램
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		IntStack s = new IntStack(64); // 최대 64개를 푸쉬할 수 있는 스택

		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.println("1. 푸시 ");
			System.out.println("2. 팝 ");
			System.out.println("3. 피크 ");
			System.out.println("4. 덤프 ");
			System.out.println("0. 종료 ");

			int menu = sc.nextInt();
			if (menu == 0) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}

			int x;

			switch (menu) {
			case 1:
				System.out.println("데이터 : ");

				x = sc.nextInt();

				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 차 있습니다.");
				}

				break;

			case 2:

				try {
					x = s.pop();
					System.out.println("팝 한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 4:
				s.dump();
				break;
			}

		}

	}

}
