package je.panse.doro.aeternum.supportdiagnosis;

import java.util.Scanner;

import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.item_image.ImageCall;
import je.panse.doro.hito.StartForm;
import je.panse.doro.main.Enter;

public class DisSupp {
	public static void main(String[] args) throws Exception {
		int select_code =1;
		ImageCall nc1 = new ImageCall();
		try (Scanner new_code = new Scanner(System.in)) {
			System.out.println("Enter selected code number ...   : ");
			select_code = new_code.nextInt();
			
			switch (select_code) {
				case 1 : nc1.main(Enter.wds + "/herpesZoster.jpg", 1200, 900); break;			
				case 2 : nc1.main(Enter.wds + "/HbA1c.jpg", 1200, 900); break;			
				case 3 : nc1.main(Enter.wds + "/ThyroidDx.jpeg", 600, 900); break;			
	
				case 9 : case 99 : case 999 :
			   			Key_Iwbb st999 = new Key_Iwbb();
			   			st999.Key_Iwbb_Page(select_code); break;
				default :System.out.println(" uncertain ... please check  !!");
				}
		}catch (NumberFormatException e) {
		e.printStackTrace();
		}
		StartForm     rk2 = new StartForm();
		rk2.main(null);
	}
// -------
}