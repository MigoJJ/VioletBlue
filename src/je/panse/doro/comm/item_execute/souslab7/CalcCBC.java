package je.panse.doro.comm.item_execute.souslab7;

import java.util.Scanner;	

import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.loop.CurrentDateAdd_date;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;

public class CalcCBC {
	double Hb;
	int WBC,Plt;
	static File_cdrw_proc fcp1 = new File_cdrw_proc();
	public void main(String skeys) throws Exception {
    	try (Scanner input = new Scanner(System.in)) {
    		System.out.print("========= Input\n\t[Hb]\n\t[WBC]\n\t[Platelet]  : ");
    		Hb = input.nextDouble();
    		WBC = input.nextInt();
    		Plt = input.nextInt();
				
			String Hb1 = String.format("%.1f", Hb);
//	        input.close();
			String rHb  =  ("[ " + Hb1 + " ]");
			String rWBC  = ("[ " + WBC + " ]");
			String rPlt  = (" " + Plt + " ");

			if (WBC == 0 | Plt == 0) {
				cbchb(rHb);}
			else {
				cbchb(Hb,WBC,Plt);
				if (WBC<4000) {CalcCBC.cbcanalysis("Leukopenia", rWBC);}
				if (WBC > 11000){CalcCBC.cbcanalysis("Leukocytosis", rWBC);}
				if (Hb< 12) {CalcCBC.cbcanalysis("Anemia (r/o)IDA ICA", rHb);}
				if (Hb > 17.5) {CalcCBC.cbcanalysis("r/o Polycythemia vera", rHb);}
				if (Plt>450) {CalcCBC.cbcanalysis("Thrombocythemia / Thrombocytosis", rPlt);}
				if (Plt<150) {CalcCBC.cbcanalysis("Thrombocytopenia", rPlt);}
			}
			fcp1.readfiler(Enter.wtss + "/7LAB_List");
			New7LAB nc1 = new New7LAB();
			nc1.main(null);
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}
		
	}
	
	static void cbchb(String rHb) throws Exception {	
			fcp1.writeliner(Enter.wts + "/7LAB", rHb);
	}

	static void cbchb(double Hb, int WBC, int Plt) throws Exception {		
	       String CBCheadline = "\tHb (g/dl)   WBC (cells/L)  Platelet (billion/L)";
	       String CBCresult = (Hb +"\t\t" + WBC + "\t\t" + Plt);
					fcp1.writeliner(Enter.wts + "/7LAB", CBCheadline);
					fcp1.writeliner(Enter.wts + "/7LAB", "\t-----------------------------------");
					fcp1.writeliner(Enter.wts + "/7LAB", "\t" + CBCresult);
	}
	static void cbcanalysis(String decision,String item) throws Exception{
			try {
				fcp1.writeliner(Enter.wts + "/8ASS", "\t# " +decision + "[ " + item + "  "+ CurrentDateAdd_date.main("m")+" ]");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
// ----------	
}