package je.panse.doro.fourgate.symptom.subjective_read_data;

import java.util.Scanner;

public class Symptom12Enter {
	public static void main(String[] args) throws Exception {
		System.out.println(
		"""
		-------------------------
	\t1.	Diabetes Mellitus
	
	\t2.	Hyperthyroidism	
	\t3.	Hypothyroidism	
	
	\t4.	URI  	
	\t5.	UTI
	
	\t6.	Abdominal pain	
	\t7.	Atypical chest pain	
		-------------------------	""");

		ReadExcel_column2 ret1 = new ReadExcel_column2();
		System.out.println("\n........... inset the number ...> ");

		String inputNo="jj";
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
