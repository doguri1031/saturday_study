package day1;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {

		int x = 1;
		int y = 1;

		System.out.println(x++);
		System.out.println(++y);
		System.out.println(x);

		x = 10;
		y = x-- + 5 + --x;
		
		System.out.println(y);
	}
}
