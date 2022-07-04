package je.panse.doro.comm.item_administratus;

import java.io.IOException;

public class ClearConsoleScreen {
    public  static void main (String [] args){
    	for(int i = 0; i < 30; i++) // Default Height of cmd is 300 and Default width is 80
    	    System.out.print("\n"); // Prints a backspace
    }
}