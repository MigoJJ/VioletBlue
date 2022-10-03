package je.panse.doro.hito.newsub;

import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.item_administratus.Key_shortcut;
import je.panse.doro.comm.item_administratus.Run_another_jar;
import je.panse.doro.comm.item_execute.CalcDitto;
import je.panse.doro.comm.item_subexecute.Edcamain;
import je.panse.doro.fourgate.thyroid.prescription.ThyPrescription;

public class New9PLAN {
	public static void main(String args) throws Exception { 
		File_cdrw_proc  ob2 = new File_cdrw_proc();
		CalcDitto       ob3 = new CalcDitto();
		ThyPrescription ob4 = new ThyPrescription(); 
		Key_Iwbb        st999 = new Key_Iwbb();
    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println(">>>-----Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
	
				switch (select_code) {
					case 1 : ob3.main(null);break;
					case 2 : Run_another_jar ob5 = new Run_another_jar();ob5.main(null);break;
					case 3 : New9PLAN.more_description(args);break;

					default :
						System.out.println(" uncertain ... please check  !!");
						Key_shortcut.main(select_code);
					}
				New9PLAN.main(args); break;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}	
	public static void more_description(String args) throws IOException {
		
		String st="JJ";
		System.out.println("*****Enter More description*****  ...   : ");

		do {
		try {
			Scanner suj_text = new Scanner(System.in);
			st = (suj_text.nextLine().trim());
			Edcamain.main(st,"/9PLAN");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} while (!(st == ""));
	}
	
}