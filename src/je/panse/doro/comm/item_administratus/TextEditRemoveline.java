package je.panse.doro.comm.item_administratus;


import java.io.*;
import java.util.Scanner;

public class TextEditRemoveline {
	public static void main(String[] args) {
		        Scanner file;
		        PrintWriter writer;
		        try {
		            file = new Scanner(new File("/home/migoey/git/VioletBlue/src/je/panse/doro/text/samsara/ChartPlate"));
		            writer = new PrintWriter("/home/migoey/git/VioletBlue/src/je/panse/doro/text/samsara/ChartPlate.tmp");

		            while (file.hasNext()) {
		                String line = file.nextLine().trim();
		                if (!line.isEmpty()) {
		                    writer.write(line);
		                    writer.write("\n");
		                }
		            }
		            file.close();
		            writer.close();
		            
		            File file1 = new File("/home/migoey/git/VioletBlue/src/je/panse/doro/text/samsara/ChartPlate");
		            File file2 = new File("/home/migoey/git/VioletBlue/src/je/panse/doro/text/samsara/ChartPlate.tmp");

		            file1.delete();
		            file2.renameTo(file1);

		        } catch (FileNotFoundException ex) {
//		            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
		        }
		}
}
