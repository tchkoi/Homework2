package ge.ufc.secondary;

public class Rectangle {
	
	private int height;
	private int width;
	
	public void setHeight(int height) {
		this.height = height;
	} 
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	public int getWidth() {
		return width;
	}
	
//	Task 4
	protected int countPerimeter() {
		return 2*(height+width);
	}
	
//	Task 5
	public  int compareTo (Rectangle rectangle1,Rectangle rectangle2) {
		if(rectangle1.countPerimeter() > rectangle2.countPerimeter()) {
			return 1;
		}
		if(rectangle1.countPerimeter() < rectangle2.countPerimeter()) {
			return -1;
		} else return 0;
	}
}
