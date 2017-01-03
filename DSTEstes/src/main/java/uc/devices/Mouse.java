package uc.devices;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import uc.devicesIF.MouseIF;

public class Mouse implements MouseIF {
	private Robot robot;

	public Mouse(Robot robot) {
		this.robot = robot;
	}

	public void leftClick() {
		robot.mousePress(InputEvent.BUTTON1_MASK);
		// robot.delay(200);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.delay(200);

	}

	public void rightClick() {
		robot.mousePress(InputEvent.BUTTON3_MASK);
		// robot.delay(100);
		robot.mouseRelease(InputEvent.BUTTON3_MASK);
		robot.delay(200);

	}

	public void moveTo(MousePosition position) {
		robot.mouseMove(position.getX(), position.getY());
	}

	public void shift() {
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.mousePress(KeyEvent.BUTTON3_MASK);
		robot.mouseRelease(KeyEvent.BUTTON3_MASK);
		robot.keyRelease(KeyEvent.VK_SHIFT);
	}

	public void getMousePosition() {
		PointerInfo a = MouseInfo.getPointerInfo();
		try {
			for (int i = 0; i < 10; i++) {
				Point b = a.getLocation();
				int x = (int) b.getX();
				int y = (int) b.getY();
				System.out.println(y + "," + x);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void teste() {
		// this.robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		// // this.robot.delay(100);
		// this.robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		// this.robot.delay(100);
		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, true);

	}
}
