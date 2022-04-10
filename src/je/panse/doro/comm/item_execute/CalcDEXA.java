package je.panse.doro.comm.item_execute;

import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class CalcDEXA {
	public void main(String skeys) throws Exception {
		System.out.println("skeys   :  " + skeys);
		
		File_cdrw_proc fcp1 = new File_cdrw_proc(); 
		if (skeys == "Itemcategorykey") {
			fcp1.readfiler(Enter.wt + "/singlebeam/ItemMenu");
		}else {
			fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/6OBJ_List");
		}

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

	Key_Iwbb bb1 = new Key_Iwbb();
	bb1.returnkeylist(skeys);
	dexa_scan.close();
	} catch (NumberFormatException e) {
		e.printStackTrace();
		}

//	dexa_scan.close();
	
	}
	// --------------------------------
	void calc_z(double zt_score) throws Exception {
	     if (zt_score <= -2.0) {
			    print_z(zt_score,"Z-score", "    #   연령기대치이하  #");}
	     else {print_z(zt_score,"Z-score","    #   정상   #");}
	}
	// --------------------------------
	void calc_z(double zt_score, String fracture) throws Exception {
	     if(fracture.equals("y") && zt_score <= -2.5) {
			    print_z(zt_score,"T-score","   #    Severe Osteoporosis   #");
	     }
	     else if(zt_score <= -2.5) {
			    print_z(zt_score,"T-score","   #    Osteoporosis   #");
	     }
	     else if(zt_score > -2.5  && zt_score <= -1.0) {
	    	     print_z(zt_score,"T_score","   #    Osteopenia   #");
	     }
	     else if(zt_score > -1.0) {
			    print_z(zt_score,"T-score","   #    Normal Bone Mineral Density   #");
	     }
	     else {
	     }
	}
	// --------------------------------
	void print_z(double zt_score, String zt, String result_z) throws Exception {
		
		    System.out.println("\n   골밀도 검사 결과   " + zt +  " :  " + zt_score + " 입니다.");
		    
		    System.out.println(result_z);
			String result_zt_score = ("\n   골밀도 검사 결과   " + zt +  " :  " + zt_score + " 입니다.");
		    
		    File_cdrw_proc fcp1 = new File_cdrw_proc();
			fcp1.writeliner(Enter.wts + "/6OBJ", result_zt_score);
//			fcp1.writeliner(Enter.wts + "/6OBJ", result_z);
			fcp1.writeliner(Enter.wts + "/8ACC", result_zt_score);
			fcp1.writeliner(Enter.wts + "/8ACC", result_z);
	}
// ---------
}