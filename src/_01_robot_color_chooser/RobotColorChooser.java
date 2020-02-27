//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
	Robot Anime = new Robot ();
		//3. Ask the user what color they would like the robot to draw
	String color; 
		for (int i = 11 ; i>10; i++); {
	color = JOptionPane.showInputDialog("What color do you want to use?");
		//5. Use an if/else statement to set the pen color that the user requested
          if(color.equalsIgnoreCase("red")) {
        	  Anime.setPenColor(250, 0, 0);
          }
          else if(color.equalsIgnoreCase("green")) {
        	  Anime.setPenColor(0, 250, 0);
          }
          else if(color.equalsIgnoreCase("blue")) {
        	  Anime.setPenColor(0, 0, 250);
          }
        //6. If the user doesn’t enter anything, choose a random color
          else { Anime.setRandomPenColor(); }
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
        Anime.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
              Anime.setSpeed(100);
              Anime.penDown();
        Anime.move(100);
        Anime.turn(90);
        Anime.move(100);
        Anime.turn(90);
        Anime.move(100);
        Anime.turn(90);
        Anime.move(100);

		}
	}
	}


