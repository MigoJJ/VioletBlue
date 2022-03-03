package je.panse.doro.comm;

import java.io.BufferedWriter;	
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import je.panse.doro.main.Enter;

public class ManageFileAppend {
	   public static void main(String writef) throws IOException {
			File file = new File(Enter.wcf);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
				try {
					bufferedWriter.write(writef);
				} catch (IOException e) {
					e.printStackTrace();
			}
			bufferedWriter.flush();
			bufferedWriter.close();
   }
// -----------------------------------------------------------
}