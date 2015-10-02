package edu.ku.eecs168.lab4;

import android.graphics.Color;
import edu.ku.swingemu.AndroidJApplet;

public class Lab4 extends AndroidJApplet {

	@Override
	public void paint(Graphics canvas) {
		
	canvas.setColor(Color.YELLOW);
	canvas.fillOval(100, 50, 200, 200);
	canvas.setColor(Color.BLACK);
	canvas.drawOval(100, 50, 200, 200);
	canvas.fillOval(155, 100, 10, 20);
	canvas.fillOval(230, 100, 10, 20);
	canvas.drawArc(150, 160, 100, 50, 180, 180);
	
	canvas.drawLine(100, 500, 300, 300);
	canvas.drawLine(300, 300, 500, 500);
	canvas.drawLine(500, 500, 100, 500);
	
	canvas.setColor(Color.RED);
	canvas.fillRect(900, 50, 200, 200);
	canvas.setColor(Color.BLACK);
	canvas.drawRect(900, 50, 200, 200);
	
	canvas.setColor(Color.CYAN);
	canvas.fillRoundRect(800, 500, 250, 150, 70, 70);
	canvas.setColor(Color.BLACK);
	canvas.drawRoundRect(800, 500, 250, 150, 70, 70);
	
	}

}
