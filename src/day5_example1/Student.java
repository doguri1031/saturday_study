package day5_example1;

public class Student extends Person {
	
	
	void set() {
		age = 30;
		name = "LEE";
		height = 175;

	}
	

	

	public static void main(String[] args) {

		Student s = new Student(); 
		s.set();

		System.out.println("나이 : " + s.age + "\n이름 : " + s.name + "\n키 : " + s.height + "\n몸무게 : " + s.weight);

	}

}
