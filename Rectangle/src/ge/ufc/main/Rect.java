package ge.ufc.main;

public class Rect {
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
	
//	Task 2
	int countPerimeter() {
		return 2*(height + width);
	}
	
	int countArea() {
		return width*height;
	}
	
//	Task 3	
	public  int compareTo (Rect rectangle) {
		if(rectangle.countArea() > this.countArea()) {
			return 1;
		}
		if(rectangle.countArea() < this.countArea()) {
			return -1;
		} else return 0;
	}
}


