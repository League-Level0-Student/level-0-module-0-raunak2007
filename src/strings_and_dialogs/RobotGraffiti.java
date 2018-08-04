package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot jazz=new Robot();
		jazz.setSpeed(500);
		jazz.penDown();
		jazz.setRandomPenColor();
		jazz.move(180);
		for(int i=0;i<270;i++) {
			jazz.move(1);
			jazz.turn(1);
		}
		jazz.move((int) (135/Math.PI));
		jazz.turn(-5);
		double num=Math.sqrt(2);
		jazz.move((int) (180*num));
		
		
		
	}
	
}
