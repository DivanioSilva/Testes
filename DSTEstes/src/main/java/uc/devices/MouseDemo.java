package uc.devices;

import java.awt.AWTException;
import java.awt.Robot;

public class MouseDemo {

	public static void main(String[] args) {
		MousePosition position;

		try {

			// Rotina para abrir o browser e ir a uma página.
			position = new MousePosition(213, 1064);
			MousePosition browserAddress = new MousePosition(267, 43);
			Robot robot = new Robot();
			Mouse mouse = new Mouse(robot);
//			mouse.moveTo(position);
//			// mouse.rightClick();
//			mouse.leftClick();
//			mouse.leftClick();
//
//			mouse.moveTo(browserAddress);
//			mouse.leftClick();
//
//			Keyboard keyboard = new Keyboard(robot);
//			keyboard.write("http://www.xe.com/?c=USD");
//			keyboard.pressEnter();
//
//			MousePosition fecharBrowser = new MousePosition(1890, 9);
//			mouse.moveTo(fecharBrowser);
			Thread.sleep(2000);
			mouse.teste();
			Thread.sleep(100);
//			mouse.teste();
			
			mouse.rightClick();

			// mouse.getMousePosition();

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
