package day1.test;

import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요: ");
		String name =sc.nextLine();
		
		System.out.println("나이를 입력해주세요: ");
		String age = sc.nextLine();
		
		System.out.println("이름은 " + name + "이고 나이는" + age + "살입니다.");
		
	}
	
	
}
