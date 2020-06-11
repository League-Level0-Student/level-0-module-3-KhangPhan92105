package _11_intro_to_modulo;
import java.util.Random;

public class introToModulo {
	public static void main(String[] args) {
	 int number = new Random().nextInt(100);
	     System.out.println(number);
	     
	   
	    if (number % 2 == 1) {
	        System.out.println("number is odd");
	    }
	    else {
	        System.out.println("number is even");
	    }
	    int counter  = 0;
	    for (int i=1; i<=1000; i++) {
	        // do some code
	        if (i % 20 == 0){
	            System.out.println("20 more repeats completed");
	            counter++;
	        }
	    }
	    System.out.println(counter);
	}
}







