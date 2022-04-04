package je.panse.doro.comm.item_exec;

import java.io.BufferedWriter;	
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New8ACC;
import je.panse.doro.main.Enter;

public class CalcACC {
    public static void main(String args[]) throws Exception{
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Insert disease code : ");
            String question = scanner.nextLine();
        	code_select(question);
                if(question.equals("quit")){
		            	System.out.println("Inserted code finished  !  ");
		            	Newcategory ob6 = new Newcategory(); 
						ob6.main(null); 	
	            	break;
	            }
        	}
    	System.out.println("Success");
    	scanner.close();
    }
//------------------------------------------------     
	static void code_select(String dcode) throws IOException {
		switch (dcode) {
			case "d" : accessInsert("\t#  DM without complications	");break;
					case "dr" : accessInsert("\t#  DM with Retinopathy ");break;
					case "dn" : accessInsert("\t#  DM with Nephropathy");break;
					case "dp" : accessInsert("\t#  DM with Peripheral Neuropathy");break;
					case "da" : accessInsert("\t#  DM with Autonomic Neuropathy");break;
					case "pd" : accessInsert("\t#  Prediabetes");break;
			case "t" : accessInsert("\t#  Hypertension ")	;break;
			case "c" : accessInsert("\t#  Hypercholesterolemia ");break;
			case "ctg" : accessInsert("\t#  HyperTriGlyceridemia ");break;
	
			case "te" : accessInsert("\t#  Hyperthyroidism : Graves' disease");break;
				case "to" : accessInsert("\t#  Hypothyroidism : Hashimoto's thyroiditis");break;
				case "ts" : accessInsert("\t#  Subacute Thyroiditis ");break;
				case "tn" : accessInsert("\t#  Thyroid nodule ")	;break;
				case "tsg" : accessInsert("\t#  Simple Goiter")	;break;
				case "nti" : accessInsert("\t#  Non-Thyroidal Illness ");break;
				case "tep" : accessInsert("\t#  Hyperthyroidism with Pregnancy ");break;
				case "top" : accessInsert("\t#  Hypothyroidism with Pregnancy ");break;
				case "tc"  : accessInsert("\t#  Papillary Thyroid Cancer OP(+)"
						+ "\n\tHypothyroidism");break;
				case "tcr" : accessInsert("\t#  Papillary Thyroid Cancer OP(+)  RAI Tx(+)"
						+ "\n\tHypothyroidism");break;

			case "os" : accessInsert("\t#  Osteoporosis ");break;
			case "ospe" : accessInsert("\t#  Osteopenia ");break;
			
			case "ap" : accessInsert("\t#  Angina Pectoris");break;
			case "af" : accessInsert("\t#  Atrial Fibrillation ");break;
			case "ami": accessInsert("\t#  s/p Aute Myocardial Infaction ");break;
			case "ins": accessInsert("\t#  Insomnia");break;
			case "ver": accessInsert("\t#  Vertigo");break;

			
			
			// ----------------------------------------------진료 보조
			case "oc" : accessInsert("\t#  s/p Cholecystectomy d/t GB stone	");break;
			case "oa" : accessInsert("\t#  s/p Appendectomy ");break;
			case "oh" : accessInsert("\t#  s/p TAH : Total Abdominal Hysterectomy ");break;	
			case "pb" : accessInsert("\t#  BPH ");break;
			case "pbo" : accessInsert("\t#  Prostate cancer operation(+)");break;

	   		case "hbv" :accessInsert("\t#  HBsAg(+) Carrier ");break;
	   		case "hc" : accessInsert("\t#  Hepatic Cyst ");break;
			case "hn" : accessInsert("\t#  Hepatic Nodule ");break;

			case "rc" : accessInsert("\t#  Renal Cyst ");break;
			case "rn" : accessInsert("\t#  Renal Nodule ");break;
			
			case "bc" : accessInsert("\t#  Breast Cyst ");break;
			case "bn" : accessInsert("\t#  Breast Nodule ");break;
			case "bco" : accessInsert("\t#  s/p Breast Cancer Operation");break;
			// ----------------------------------------------이찬주원장님
			case "pa" : accessInsert("\t#  Bronchial Asthma ");break;
			case "pc" : accessInsert("\t#  Chronic Cough ");break;
			case "pp" : accessInsert("\t#  Pneumonia ");break;
			case "pt" : accessInsert("\t#  s/p Pulmonary Tuberculosis ");break;
			case "nmt" : accessInsert("\t#  NMT Pulmonary Tuberculosis ");break;
          
			default: System.out.println(" ReInsert disease code please ...  : ");break;
		}
		}
//------------------------------------------------ 
	   static void writecoding(String writec) throws IOException {
			File file_acc = new File(Enter.wts + "/8ACC");
			System.out.println(file_acc);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_acc,true));
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
