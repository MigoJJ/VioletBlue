package je.panse.doro.comm.item_execute.souslab7;

import java.util.Scanner;

import add_strings.CurrentDateAdd_date;
import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.key.Key_Iwbb;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class CalcDEXA {
	public void main(String skeys) throws Exception {
		System.out.println("skeys   :  " + skeys);

		System.out.print("Enter  >>   Age...Gender... : ");
		try(Scanner dexa_scan = new Scanner(System.in)){
			int realage = dexa_scan.nextInt();
			String gender_val = dexa_scan.next();
			String fracture_val = "n";
			String menopause_val = "n";
				if  ((gender_val.equals("m") && realage < 50)){
					System.out.println("Insert Z-score : ");
					double zt_score = dexa_scan.nextDouble();
					calc_z(zt_score);
				}
				else if (gender_val.equals("f")){
					System.out.print("Enter  >>   Fracture(y/quit)...Menopause(y/n) : ");
						fracture_val = dexa_scan.next();
						menopause_val = dexa_scan.next();
						if (menopause_val.equals("n")){
							System.out.println("Insert Z-score : ");
							double zt_score = dexa_scan.nextDouble();
							calc_z(zt_score);
						}
						else {
							System.out.println("Insert T-score : ");
							double zt_score = dexa_scan.nextDouble();
							calc_z(zt_score, fracture_val);
						}
				}
				else {
					System.out.println("Insert T-score : ");
					double zt_score = dexa_scan.nextDouble();
					calc_z(zt_score, fracture_val);
				}
				//----------------------------
				
				if (skeys == "Itemcategorykey") {
					File_cdrw_proc cpa1 = new File_cdrw_proc(); 
					cpa1.readfiler(Enter.wtss + "/Menu2ndLine/ItemMenu");
					Itemcategory.main(null);
				}
				else {
					File_cdrw_proc fcp1 = new File_cdrw_proc(); 
					fcp1.readfiler(Enter.wtss + "/6OBJ_List");
					New6OBJ.main(null);
				}
	dexa_scan.close();
	} catch (NumberFormatException e) {
		e.printStackTrace();
		}
//	dexa_scan.close();
	}
	// --------------------------------
	void calc_z(double zt_score) throws Exception {
	     if (zt_score <= -2.0) {
			    print_z(zt_score,"Z-score", "\t# 연령기대치이하 #");}
	     else {print_z(zt_score,"Z-score","\t#  정상   #");}
	}
	// --------------------------------
	void calc_z(double zt_score, String fracture) throws Exception {
	     if(fracture.equals("y") && zt_score <= -2.5) {
			    print_z(zt_score,"T-score","\t# Severe Osteoporosis #");
	     }
	     else if(fracture.equals("n") && zt_score <= -2.5) {
			    print_z(zt_score,"T-score","\t# Osteoporosis #");
	     }
	     else if(zt_score > -2.5  && zt_score <= -1.0) {
	    	     print_z(zt_score,"T_score","\t# Osteopenia #");
	     }
	     else if(zt_score > -1.0) {
			    print_z(zt_score,"T-score","\t# Normal Bone Mineral Density #");
	     }
	     else {
	     }
	}
	// --------------------------------
	void print_z(double zt_score, String zt, String result_z) throws Exception {
		
		    System.out.println("\n\t골밀도 검사 결과   " + zt +  " :  " + zt_score + " 입니다.");
		    
		    System.out.println(result_z);
			String result_zt_score = ("\n\tⓓ DEXA " + zt +  " : [ " + zt_score + " ]");
		    
		    File_cdrw_proc fcp1 = new File_cdrw_proc();
			fcp1.writeliner(Enter.wts + "/6OBJ", result_zt_score);
//			fcp1.writeliner(Enter.wts + "/6OBJ", result_z +"[ " + Add_date.main("d")+" ]");
			fcp1.writeliner(Enter.wts + "/8ASS", result_zt_score);
			fcp1.writeliner(Enter.wts + "/8ASS", result_z +"[ " + CurrentDateAdd_date.main("d")+" ]");
			
	}
// ---------
}