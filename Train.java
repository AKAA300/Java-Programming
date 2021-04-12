package drawingTool_00;

public class Train {
  private Coach coach;
  private Door door;
  private Wheel wheel;
  private Window window;
  private PressedButton button;
  private Design design1;

  public Train() {
    coach = new Coach();
    door = new Door();
    wheel = new Wheel();
    window = new Window();
    button = new PressedButton();
    design1 = new Design();
  }

  public void drawTrain() {
    coach.drawCoach();
    coach.drawFrontCoach();
    door.drawDoor();
    wheel.drawWheel();
    window.drawWindow();
    button.drawButton();
    design1.drawBodyLine();
  }

}