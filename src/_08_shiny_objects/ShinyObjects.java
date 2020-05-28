//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _08_shiny_objects;

import java.applet.AudioClip;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class ShinyObjects {
	public static void main(String[] args) {
		// 2. Ask the user how many shiny objects they want
   String userInput = JOptionPane.showInputDialog("How many shiny items do you want?");
	int intUserInput = Integer.parseInt(userInput);	
   // 3. Play the sound that many times
   System.out.println(intUserInput);
		// 1. Call the method below
    for(int i=0; i < intUserInput; i++) {
    	playMisterZee();
    	
    
    }
	}

	public static void playMisterZee() {
		System.out.println("play mister zee");
		try {
			AudioClip sound = JApplet.newAudioClip(ShinyObjects.class.getResource("shiny-objects.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}
