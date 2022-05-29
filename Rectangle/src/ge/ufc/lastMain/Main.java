package ge.ufc.lastMain;

import ge.ufc.main.Rect;
import ge.ufc.secondary.Rectangle;

public class Main {
	
//	Task 6
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setHeight(7);
		rectangle1.setWidth(9);
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setHeight(11);
		rectangle2.setWidth(5);
		
		Rect rect1 = new Rect();
		rect1.setHeight(8);
		rect1.setWidth(8);
		
		Rect rect2 = new Rect();
		rect2.setHeight(10);
		rect2.setWidth(6);
		
		System.out.println(rectangle1.compareTo(rectangle1, rectangle2));
		
		System.out.println(rect1.compareTo(rect2));
		
	}
}
