package day1.test;

import java.util.Scanner;

public class InputData2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 :");
		int number = sc.nextInt();
		System.out.println("두번째 정수를 입력하시오: ");
		int number2 = sc.nextInt();
		
		System.out.println(number2 + "을/를" + number + "으로 나눈 몫은 " 
		+ number2 / number + " 나머지는 " + number2 % number + "입니다");
	}
}
