package day5_example6;

public abstract class Shape {

	int x, y;
	
	public void move(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();
}
