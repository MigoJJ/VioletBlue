package je.panse.doro.comm.item_execute.souslab7;

import java.io.File;
import java.io.IOException;

import je.panse.doro.main.Enter;

public class CalcBP {
	public static void main(String[] args) throws Exception {
		    try {
//		    	File directory = new File(Enter.currentUsersHomeDir + "/ittia1_chart/addjar_ittia5/hito/bp");
		    	
		    	File directory = new File("/home/migoey/ittia1_chart/addjar_ittia5/hito/bp");

		    	
		    	ProcessBuilder builder = new ProcessBuilder("java", "-jar", "Bpmain.jar");
		    	builder.directory(directory);
		    	Process process = builder.start();
		  
		      System.out.println("The other JAR file has completed execution.");
		    } catch (IOException e) {
		      System.out.println("An error occurred while executing the other JAR file.");
		      e.printStackTrace();
		    }
		  }
//---------------------------------------------------		
}