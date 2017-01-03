package uc.devices;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;

public class MousePositionDemo {

	public static void main(String[] args) {
		 PointerInfo a = MouseInfo.getPointerInfo();
		 Point b = a.getLocation();
		 int x = (int) b.getX();
		 int y = (int) b.getY();
		 System.out.print(y+","+x);
//		 Robot r = new Robot();
//		 r.mouseMove(x, y - 50);



	}

}
