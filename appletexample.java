package sem;
import  java.applet.*;
import  java.awt.Graphics;

public class appletexample extends Applets {

	public void paint(Graphics g) {
		g.drawstring("hello applet",20,20);
		
	}
	public void init() {
		set size(400,300);
	}
}
