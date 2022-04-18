package je.panse.doro.comm.item_execute;

import java.io.BufferedWriter;	
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New8ACC;
import je.panse.doro.main.Enter;

public class CalcACC {
    public static void main(String skeys) throws Exception{
    	File_cdrw_proc fcp1 = new File_cdrw_proc();
       Scanner scanner=new Scanner(System.in);
       while (true) {
            System.out.println("Insert disease code : ");
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
		switch (dcode) {
			case "d" : aI("\t#  DM without complications	");break;
					case "dr" : aI("\t#  DM without Retinopathy ");break;
						case "drnp" : aI("\t#  DM with Retinopathy \n\t: Non-proliferative diabetic retinopathy");break;
						case "drp" : aI("\t#  DM with Retinopathy \n\t: Proliferative diabetic retinopathy");break;
					case "dn" : aI("\t#  DM with Nephropathy");break;
						case "dnm" : aI("\t#  DM with Nephropathy with microalbuminuria");break;
						case "dnp" : aI("\t#  DM with Nephropathy with proteinuria");break;
						case "dnc" : aI("\t#  DM with Nephropathywith CRF");break;
					case "dp" : aI("\t#  DM with Peripheral Neuropathy");break;
					case "da" : aI("\t#  DM with Autonomic Neuropathy");break;
					case "pd" : aI("\t#  Prediabetes");break;
					
			case "t" : aI("\t#  Hypertension ")	;break;
			case "c" : aI("\t#  Hypercholesterolemia ");break;
			case "ctg" : aI("\t#  HyperTriGlyceridemia ");break;
	
			case "te" : aI("\t#  Hyperthyroidism : Graves' disease");break;
				case "to" : aI("\t#  Hypothyroidism : Hashimoto's thyroiditis");break;
				case "ts" : aI("\t#  Subacute Thyroiditis ");break;
				case "tt" : aI("\t#  c/w Chronic Thyroiditis on USG");break;
				case "tn" : aI("\t#  Thyroid nodule ")	;break;
				case "tc" : aI("\t#  Thyroid cyst ")	;break;
				case "tsg" : aI("\t#  Simple Goiter")	;break;
				case "nti" : aI("\t#  Non-Thyroidal Illness ");break;
				case "tep" : aI("\t#  Hyperthyroidism with Pregnancy ");break;
				case "top" : aI("\t#  Hypothyroidism with Pregnancy ");break;
				case "tco" : aI("\t#  Papillary Thyroid Cancer OP(+)"
						+ "\n\tHypothyroidism");break;
				case "tcr" : aI("\t#  Papillary Thyroid Cancer OP(+)  RAI Tx(+)"
						+ "\n\tHypothyroidism");break;

			case "sos" : aI("\t#  Severe Osteoporosis ");break;
				case "os" : aI("\t#  Osteoporosis ");break;
				case "ospe" : aI("\t#  Osteopenia ");break;
			
			case "at": aI("\t#  Atypical Chest pain");break;
				case "ap" : aI("\t#  Angina Pectoris");break;
				case "ami": aI("\t#  s/p Aute Myocardial Infaction ");break;
				case "as": aI("\t#  Artherosclerosis Carotid artery");break;
				case "af" : aI("\t#  Atrial Fibrillation ");break;
				case "pvc" : aI("\t#  Premature Ventricular Contractions");break;
				case "apc" : aI("\t#  atrial premature complexes");break;
				
			case "ge": aI("\t#  Epigastric Pain");break;
				case "gre": aI("\t#  Reflux esophagitis");break;
				case "gcag": aI("\t#  Chonic Atrophic Gastritis");break;
				case "gcsg": aI("\t#  Chronic Superficial Gastritis");break;
				case "gceg": aI("\t#  r/o Chronic Erosive Gastritis");break;
				case "gibs": aI("\t#  r/o Irritable Bowel Syndrome3");break;

				case "cp": aI("\t#  Colonic Polyp");break;
				case "cd": aI("\t#  Colonic diverticulum");break;
				case "gp": aI("\t#  GB polyp");break;
				case "ggp": aI("\t#  Gastric Polyp");break;

			
			// ----------------------------------------------진료 보조
			case "cod" : aI("\t#  Cognitive Disorder");break;
	
			case "oc" : aI("\t#  s/p Cholecystectomy d/t GB stone	");break;
				case "oa" : aI("\t#  s/p Appendectomy ");break;
				case "oh" : aI("\t#  s/p TAH : Total Abdominal Hysterectomy ");break;	
				case "bph" : aI("\t#  BPH ");break;
				case "opc" : aI("\t#  Prostate cancer operation(+)");break;

	   		case "hbv" :aI("\t#  HBsAg(+) Carrier ");break;
		   		case "hh" : aI("\t#  Hepatic Hemagioma");break;
		   		case "hc" : aI("\t#  Hepatic Cyst ");break;
				case "hn" : aI("\t#  Hepatic Nodule ");break;
				case "hf" : aI("\t#  Fatty Liver");break;
					case "hfmi" : aI("\t#  Mild Fatty Liver");break;
					case "hfmo" : aI("\t#  Moderate Fatty Liver");break;
					case "hfse" : aI("\t#  Severe Fatty Liver");break;
			
			case "rc" : aI("\t#  Renal Cyst ");break;
				case "rs" : aI("\t#  Renal Stone ");break;
				case "rn" : aI("\t#  Renal Nodule ");break;
				case "rh" : aI("\t#  isolated hematuria ");break;
				case "rhg" : aI("\t#  gross hematuria ");break;
				case "rip" : aI("\t#  isolated proteinuria");break;
			
			case "bc" : aI("\t#  Breast Cyst ");break;
				case "bn" : aI("\t#  Breast Nodule ");break;
				case "bnb" : aI("\t#  Breast Nodule with biopsy ");break;
				case "bco" : aI("\t#  s/p Breast Cancer Operation");break;

			case "ins": aI("\t#  Insomnia");break;
				case "cov": aI("\t#  COVID-19 PCR (+)");break;
				case "ver": aI("\t#  Vertigo");break;
				case "hd": aI("\t#  Headache");break;
				case "ida": aI("\t#  Iron Deficiency Anemia");break;
				case "uti": aI("\t#  Urinary Tract Infection");break;
				case "uri": aI("\t#  Upper Respiratory Infection");break;
			// ----------------------------------------------이찬주원장님
			case "pa" : aI("\t#  s/p Bronchial Asthma ");break;
				case "pc" : aI("\t#  Chronic Cough ");break;
				case "pp" : aI("\t#  Pneumonia ");break;
				case "pn" : aI("\t#  s/p Pulmonary Nodule");break;
				case "pt" : aI("\t#  s/p Pulmonary Tuberculosis ");break;
				case "ntm" : aI("\t#  NTM : Nontuberculous Mycobacterial Pulmonary Disease ");break;
          
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
	   static void aI(String diaease_description) throws IOException {
				try {
					System.out.println(diaease_description);
					writecoding(diaease_description);
				} catch (IOException e) {
					e.printStackTrace();
			}
}
//------------------------------------------------
}
