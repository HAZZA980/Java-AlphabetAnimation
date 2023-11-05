package helloWorld;

import java.util.ArrayList;

public class a {

	   public static void main(String[] args) {
	        String helloWorld = "HELLOWORLD";
	        char[] seqHello = helloWorld.toCharArray();

	        ArrayList<Character> a = new ArrayList<>();

	        for (int i = 0; i < seqHello.length; i++) {
	            char startLetter = 'A';
	            char restartLetter = seqHello[i];
	            char currentLetter = startLetter;

	            while (currentLetter <= 'Z') {
	                for (char b : a) {
	                    System.out.print(b);
	                }
	                System.out.println(currentLetter);
	                currentLetter++;
	                
                    try {
                        Thread.sleep(50); // Sleep for 500 milliseconds (0.5 seconds)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


	                if (currentLetter > 'Z') {
	                    currentLetter = 'A'; // Restart at 'A'
	                }

	                if (currentLetter == restartLetter) {
	                    for (char b : a) {
	                        System.out.print(b);
	                    }
	                    System.out.println(currentLetter);
	                    a.add(currentLetter);
	                    
	                    
	                    try {
	                        Thread.sleep(50); // Sleep for 500 milliseconds (0.5 seconds)
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }


	                    break; // Exit the loop when the restart letter is reached
	                }
	            }
	        }
	    }
	}
