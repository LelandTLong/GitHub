//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);

		Shape rectangle = new Shape(250, 100, 300, 300, Color.BLUE);
		rectangle.draw(window);
		//instantiate a Shape
		//tell your shape to draw
		Shape innerRectangle = new Shape(300, 150, 200, 200, Color.RED);
		innerRectangle.draw(window);
		//instantiate a Shape
		//tell your shape to draw
		Shape horizontalRectangle = new Shape(300, 200, 200, 20, Color.GREEN);
		horizontalRectangle.draw(window);
		//instantiate a Shape
		//tell your shape to draw
		Shape horizontalRectangle2 = new Shape(300, 300, 200, 20, Color.GREEN);
		horizontalRectangle2.draw(window);
		
		Shape sideRectangle = new Shape(200, 200, 100, 100, Color.CYAN);
		sideRectangle.draw(window);
		
		Shape sideRectangle2 = new Shape(500, 200, 100, 100, Color.CYAN);
		sideRectangle2.draw(window);
		
	}
}