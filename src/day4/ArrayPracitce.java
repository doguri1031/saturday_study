package day4;

public class ArrayPracitce {

	public static void main(String[] args) {

		String[] stringArray = new String[3];
		int[] intArray = new int[4];
		int[] intArray2 = {1,2,3,4,5};
		String[] stringArray2 = {"apple", "banana", "cookie"};
		
		
		stringArray[0] = "array1";
		stringArray[1] = "array2";
		stringArray[2] = "array3";
		
		for (int i = 0; i < stringArray2.length; i++) {
			System.out.println(stringArray2[i]);
		}
		
	}

}
