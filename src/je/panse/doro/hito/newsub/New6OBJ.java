package je.panse.doro.hito.newsub;

import java.util.Scanner;	
import je.panse.doro.comm.item_administratus.key.Key_shortcut;
import je.panse.doro.comm.item_execute.souslab7.CalcBMI;
import je.panse.doro.comm.item_execute.souslab7.CalcBP;
import je.panse.doro.comm.item_execute.souslab7.CalcCPA;
import je.panse.doro.comm.item_execute.souslab7.CalcDEXA;
import je.panse.doro.comm.item_execute.souslab7.CalcEKG;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class New6OBJ {
    public static void main(String[] args) throws Exception {
        try {
        	Scanner input = new Scanner(System.in);
			System.out.print("Enter a number .... for excute ......: ");
			
			if (input != null) {
				Newcategory.main(null);
			}
			
			while (true) {
				String str = input.nextLine();
				int code = Integer.parseInt(str);
			switch (code) {
			    case 1:
			        CalcBMI bmi = new CalcBMI();
			        bmi.main(null);
			        break;
			    case 2:
			        CalcBP bp = new CalcBP();
			        bp.main(null);
			        break;
			    case 4:
			        CalcCPA cpa = new CalcCPA();
			        cpa.main(null);
			        break;
			    case 5:
			        CalcEKG ekg = new CalcEKG();
			        ekg.main(null);
			        break;
			    case 7:
			        CalcDEXA dexa = new CalcDEXA();
			        dexa.main(null);
			        break;
			    default:
						Key_shortcut.main(code);
						break;
				}
			}
			
			} catch (NumberFormatException e) {
            e.printStackTrace();
        }
	}
}