package je.panse.doro.comm.item_excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.main.Enter;

public class LmDeux {

	public static void main(String[] args) throws IOException {
		String s = LmDeux.readfiler(Enter.wd + "/text/samsara/7LAB");
		System.out.println(s.trim());
		String	delims = "[.....................................]+";
		String[] tokens = s.split(delims);

		for (int i = 0; i < tokens.length; i++) {
		    System.out.println(tokens[i]);
 			File_cdrw_proc fcp1 = new File_cdrw_proc();
//			fcp1.writeliner(Enter.wts + "/7LAB", "\n\t" + tokens[i]);
			fcp1.writeliner(Enter.wts + "/7LAB", "\t" + tokens[i]);
		}
	}
	public static String readfiler(String readf) {
		String finalString="";
		try{
			File textDirName = new File(readf); 
				Scanner myReader = new Scanner(textDirName);
				StringBuilder stringBuilder = new StringBuilder();
				while (myReader.hasNextLine()) {
						String data = myReader.nextLine().trim();
						stringBuilder.append(data);
				}
				finalString = stringBuilder.toString();
				System.out.println(finalString);
	       myReader.close();
		}catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return finalString;
    }
}
