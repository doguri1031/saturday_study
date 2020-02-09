package day5_example3;

public class ChildrenClass extends SuperClass {

	int data = 200;
	public void print() {
		super.print();
		System.out.println("서브 클래스 print method");
		System.out.println(this.data);
		System.out.println(super.data);
	}
}
