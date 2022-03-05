package je.panse.doro.comm.pilot;

import java.io.BufferedWriter;	
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.exec.input.DiseaseCode;
import je.panse.doro.exec.input.NewPatientInput;
import je.panse.doro.main.Enter;

public class AccessInput {
    private static String question;

    public static void main(String args[]) throws IOException{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert disease code : ");
        while (true) {
//            System.out.println("Insert disease code : ");
            String question = scanner.nextLine();
        	code_select(question);
                if(question.equals("quit")){
	            	System.out.println("Inserted code finished  !!!.: ");
	            	break;
	            }
//            System.out.println("Insert answer code:");
//            String answer = scanner.nextLine();
//	            
//            	if(answer.equals("quit")){
//	                break;
//	            }
        }
    	System.out.println("Success");
    	scanner.close();
    }
//------------------------------------------------     
	static void code_select(String dcode) throws IOException {
		switch (dcode) {
			case "d" : accessInsert("  #  DM without complications	");break;
					case "dr" : accessInsert("  #  DM with Retinopathy ");break;
					case "dn" : accessInsert("  #  DM with Nephropathy");break;
					case "dp" : accessInsert("  #  DM with Peripheral Neuropathy");break;
					case "da" : accessInsert("  #  DM with Autonomic Neuropathy");break;
					
			case "t" : accessInsert("  #  Hypertension ")	;break;	
			case "c" : accessInsert("  #  Hypercholesterolemia ");break;
			
			case "te" : accessInsert("  #  Hyperthyroidism : Graves' disease")	;break;
			case "to" : accessInsert("  #  Hypothyroidism : Hashimoto's thyroiditis")	;break;
			case "ts" : accessInsert("  #  Subacute Thyroiditis ")		;break;
			case "tn" : accessInsert("  #  Thyroid nodule ")		;break;
			case "tep" : accessInsert("  #  Hyperthyroidism with Pregnancy ")		;break;
			case "top" : accessInsert("  #  Hypothyroidism with Pregnancy ")		;break;
			
			case "os" : accessInsert("  #  Osteoporosis ");break;
			
			// ----------------------------------------------진료 보조
			case "oc" : accessInsert("  #  Cholecystectomy d/t GB stone	")		;break;
			case "oa" : accessInsert("  #  Appendectomy ")		;break;
			case "oh" : accessInsert("  #  TAH : Total Abdominal Hysterectomy ")		;break;			
				
			case "hf" : accessInsert("  #  Fatty Liver ")		;break;
			case "hc" : accessInsert("  #  Hepatic Cyst ")		;break;
			case "hn" : accessInsert("  #  Hepatic Nodule ")		;break;
			
			case "rc" : accessInsert("  #  Renal Cyst ")		;break;
			case "rn" : accessInsert("  #  Renal Nodule ")	;break;
			
			case "bc" : accessInsert("  #  Breast Cyst ")		;break;
			case "bn" : accessInsert("  #  Breast Nodule ")	;break;
			// ----------------------------------------------이찬주원장님
			case "pa" : accessInsert("  #  Bronchial Asthma ")	;break;
			case "pc" : accessInsert("  #  Chronic Cough ")	;break;
			case "pp" : accessInsert("  #  Pneumonia ")	;break;
			case "pt" : accessInsert("  #  Pulmonary Tuberculosis ")	;break;
		}
		}
//------------------------------------------------ 
	   static void writecoding(String writec) throws IOException {
//		   checkfiler(Enter.wd + "/comm/pilot/chart_access");
			File file = new File(Enter.wd + "/comm/pilot/chart_access");
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
				try {
					bufferedWriter.write(writec);
				} catch (IOException e) {
					e.printStackTrace();
			}
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close();
}
//------------------------------------------------
	   static void accessInsert(String diaease_description) throws IOException {
				try {
					System.out.println(diaease_description);
					writecoding(diaease_description);
				} catch (IOException e) {
					e.printStackTrace();
			}
}
//------------------------------------------------
}