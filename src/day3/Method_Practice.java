package day3;

public class Method_Practice {

	public static void main(String[] args) {
		
		MethodFunction methodFunction = new MethodFunction();
		
		System.out.println(methodFunction.add(2, 3));
		System.out.println(methodFunction.booleanTest(3, 2));
		methodFunction.print();
	}
}

class MethodFunction {
	
	public int add(int x, int y) {
		
		int result = x + y;
		
		return result;
	}

	public boolean booleanTest(int x, int y) {
		
		boolean flag = false;
		
		if(x > y) {
			flag = true;
		}
		
		return flag;
	}
	
	public void print() {
		System.out.println("void test");
	}
}