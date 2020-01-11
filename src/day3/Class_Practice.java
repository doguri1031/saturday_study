package day3;

public class Class_Practice {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 10;
		myCar.gear = 3;
		myCar.print();

		Car yourCar = new Car();
		yourCar.color = "blue";
		yourCar.speed = 3;
		yourCar.gear = 1;
		yourCar.print();

	}
}

class Car {
	String color;
	int speed;
	int gear;

	void print() {
		System.out.println("(" + color + ", " + speed + ", " + gear + ")");
	}
}