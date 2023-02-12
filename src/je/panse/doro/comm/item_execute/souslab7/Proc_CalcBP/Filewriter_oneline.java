package je.panse.doro.comm.item_execute.souslab7.Proc_CalcBP;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import je.panse.doro.main.Enter;

public class Filewriter_oneline {
  public static void main(String str) {
    try {
      FileWriter writer = new FileWriter(Enter.udbu5 +"/hito/bp/bpoutput",true);
      writer.write(str+"\n");
      writer.close();
      System.out.println("String written to file.");
      Filewriter_oneline.read_write_file(null);
    } catch (IOException e) {
      System.out.println("An error occurred while writing to file.");
      e.printStackTrace();
    }
  }
    public static void read_write_file(String[] args) {
      try {
        FileReader reader = new FileReader(Enter.udbu5 +"/hito/bp/bpoutput");
        FileWriter writer = new FileWriter(Enter.wd +"/text/samsara/6OBJ");

        int c;
        while ((c = reader.read()) != -1) {
          writer.write(c);
        }

        reader.close();
        writer.close();

        System.out.println("File copied.");
      } catch (IOException e) {
        System.out.println("An error occurred while copying the file.");
        e.printStackTrace();
      }
    }
  }

