package je.panse.doro.comm.item_exec;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.StartForm;

public class CalcDEXA {
	public static void main(String[] args) {
		try (Scanner rasc = new Scanner(System.in)) {
			System.out.print("Enter  >>   Age...Gender...Fracture(y/n)...Menopause(y/n) : ");
			Scanner dexa_scan = new Scanner(System.in);
				int realage = dexa_scan.nextInt();
				String gender_val = dexa_scan.next();
				String fracture_val = dexa_scan.next();
				String menopause_val = dexa_scan.next();
		      
			if  ((gender_val.equals("m") && realage < 50) | 	menopause_val.equals("n")){
				System.out.println("Insert Z-score : ");
				double zt_score = dexa_scan.nextDouble();
				calc_z(zt_score);
			}
			else {
				System.out.println("Insert T-score : ");
				double zt_score = dexa_scan.nextDouble();
				calc_z(zt_score, fracture_val);
			}}}
	// --------------------------------
	static void calc_z(double zt_score) {
	     if (zt_score <= -2.0) {
			    print_z(zt_score,"Z_score", "   #   연령기대치이하  #");}
	     else {print_z(zt_score,"Z_score","   #   정상   #");}
	}
	// --------------------------------
	static void calc_z(double zt_score, String fracture) {
	     if(fracture.equals("y") && zt_score <= -2.5) {
			    print_z(zt_score,"T_score","   #   Severe Osteoporosis   #");
	     }
	     else if(zt_score <= -2.5) {
			    print_z(zt_score,"T_score","   #   Osteoporosis   #");
	     }
	     else if(zt_score > -2.5  && zt_score <= -1.0) {
	    	     print_z(zt_score,"T_score","   #   Osteopenia   #");
	     }
	     else if(zt_score > -1.0) {
			    print_z(zt_score,"T_score","   #   Normal Bone Mineral Density   #");
	     }
	     else {
	     }
	}
	// --------------------------------
	static void print_z(double zt_score, String zt, String result_z) {
		    System.out.println("\n골밀도 검사 결과   " + zt +  " :  " + zt_score + " 입니다.");
		    System.out.println(result_z);
	}
// ---------
}