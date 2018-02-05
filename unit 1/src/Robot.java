//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
      
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      
      head(window);
      upperBody(window);
      lowerBody(window);
      legs(window);
      arms(window);
      face(window);

      //call head method
      
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(350, 100, 100, 100);
      
      

		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
	   window.setColor(Color.GREEN);
	   window.fillRect(350,200 , 100, 100);
	   

		//add more code here
   }

   public void lowerBody( Graphics window )
   {

		window.setColor(Color.BLUE);
		window.fillRect(350, 300, 100, 50);

   }
   
   public void legs(Graphics window)
   {
	   window.setColor(Color.yellow);
	   window.fillRect(360, 350, 20,100);
	   window.fillRect(420, 350, 20, 100);
	   
   }
   
   public void arms (Graphics window)
   {
	   window.fillRect(250, 200, 100, 20);
	   window.fillRect(450, 200, 100, 20);
   }
   
   public void face (Graphics window)
   {
	   window.setColor(Color.RED);
	   window.drawArc(350, 80, 100, 100, 235, 75);
	   window.setColor(Color.BLACK);
	   window.fillOval(360,150, 10, 10);
	   window.fillOval(430, 150, 10, 10);
	   window.fillRect(395, 50, 10, 50);
   }
}