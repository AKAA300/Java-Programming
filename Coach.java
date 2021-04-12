package drawingTool_00;

import java.awt.Color;

public class Coach {

  public void drawCoach() {
	  //onu azu ihu motor
	  Drawing.pen().setColor(Color.red);
		Drawing.pen().drawLine(170,530,300,530);
		Drawing.pen().drawArc(128,400,350,150,90,130);
		Drawing.pen().drawLine(170,525,170,530);
		
    Drawing.pen().setColor(Color.red);
    Drawing.pen().drawRect(300, 400, 310, 130); // main coach
  }
  public void drawFrontCoach() {
	    Drawing.pen().setColor(Color.red);
	    Drawing.pen().drawRect(615, 400, 310, 130); // middle coach
	    
	    //third coach
	  //onu azu azu motor
	    Drawing.pen().setColor(Color.red);
	    Drawing.pen().drawLine(1240,530,1395,530);
		Drawing.pen().drawArc(1055,400,350,200,-270,-107);
		Drawing.pen().drawLine(170,525,170,530);
	  
	  
	  Drawing.pen().setColor(Color.red);
	  Drawing.pen().drawRect(930, 400, 310, 130); // main coach
	  }
}


