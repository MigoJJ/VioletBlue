package je.panse.doro.comm.item_execute;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;	
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class CalcDitto2 {
	int dittomo, labfu, dosead;
	String dittomol, labful, doseadl; 
	public void main(String skeys) throws Exception {
		File_cdrw_proc fcp1 = new File_cdrw_proc(); 
		try (Scanner input = new Scanner(System.in)) {
			System.out.print(".....>>>>> Input ditto month : ");
			dittomo = input.nextInt();
			dittomol = ("\t...OPD F/U x [  " + dittomo +  "  ]-month later");
			
			System.out.print(".....>>>>> Lab Follow-up will be needed ? :");
			labfu = input.nextInt();
			String[] a = list_select(labfu);         //obtain the array  
			for (int i = 0; i < a.length; i++) {//for loop to print the array  
				System.out.println( a[i]+ "  ");
				}
			
			ArrayList<String> sympt = new ArrayList<>(Arrays.asList(a));
			//		System.out.println(sympt.toString());
			System.out.println("\n>>>>>>>>> inset the number >>>>>>>>>> ");

			for (int i = 0; i < sympt.size(); i++) {
				int ii=i+1;
				System.out.print( "\n\t"+ii+" ☐ " + sympt.get(i)+"\n");
				}
			String inputNo;
			//		while(sc.hasNextLine() && !(input = sc.nextLine()).equals("")) {
			try(Scanner sc = new Scanner(System.in)) {
			   	
				while(!(inputNo = sc.nextLine()).equals("")) {
					System.out.println("\n........... inset the number ...> ");
					int number = (Integer.parseInt(inputNo)-1);
					if (number < sympt.size()) {
						String s = sympt.get(number);
						sympt.set(number,s);	
						for (int i = 0; i < sympt.size(); i++) {
							 if (i!=number) {
								 System.out.print( " " + "√  " + sympt.get(i)+"\n");
								 String slschoice = ("√ " + sympt.get(i));
//								 writeliner(Enter.wts + "/5SUJ", slschoice);
								 writeliner(Enter.wts + "/9PLAN", sympt.get(i)+"\n");
								 }
							 }
						}
					}//-----if
				}
				fcp1.readfiler(Enter.wt + "/singlebeam/ChartPopUpMenu");
				Newcategory nc1 = new Newcategory();
				nc1.main(null);	
			
				System.out.print(".....>>>>> Dose Adjust ? : ");
				dosead = input.nextInt();

				if (dosead == 0) { doseadl = ("\t...no medication change or dose-adjust");}
				else if (dosead == 5) { doseadl = ("\t...New Starting Medication :");}
				else if (dosead == 55) { doseadl = ("\t...Discontinue Medication :");}
				else if (dosead == 6) { doseadl = ("\t...Continue Medication");}
				else if (dosead == 2) { doseadl = ("\t...dose-down");}
				else if (dosead == 8) { doseadl = ("\t...dose-up");}
				else if (dosead == 4) { doseadl = ("\t...예전 약으로");}
				else {
			    }
				fcp1.writeliner(Enter.wts + "/9PLAN", dittomol);
				fcp1.writeliner(Enter.wts + "/9PLAN", labful);
				fcp1.writeliner(Enter.wts + "/9PLAN", doseadl);
				File_cw_chart dn1 = new File_cw_chart();
					dn1.deuxnine();	
					if (skeys == "Itemcategorykey") {
						fcp1.readfiler(Enter.wt + "/singlebeam/ItemMenu");
						Itemcategory.main(null);
					}
					else {
						fcp1.readfiler(Enter.wt + "/singlebeam/ChartPopUpMenu");
						nc1.main(null);
					}
		
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}
	        //        input.close();
			}
	
	static String[] list_select(int dlist) throws Exception {

		switch (dlist) {
			case 1 : 		String[] arr = {
								"...Observation and Follow-up",
								"...Follow-up without medication\n",
								"...next Lab F/U... ",
								"...next 공단검진...",
								"...next 지디스검진..."
								};
				return arr; 
	   		case 9 : case 99: case 999 :	
	   			Key_Iwbb st999 = new Key_Iwbb(); 
	   			st999.Key_Iwbb_Page(dlist); break;
			default :
				System.out.println(" uncertain ... please check  !!");
		}
		return null;
	}
	
	static void writeliner(String writef, String fts) throws IOException {
		    try {
		      FileWriter myWriter = new FileWriter(writef, true);
//		      myWriter.write("\t"+fts+"\r");
		      myWriter.write("\t"+fts);
		      myWriter.close();
			  System.out.println("   ...Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		}
//---------------------------------------------------		
}