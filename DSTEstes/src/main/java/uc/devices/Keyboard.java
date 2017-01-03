package uc.devices;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import uc.devicesIF.KeyboardIF;

public class Keyboard implements KeyboardIF {
	private Robot robot;

	public Keyboard(Robot robot) {
		this.robot = robot;
	}

	public void write(String text) {
		byte[] bytes = text.getBytes();
		for (byte b : bytes) {
			int code = b;
			// keycode only handles [A-Z] (which is ASCII decimal [65-90])
			if (code > 96 && code < 123)
				code = code - 32;
			robot.delay(40);
			robot.keyPress(code);
			robot.keyRelease(code);
		}

	}

	public void pressEnter() {
		this.robot.keyPress(KeyEvent.VK_ENTER);
		this.robot.keyRelease(KeyEvent.VK_ENTER);
	}
	


}
