
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import java.awt.MouseInfo;
import java.awt.Point;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) { 
	
		// 1. Set the X position of the robot so that it starts on the left. 
	
				int x  = 100;
				int y  = 100;
				int move = 200;
		
	// You also need to show the robot to see the result of this lilaine.
		
		// 2. Make the robot draw a star shape. Hint: 144.
				for(int i = 0; i<30; i++) {
					Robot hi = new Robot();
					hi.setX(x);//100, 150
					hi.setY(y);
					hi.setRandomPenColor();		
					hi.penDown();
					
				hi.setSpeed(500);
					for(int j=0; j< 10; j++) {
              hi.move(30);
              hi.turn(144);
					}
              hi.penUp();
  			hi.move(move);
  			
  			x = x + 50;  // x += 50;         
  			if( x >= 500) {
				y += 200;
				x = 100;
				move += 200;
				
  			}
		}
						
			
			
				
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */
		//I remember that we did the main method last week rather sure YEHHH

	}

}
