package je.panse.doro.comm.item_execute.souslab7.Proc_CalcBP;

import java.io.IOException;

public class ExcuteAnotherJar {
  public static void main(String[] args) {
    try {
      Process p = Runtime.getRuntime().exec("java -jar another.jar");
      p.waitFor();
      System.out.println("The other JAR file has completed execution.");
    } catch (IOException | InterruptedException e) {
      System.out.println("An error occurred while executing the other JAR file.");
      e.printStackTrace();
    }
  }
}
