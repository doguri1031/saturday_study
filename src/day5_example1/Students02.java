package day5_example1;

public class Students02 extends Person{

	void set() {
		age = 30;
		name = "LEE";
		height = 175;
		weight = 99;
		String[] arrayBlood = {"A","B","O","AB"};
		setGender("male");
		
		System.out.println(arrayBlood[0]);
	}
	
	public static void main(String args[]) {
		ArrayTest st = new ArrayTest();
		
		System.out.println(st.getArrayBlood()[0]);
	}
}
	
	
class ArrayTest {
	
	private String[] arrayBlood = {"A","B","O","AB"};
	
	
	public String[] getArrayBlood() {
		
		return arrayBlood;
		
	}
	
}