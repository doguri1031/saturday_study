package day3;

public class StringClass_Practice {

	public static void main(String[] args) {
	
		String pharse = "StringClass_Practice";
		
		System.out.println(pharse.charAt(3));
		System.out.println(pharse.compareTo("StringClass_Practice"));
		System.out.println(pharse.concat("Test"));
		System.out.println(pharse.equals("stringclass_practice"));
		System.out.println(pharse.equalsIgnoreCase("stringclass_practice"));
		System.out.println(pharse.isEmpty());
		System.out.println(pharse.length());
		System.out.println(pharse.replace("Practice", "Challenge"));
		System.out.println(pharse.substring(12));
		System.out.println(pharse.toLowerCase());
		System.out.println(pharse.toUpperCase());
	}

}
