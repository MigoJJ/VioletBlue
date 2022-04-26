package je.panse.doro.aeternum.aete;

import java.io.IOException;

public class DiseaseCode {
	public String code_select(String dcode) throws IOException {
	    String cresult = "";
		switch (dcode) {
			case "d" : cresult =("\t#  DM without complications	");break;
				case "dr" : cresult =("\t#  DM without Retinopathy ");break;
					case "drnp" : cresult =("\t#  DM with Retinopathy \n\t: Non-proliferative diabetic retinopathy");break;
					case "drp" : cresult =("\t#  DM with Retinopathy \n\t: Proliferative diabetic retinopathy");break;
				case "dn" : cresult =("\t#  DM with Nephropathy");break;
					case "dnm" : cresult =("\t#  DM with Nephropathy with microalbuminuria");break;
					case "dnp" : cresult =("\t#  DM with Nephropathy with proteinuria");break;
					case "dnc" : cresult =("\t#  DM with Nephropathywith CRF");break;
					case "dp" : cresult =("\t#  DM with Peripheral Neuropathy");break;
					case "da" : cresult =("\t#  DM with Autonomic Neuropathy");break;
					case "pd" : cresult =("\t#  Prediabetes");break;
					
			case "t" : cresult =("\t#  Hypertension ")	;break;
			case "c" : cresult =("\t#  Hypercholesterolemia ");break;
			case "ctg" : cresult =("\t#  HyperTriGlyceridemia ");break;
	
			case "te" : cresult =("\t#  Hyperthyroidism : Graves' disease");break;
				case "to" : cresult =("\t#  Hypothyroidism : Hashimoto's thyroiditis");break;
				case "ts" : cresult =("\t#  Subacute Thyroiditis ");break;
				case "tt" : cresult =("\t#  c/w Chronic Thyroiditis on USG");break;
				case "tn" : cresult =("\t#  Thyroid nodule ")	;break;
				case "tc" : cresult =("\t#  Thyroid cyst ")	;break;
				case "tsg" : cresult =("\t#  Simple Goiter")	;break;
				case "nti" : cresult =("\t#  Non-Thyroidal Illness ");break;
				case "tep" : cresult =("\t#  Hyperthyroidism with Pregnancy ");break;
				case "top" : cresult =("\t#  Hypothyroidism with Pregnancy ");break;
				case "tco" : cresult =("\t#  Papillary Thyroid Cancer OP(+)"
						+ "\n\tHypothyroidism");break;
				case "tcr" : cresult =("\t#  Papillary Thyroid Cancer OP(+)  RAI Tx(+)"
						+ "\n\tHypothyroidism");break;

			case "sos" : cresult =("\t#  Severe Osteoporosis ");break;
				case "os" : cresult =("\t#  Osteoporosis ");break;
				case "ospe" : cresult =("\t#  Osteopenia ");break;
			
			case "at": cresult =("\t#  Atypical Chest pain");break;
				case "ap" : cresult =("\t#  Angina Pectoris");break;
				case "ami": cresult =("\t#  s/p Aute Myocardial Infaction ");break;
				case "as": cresult =("\t#  Artherosclerosis Carotid artery");break;
				case "af" : cresult =("\t#  Atrial Fibrillation ");break;
				case "pvc" : cresult =("\t#  Premature Ventricular Contractions");break;
				case "apc" : cresult =("\t#  atrial premature complexes");break;
				
			case "ge": cresult =("\t#  Epigastric Pain");break;
				case "gre": cresult =("\t#  Reflux esophagitis");break;
				case "gcag": cresult =("\t#  Chonic Atrophic Gastritis");break;
				case "gcsg": cresult =("\t#  Chronic Superficial Gastritis");break;
				case "gceg": cresult =("\t#  r/o Chronic Erosive Gastritis");break;
				case "gibs": cresult =("\t#  r/o Irritable Bowel Syndrome3");break;

				case "cp": cresult =("\t#  Colonic Polyp");break;
				case "cd": cresult =("\t#  Colonic diverticulum");break;
				case "gp": cresult =("\t#  GB polyp");break;
				case "ggp": cresult =("\t#  Gastric Polyp");break;

			
			// ----------------------------------------------진료 보조
			case "cod" : cresult =("\t#  Cognitive Disorder");break;
	
			case "oc" : cresult =("\t#  s/p Cholecystectomy d/t GB stone	");break;
				case "oa" : cresult =("\t#  s/p Appendectomy ");break;
				case "oh" : cresult =("\t#  s/p TAH : Total Abdominal Hysterectomy ");break;	
				case "bph" : cresult =("\t#  BPH ");break;
				case "opc" : cresult =("\t#  Prostate cancer operation(+)");break;

	   		case "hbv" :cresult =("\t#  HBsAg(+) Carrier ");break;
		   		case "hh" : cresult =("\t#  Hepatic Hemagioma");break;
		   		case "hc" : cresult =("\t#  Hepatic Cyst ");break;
				case "hn" : cresult =("\t#  Hepatic Nodule ");break;
				case "hf" : cresult =("\t#  Fatty Liver");break;
					case "hfmi" : cresult =("\t#  Mild Fatty Liver");break;
					case "hfmo" : cresult =("\t#  Moderate Fatty Liver");break;
					case "hfse" : cresult =("\t#  Severe Fatty Liver");break;
			
			case "rc" : cresult =("\t#  Renal Cyst ");break;
				case "rs" : cresult =("\t#  Renal Stone ");break;
				case "rn" : cresult =("\t#  Renal Nodule ");break;
				case "rh" : cresult =("\t#  isolated hematuria ");break;
				case "rhg" : cresult =("\t#  gross hematuria ");break;
				case "rip" : cresult =("\t#  isolated proteinuria");break;
			
			case "bc" : cresult =("\t#  Breast Cyst ");break;
				case "bn" : cresult =("\t#  Breast Nodule ");break;
				case "bnb" : cresult =("\t#  Breast Nodule with biopsy ");break;
				case "bco" : cresult =("\t#  s/p Breast Cancer Operation");break;

			case "ins": cresult =("\t#  Insomnia");break;
				case "cov": cresult =("\t#  COVID-19 PCR (+)");break;
				case "ver": cresult =("\t#  Vertigo");break;
				case "hd": cresult =("\t#  Headache");break;
				case "ida": cresult =("\t#  Iron Deficiency Anemia");break;
				case "uti": cresult =("\t#  Urinary Tract Infection");break;
				case "uri": cresult =("\t#  Upper Respiratory Infection");break;
			// ----------------------------------------------이찬주원장님
			case "pa" : cresult =("\t#  s/p Bronchial Asthma ");break;
				case "pc" : cresult =("\t#  Chronic Cough ");break;
				case "pp" : cresult =("\t#  Pneumonia ");break;
				case "pn" : cresult =("\t#  s/p Pulmonary Nodule");break;
				case "pt" : cresult =("\t#  s/p Pulmonary Tuberculosis ");break;
				case "ntm" : cresult =("\t#  NTM : Nontuberculous Mycobacterial Pulmonary Disease ");break;
          
			default: System.out.println(" ReInsert disease code please ...  : ");break;
		}
		return cresult;
	}
////------------------------------------------------
}
