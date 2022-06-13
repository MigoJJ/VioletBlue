package je.panse.doro.fourgate.thyroid;

import java.util.Scanner;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.main.Enter;

public class ThyroidPhysicalExam {

	public void main(String skeys) throws Exception {
		Menu_list.main(Enter.wd + "/fourgate/thyroid/text/tpe/tpel1");

		try (Scanner s = new Scanner(System.in)) {
			int a, b, c;
			System.out.println(">>>>>> Goiter size  [  ....  ] cc:>>>\n\n");  	
			a = s.nextInt();
			System.out.println(">>>>>> goiter ruled out ? >>>\n\n");  
			b = s.nextInt();
			System.out.println(">>>>>> Detect any nodules :>>>\n\n"); 
			c = s.nextInt();
			
//			thyroid gland for consistency?
							
		}
	}

}
