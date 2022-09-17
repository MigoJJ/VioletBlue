package je.panse.doro.fourgate.symptom.subjective_read_data;

import java.util.Scanner;

import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.main.Enter;

public class Symptom12Enter {
	public static void main(String[] args) throws Exception {
		System.out.println(
		"S > ...have been suffered ⯀ √\n"
		+ "-------------------------\n"
		+ "\t1.	Diabetes Mellitus\n"
		+ "\t2.	Hyperthyroidism\n"
		+ "\t3.	Hypothyroidism\n"
		+ "\t4.	URI\n"
		+ "\t5.	UTI\n"
		+ "\t6.	Abdominal pain\n"
		+ "\t7.	Atypical chest pain\n"
		+ "-------------------------");
		File_cdrw_proc fcp1 = new File_cdrw_proc();
//		fcp1.writeliner(Enter.wts + "/5SUJ", "S > ...have been suffered ⯀ √");
		ReadExcel_column2 ret1 = new ReadExcel_column2();
		System.out.println("\n........... inset the number ...> ");
		String inputNo="JJ";
			try(Scanner sc = new Scanner(System.in)) {
				while(!(inputNo = sc.nextLine()).equals("")) {
					switch(inputNo) {
						case "1":	ret1.main(1,0);    break;
						case "2":	ret1.main(1,1);    break;
						case "3":	ret1.main(1,2);    break;
						case "4":	ret1.main(1,3);    break;
						case "5":	ret1.main(1,4);    break;
						case "6":	ret1.main(1,5);    break;
						case "7":	ret1.main(1,6);    break;
						case "9" : case "99" : case "999" :case "71" :
				   			Key_Iwbb st999 = new Key_Iwbb();
				   			int SinputNo = Integer.valueOf(inputNo);
				   			st999.Key_Iwbb_Page(SinputNo); break;
					  default:
					    // code block
					}
			}
			} catch (IndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
