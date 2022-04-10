package je.panse.doro.comm.item_execute;

import java.io.BufferedWriter;	
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;			
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class CalcCPA {
	public void main(String skeys) throws Exception { 
		File_cdrw_proc ekg1 = new File_cdrw_proc(); 
		if (skeys == "Itemcategorykey") {
			ekg1.readfiler(Enter.wt + "/singlebeam/ItemMenu");
		}else {
			ekg1.readfiler(Enter.wt + "/singlebeam/subnewmenu/6OBJs/CPAj");
		}
		
		System.out.println(ekg1);

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println("Enter selected CPA code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
	
				switch (select_code) {
					case 1 : accessInsert("정상 (No Active lesions inLung)"); break;
					case 2 : accessInsert("폐결핵 흔적 (Pulmonary tuberculosis scar)"); break;


					case 9 : File_cw_chart dn1 = new File_cw_chart();
							dn1.deuxnine();	break;
					default :System.out.println(" uncertain ... please check  !!");
				}
				Key_Iwbb bb1 = new Key_Iwbb();
				bb1.returnkeylist(skeys);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}	
	//------------------------------------------------
	void writecoding(String writec) throws IOException {
			File file_acc = new File(Enter.wts + "/6OBJ");
			System.out.println(file_acc);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_acc,true));
				try {
					bufferedWriter.write("    Chest PA  : " + writec);
				} catch (IOException e) {
					e.printStackTrace();
			}
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close();
}
//------------------------------------------------
   void accessInsert(String EKG_code) throws IOException {
				try {
					System.out.println(EKG_code);
					writecoding(EKG_code);
				} catch (IOException e) {
					e.printStackTrace();
			}
}
// ----------
}