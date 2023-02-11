package je.panse.doro.comm.item_execute.souslab7;

import java.io.IOException;

public class CalcBP {
	public static void main(String[] args) throws Exception {
		    try {
		      Process p = Runtime.getRuntime().exec("/home/migowj/ittia1_chart/addjar_ittia5/hito/bp java -jar bp_vitalsign.jar");
		      p.waitFor();
		      System.out.println("The other JAR file has completed execution.");
		    } catch (IOException | InterruptedException e) {
		      System.out.println("An error occurred while executing the other JAR file.");
		      e.printStackTrace();
		    }
		  }
//---------------------------------------------------		
}