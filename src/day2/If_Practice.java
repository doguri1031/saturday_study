package day2;

public class If_Practice {
	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		int z = 6;
		if (x == 0) {
			System.out.println("x는 0 입니다");
		}

		if (y == 3) {
			System.out.println("y는 3입니다.");
		} else {
			System.out.println("y는 3이 아닙니다");

			if (x == 1) {
				System.out.println("x는 1입니다");
			} else if (z % 2 == 1) {
				System.out.println("z의 나머지는 1입니다.");
			} else {
				System.out.println("다 틀리셨네요");
			}
		}
	}
}
