package uc.devicesIF;

import uc.devices.MousePosition;

public interface MouseIF {

	public void leftClick();
	
	public void rightClick();
	
	public void moveTo(MousePosition position);
	
	/**
	 * Devolve a posi��o do rato
	 */
	public void getMousePosition();
}
