package je.panse.doro.comm;

import java.io.BufferedReader;	
import java.io.IOException;
import java.io.InputStreamReader;

public class Key_Press_Any {
	public static void main(String args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Press enter to continue......");
		try {  
			input.readLine();  
		} 
		catch (Exception e) { 
			e.printStackTrace();
		}
	}
// ----------
}