package je.panse.doro.comm.item_execute.souslab7.Proc_CalcBP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_delete_new {
  public static void main(String fhomeDir) {
    try {
    	File file = new File("/home/migoey/ittia1_chart/addjar_ittia5/hito/bp/bpoutput");
    	file.delete();
    	
      FileWriter writer = new FileWriter("/home/migoey/ittia1_chart/addjar_ittia5/hito/bp/bpoutput");
      writer.write("");
      writer.close();
      System.out.println("File created.");
    } catch (IOException e) {
      System.out.println("An error occurred while creating the file.");
      e.printStackTrace();
    }
  }
}
