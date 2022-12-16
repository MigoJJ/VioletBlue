package je.panse.doro.comm.item_administratus.file;

import java.io.*;			
import java.util.Scanner;
import je.panse.doro.main.Enter;

public class File_TextEditRemoveline {
	final static String chartplate = (Enter.wd + "/text/samsara/ChartPlate");
	final static String chartemp = (Enter.wd + "/text/samsara/ChartPlate.tmp");
	
	public static void main(String[] args) throws IOException {
		File_TextEditRemoveline.deleteEmptyLine();
		File_TextEditRemoveline.renameFiles();
		File_TextEditRemoveline.deletesopa(chartplate);
	}

	public static void deleteEmptyLine() {
		final String EMPTY_STRING = "";
		Scanner file;
		PrintWriter writer;
		try {
			file = new Scanner(new File(chartplate));
			writer = new PrintWriter(chartemp);
			
			while (file.hasNext()) {
//		                String line = file.nextLine().trim();
				String line = file.nextLine();
				String line1 =line.replaceAll("\\s+$", "");
				if (!line1.isEmpty()) {
				    writer.write(line1);
				    writer.write("\n");
				}
			}
			file.close();
			writer.close();
		} catch (FileNotFoundException ex) {
//		            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	public static void renameFiles() {
		File file1 = new File(chartplate);
		File file2 = new File(chartemp);
		file1.delete();
		file2.renameTo(file1);
	}
	public static void deletesopa(String readf) throws IOException {
		try{
			File textDirName = new File(readf); 
			Scanner myReader = new Scanner(textDirName);
			String adata = "";
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				adata = adata.concat(data);
					adata = adata.replace("C.C.>\nS >", "\nS >");
					adata = adata.replace("S >\nO >", "\nO >");
					adata = adata.replace("O >\nA >", "\nA >");
					adata = adata.replace("A >\nP >", "\nP >");
//					adata = adata.replace("P >", "\n");
					adata = adata+"\n";
					File_cdrw_proc.writeliner(adata,chartemp);
			}					
			System.out.println(adata);
			myReader.close();

			File_TextEditRemoveline.renameFiles();
		
		}catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
}
