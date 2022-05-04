package je.panse.doro.aeternum.aete;

import java.io.IOException;

public class DiseaseCode {
	public String code_select(String dcode) throws IOException {
	    String cresult = "";
		switch (dcode) {
			case "d" : cresult =("#  DM without complications	");break;
				case "dr" : cresult =("#  DM without Retinopathy ");break;
					case "drnp" : cresult =("#  DM with Retinopathy \n\t: Non-proliferative diabetic retinopathy");break;
					case "drp" : cresult =("#  DM with Retinopathy \n\t: Proliferative diabetic retinopathy");break;
				case "dn" : cresult =("#  DM with Nephropathy");break;
					case "dnm" : cresult =("#  DM with Nephropathy with microalbuminuria");break;
					case "dnp" : cresult =("#  DM with Nephropathy with proteinuria");break;
					case "dnc" : cresult =("#  DM with Nephropathywith CRF");break;
					case "dp" : cresult =("#  DM with Peripheral Neuropathy");break;
					case "da" : cresult =("#  DM with Autonomic Neuropathy");break;
					case "pd" : cresult =("#  Prediabetes");break;
					
			case "t" : cresult =("#  Hypertension ")	;break;
			case "c" : cresult =("#  Hypercholesterolemia ");break;
			case "ctg" : cresult =("#  HyperTriGlyceridemia ");break;
	
			case "te" : cresult =("#  Hyperthyroidism : Graves' disease");break;
				case "to" : cresult =("#  Hypothyroidism : Hashimoto's thyroiditis");break;
				case "ts" : cresult =("#  Subacute Thyroiditis ");break;
				case "tt" : cresult =("#  c/w Chronic Thyroiditis on USG");break;
				case "tn" : cresult =("#  Thyroid nodule ")	;break;
				case "tc" : cresult =("#  Thyroid cyst ")	;break;
				case "tsg" : cresult =("#  Simple Goiter")	;break;
				case "nti" : cresult =("#  Non-Thyroidal Illness ");break;
				case "tep" : cresult =("#  Hyperthyroidism with Pregnancy ");break;
				case "top" : cresult =("#  Hypothyroidism with Pregnancy ");break;
				case "tco" : cresult =("#  Papillary Thyroid Cancer OP(+)"
						+ "\n\tHypothyroidism");break;
				case "tcr" : cresult =("#  Papillary Thyroid Cancer OP(+)  RAI Tx(+)"
						+ "\n\tHypothyroidism");break;

			case "sos" : cresult =("#  Severe Osteoporosis ");break;
				case "os" : cresult =("#  Osteoporosis ");break;
				case "ospe" : cresult =("#  Osteopenia ");break;
			
			case "at": cresult =("#  Atypical Chest pain");break;
				case "ap" : cresult =("#  Angina Pectoris");break;
				case "ami": cresult =("#  s/p Aute Myocardial Infaction ");break;
				case "as": cresult =("#  Artherosclerosis Carotid artery");break;
				case "af" : cresult =("#  Atrial Fibrillation ");break;
				case "pvc" : cresult =("#  Premature Ventricular Contractions");break;
				case "apc" : cresult =("#  atrial premature complexes");break;
				
			case "ge": cresult =("#  Epigastric Pain");break;
				case "gre": cresult =("#  Reflux esophagitis");break;
				case "gcag": cresult =("#  Chonic Atrophic Gastritis");break;
				case "gcsg": cresult =("#  Chronic Superficial Gastritis");break;
				case "gceg": cresult =("#  r/o Chronic Erosive Gastritis");break;
				case "gibs": cresult =("#  r/o Irritable Bowel Syndrome3");break;

				case "cp": cresult =("#  Colonic Polyp");break;
				case "cd": cresult =("#  Colonic diverticulum");break;
				case "gp": cresult =("#  GB polyp");break;
				case "ggp": cresult =("#  Gastric Polyp");break;

			
			// ----------------------------------------------진료 보조
			case "cod" : cresult =("#  Cognitive Disorder");break;
	
			case "oc" : cresult =("#  s/p Cholecystectomy d/t GB stone	");break;
				case "oa" : cresult =("#  s/p Appendectomy ");break;
				case "oh" : cresult =("#  s/p TAH : Total Abdominal Hysterectomy ");break;	
				case "bph" : cresult =("#  BPH ");break;
				case "opc" : cresult =("#  Prostate cancer operation(+)");break;

	   		case "hbv" :cresult =("#  HBsAg(+) Carrier ");break;
		   		case "hh" : cresult =("#  Hepatic Hemagioma");break;
		   		case "hc" : cresult =("#  Hepatic Cyst ");break;
				case "hn" : cresult =("#  Hepatic Nodule ");break;
				case "hf" : cresult =("#  Fatty Liver");break;
					case "hfmi" : cresult =("#  Mild Fatty Liver");break;
					case "hfmo" : cresult =("#  Moderate Fatty Liver");break;
					case "hfse" : cresult =("#  Severe Fatty Liver");break;
			
			case "rc" : cresult =("#  Renal Cyst ");break;
				case "rs" : cresult =("#  Renal Stone ");break;
				case "rn" : cresult =("#  Renal Nodule ");break;
				case "rh" : cresult =("#  isolated hematuria ");break;
				case "rhg" : cresult =("#  gross hematuria ");break;
				case "rip" : cresult =("#  isolated proteinuria");break;
			
			case "bc" : cresult =("#  Breast Cyst ");break;
				case "bn" : cresult =("#  Breast Nodule ");break;
				case "bnb" : cresult =("#  Breast Nodule with biopsy ");break;
				case "bco" : cresult =("#  s/p Breast Cancer Operation");break;

			case "ins": cresult =("#  Insomnia");break;
				case "cov": cresult =("#  COVID-19 PCR (+)");break;
				case "ver": cresult =("#  Vertigo");break;
				case "hea": cresult =("#  Headache");break;
				case "ida": cresult =("#  Iron Deficiency Anemia");break;
				case "uti": cresult =("#  Urinary Tract Infection");break;
				case "uri": cresult =("#  Upper Respiratory Infection");break;
				case "gou": cresult =("#  Gout");break;

			// ----------------------------------------------이찬주원장님
			case "pa" : cresult =("#  s/p Bronchial Asthma ");break;
				case "pc" : cresult =("#  Chronic Cough ");break;
				case "pp" : cresult =("#  Pneumonia ");break;
				case "pn" : cresult =("#  s/p Pulmonary Nodule");break;
				case "pt" : cresult =("#  s/p Pulmonary Tuberculosis ");break;
				case "ntm" : cresult =("#  NTM : Nontuberculous Mycobacterial Pulmonary Disease ");break;
          
			default: System.out.println(" ReInsert disease code please ...  : ");break;
		}
		return cresult;
	}
////------------------------------------------------
}
