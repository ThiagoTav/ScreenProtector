package classes;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Elipse{
	public Circle( Color color, int posX, int posY, int size) {
		
		super(color, posX, posY, size, size);
		
	}
	
	public void setWidth(int size) {
		super.setWidth(size);
		super.setHeight(size);

	}
	
	public void setHeight(int size) {
		super.setWidth(size);
		super.setHeight(size);

	}
}


