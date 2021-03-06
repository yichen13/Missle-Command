
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Plane {
	
	private int x,y,width;
	private Rectangle rectangle;
	private boolean standing;
	
	public Plane (int width) {
		x = width;
		y = 50;
		this.width = width;
		standing = true;
	}
	
	public void reset() {
		x = width;
		standing = true;
	}
	
	public void kill() {
		standing = false;
	}
	
	public boolean getStatus() {
		return standing;
	}
	
	public Rectangle getArea() {
		return rectangle;
	}
	
	public void update() {
		x -= 5;
		rectangle = new Rectangle(x,y,68,45);
	}
	
	public void draw (Graphics g) {
		if (standing) {
			g.setColor(Color.GREEN);
			g.drawLine(x,y+25,x+50,y+25);
			g.drawLine(x+8,y+21,x+60,y+21);
			g.drawLine(x+60,y+22,x+68,y+7);
			g.drawLine(x+40,y,x+29,y+21);
			g.drawLine(x+28,y+25,x+38,y+45);
		}
	}
}