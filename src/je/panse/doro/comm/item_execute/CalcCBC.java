package je.panse.doro.comm.item_execute;

import java.util.Scanner;	
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.main.Enter;

public class CalcCBC {
	File_cdrw_proc fcp1 = new File_cdrw_proc();
	public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("*****Input Hb :>>> ");
				double Hb = input.nextDouble();
			System.out.print("*****Input WBC :>>> ");
				int WBC = input.nextInt();
			System.out.print("*****Input Platelet:>>> ");
				int Plt = input.nextInt();
				
			String Hb1 = String.format("%.1f", Hb);
//	        input.close();
			String rHb  = (".   Hb  [ " + Hb1 + " ] g/dL");
			String rWBC  = (".   WBC [ " + WBC + " ] cells/L");
			String rPlt  = (".   Plt [ " + Plt + " ] billon/L");

			if (WBC == 0 | Plt == 0) {
				cbchb(rHb);
			}else {
				cbchb(rHb,rWBC,rPlt);
			}
        }
    }
	static void cbchb(String rHb) throws Exception {	
		File_cdrw_proc fcp1 = new File_cdrw_proc();
			fcp1.writeliner(Enter.wts + "/7LAB", rHb);
	}
	static void cbchb(String rHb,String rWBC,String rPlt) throws Exception {			
		File_cdrw_proc fcp1 = new File_cdrw_proc();
		fcp1.writeliner(Enter.wts + "/7LAB", rHb);
		fcp1.writeliner(Enter.wts + "/7LAB", rWBC);
		fcp1.writeliner(Enter.wts + "/7LAB", rPlt);
		}
// ----------	
}