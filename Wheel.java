package drawingTool_00;

import java.awt.Color;

public class Wheel {

  public void drawWheel() {
	
	// front wheel
	Drawing.pen().setColor(Color.black);
	Drawing.pen().fillOval(200, 530, 50, 50);
	
	// first coach wheel
    Drawing.pen().setColor(Color.black);
    Drawing.pen().fillOval(320, 530, 50, 50);
    Drawing.pen().fillOval(510, 530, 50, 50);
    
    // Second coach wheel
    Drawing.pen().fillOval(650, 530, 50, 50);
    Drawing.pen().fillOval(835, 530, 50, 50);
    
    // third coach wheel
    Drawing.pen().fillOval(960, 530, 50, 50);
    Drawing.pen().fillOval(1160, 530, 50, 50);

	// front wheel
	Drawing.pen().setColor(Color.black);
	Drawing.pen().fillOval(1300, 530, 50, 50);

}
}

  