package je.panse.doro.fourgate.thyroid.prescription;

import java.io.File;				
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

import je.panse.doro.comm.item_administratus.Menu_list;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.file.File_editor_proc;
import je.panse.doro.comm.item_administratus.key.Key_shortcut;
import je.panse.doro.comm.item_execute.souslab7.CalcBP;
import je.panse.doro.comm.item_execute.souslab7.CalcTFT;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class ThyPrescription {
	public void main(String presd) throws Exception {
		File_cdrw_proc   tp1 = new File_cdrw_proc();
		File_editor_proc tp2 = new File_editor_proc();
//		tp1.readfiler(Enter.wd +"/fourgate/thyroid/" + presd);
		
		Path path = Paths.get(Enter.wd +"/fourgate/thyroid/text/prescriptlist");
		String pathf = (Enter.wd +"/fourgate/thyroid/text/prescriptlist");

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (select_code != 9) {
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
	
				switch (select_code) {


					case 1 : Menu_list.main(Enter.wd + "/fourgate/thyroid/text/thyroidfindins/DescribeThyroid");
						;break;

					case 2 : CalcTFT   	nl3 = new CalcTFT(); 	nl3.main("diseasecategorythyroid");break;

					case 51  : tp2.linepickup(path + "/ThySyrPx", Enter.wts+ "/9PLAN" );break;
					case 52  : tp2.linepickup(path + "/ThySyxPx", Enter.wts+ "/9PLAN" );break;
					case 53  : tp2.linepickup(path + "/ThyMetPx", Enter.wts+ "/9PLAN" );break;
					case 54  : tp2.linepickup(path + "/ThyAntPx", Enter.wts+ "/9PLAN" );break;
					case 55  : tp2.linepickup(path + "/ThyCamenPx", Enter.wts+ "/9PLAN" );break;
					case 56  : tp2.linepickup(path + "/ThyIndPx", Enter.wts+ "/9PLAN" );break;

					default :System.out.println(" uncertain ... please check  !!");
					Key_shortcut.main(select_code);
					}
				}
			}
	}
	// ----------	
	void tfiler(String readf) {
		try{
			File textDirName = new File(readf); 
			Scanner myReader = new Scanner(textDirName);
			int i=0;	
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				i++;
				System.out.print(".[ " + i + " ]..");
				System.out.println(data);
			}
	       myReader.close();
	       
		}catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
    }
	       
	void selectfiler(Path rrr) throws IOException {
			Stream<String> lBl = Files.lines(rrr);
			Scanner myPx = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter Px number : ");
			String choicePx = myPx.nextLine();  // Read user input
			System.out.println("Px number is : " + choicePx);  // Output user input
			
			int choicePxi = Integer.parseInt(choicePx);
			String nthPx = lBl.skip(choicePxi -1).findFirst().get();
			System.out.println(nthPx);
			
			File_cdrw_proc tp2 = new File_cdrw_proc();
			String nthPx1 = ("    ..." + nthPx);
			tp2.writeliner(Enter.wt + "/samsara/9PLAN", nthPx1);	
	       

    }
// ----------	
}