package day1;

public class TypePractice {
	
	public static void main(String[] args) {
		
		byte tooSmall = 127; // -128 ~ 127
		short small = 32767; // -32768 ~ 32767
		int nomal = 2147483647; // -2147483648 ~ 2147483647
		long big = 9223372036854775807L; // -9223372036854775808 ~ 9223372036854775807L
		float decimal = 0.1f;
		double dobuleDecimal = 0.01d;
		char unicode = 'c'; // '\u0000'(0) ~ '\uFFFF'(65535)
		boolean flag = true; // true , false
		String pharse = "hello";
		
		char test = '1' + '2';
		int plus = tooSmall + small;
		double plus2 = 2 + 3;
		String plus3 =  pharse + nomal;
		System.out.println(plus);
		System.out.println(plus2);
		System.out.println(plus3);
		System.out.println(flag);
		System.out.println(1>2);
		System.out.println(1+1);
	    System.out.println(nomal);
	    System.out.println(small);
		
	}

	
	
	
}
