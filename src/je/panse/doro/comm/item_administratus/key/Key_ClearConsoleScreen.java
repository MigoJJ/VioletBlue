package je.panse.doro.comm.item_administratus.key;

import java.io.IOException;		

public class Key_ClearConsoleScreen {
    public  static void main (String [] args){
    	for(int i = 0; i < 15; i++) // Default Height of cmd is 300 and Default width is 80
    	    System.out.print("\n"); // Prints a backspace
    }
}