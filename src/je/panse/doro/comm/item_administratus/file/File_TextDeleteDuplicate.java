package je.panse.doro.comm.item_administratus.file;

import java.io.*;
import java.util.HashSet;
	
public class File_TextDeleteDuplicate {
	public static void main(String chartplate, String charttemp) throws IOException {
		try ( PrintWriter outout = new PrintWriter(charttemp);
			BufferedReader input = new BufferedReader(new FileReader(chartplate))) {
			String line = input.readLine();
	       HashSet<String> hs = new HashSet<>();
	       while (line != null) {
			   if (hs.add(line)) {
		         outout.println(line);
		       }
		         line = input.readLine();
	       }
	      outout.flush();
		}
		System.out.println("Finished");
	    }
	}	