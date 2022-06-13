package je.panse.doro.fourgate.thyroid;

import java.util.Scanner;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.main.Enter;

public class ThyroidEnter {
	public static void main(String[] string) throws Exception {
		Menu_list.main(Enter.wd + "/fourgate/thyroid/ThyroidStart");
		ThyroidPhysicalExam	tpe1 = new ThyroidPhysicalExam();
		
		try(Scanner case_code = new Scanner(System.in)) {
			while (true) {
				System.out.println(">>> Enter selected number :  >>>");
				int select_code = 99;
				select_code = Integer.valueOf(case_code.nextLine());
				switch (select_code) {
//					case 1 : press_Key(Enter.wt + "/singlebeam/subsinglebeam/Prologue");
//					case 2 : press_Key(Enter.wt + "/singlebeam/subsinglebeam/VersionInfo");
					case 3 : tpe1.main(null);break;
					
					default :System.out.println(" uncertain ... please check  !!");
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
			//sf1.readfiler(Enter.wt + "/singlebeam/DoctorLogin");
	}

}
