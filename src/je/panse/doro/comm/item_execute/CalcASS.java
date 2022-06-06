package je.panse.doro.comm.item_execute;
	
import java.io.BufferedWriter;		
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.aeternum.aete.DiseaseCode;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class CalcASS {
    public static void main(String skeys) throws Exception{
    	File_cdrw_proc fcp1 = new File_cdrw_proc();
    	Scanner scanner=new Scanner(System.in);
    	while (true) {
            System.out.println("Insert disease code : >>>>>>>>>>");
            String question = scanner.nextLine();
        	code_select(question);
                if(question.equals("quit")|question.equals("q")| question.equals("ㅂ")){
		            	System.out.println("Inserted code finished  !  ");
						if (skeys == "Itemcategorykey") {
							fcp1.readfiler(Enter.wt + "/singlebeam/ItemMenu");
							Itemcategory.main(null);
						}
						else {
							fcp1.readfiler(Enter.wt + "/singlebeam/ChartPopUpMenu");
							Newcategory nc1 = new Newcategory();
							nc1.main(null);
						}
	            	break;
	            }
        	}
    	System.out.println("Success");
    	scanner.close();
    }
//------------------------------------------------     
    static void code_select(String dcode) throws IOException {
		DiseaseCode e =new DiseaseCode();  
//		   System.out.println(e.code_select(dcode));  
		   aI(e.code_select(dcode));  
	}
//------------------------------------------------ 
    static void aI(String diaease_description) throws IOException {
				try {
					System.out.println(diaease_description);
					writecoding(diaease_description);
				} catch (IOException e) {
					e.printStackTrace();
			}
    }
//------------------------------------------------
    static void writecoding(String writec) throws IOException {
			File file_ass = new File(Enter.wts + "/8ASS");
			System.out.println(file_ass);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_ass,true));
				try {
					bufferedWriter.write("\t" + writec);
				} catch (IOException e) {
					e.printStackTrace();
			}
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close();
    }
//------------------------------------------------
}
