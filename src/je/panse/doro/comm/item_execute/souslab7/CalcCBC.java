package je.panse.doro.comm.item_execute.souslab7;

import java.util.Scanner;

import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.loop.CurrentDateAdd_date;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;

public class CalcCBC {
	double Hb;
	int WBC; int Plt;
	File_cdrw_proc fcp1 = new File_cdrw_proc();
	public void main(String skeys) throws Exception {
    	try (Scanner input = new Scanner(System.in)) {
    		System.out.print("========= Input\n\t[Hb]\n\t[WBC]\n\t[Platelet]  : ");
    		Hb = input.nextDouble();
    		WBC = input.nextInt();
    		Plt = input.nextInt();
				
			String Hb1 = String.format("%.1f", Hb);
//	        input.close();
			String rHb  = (".   Hb  [ " + Hb1 + " ] g/dL");
			String rWBC  = (".   WBC [ " + WBC + " ] cells/L");
			String rPlt  = (".   Plt [ " + Plt + " ] billon/L");

			if (WBC == 0 | Plt == 0) {
				cbchb(rHb);
			}
			else if (WBC > 0){
				cbchb(Hb,WBC,Plt);
			}
			else {
				cbchb(rHb,rWBC,rPlt);
			}
			fcp1.readfiler(Enter.wtss + "/7LAB_List");
			New7LAB nc1 = new New7LAB();
			nc1.main(null);
		} catch (NumberFormatException e) {
		e.printStackTrace();
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
	static void cbchb(double Hb, int WBC, int Plt) throws Exception {		
	       String CBCheadline = "\tHb (g/dl)   WBC (cells/L)  Platelet (billion/L)";
	       String CBCresult = (Hb +"\t\t" + WBC + "\t\t" + Plt);
				File_cdrw_proc fcp2 = new File_cdrw_proc();
					fcp2.writeliner(Enter.wts + "/7LAB", CBCheadline);
					fcp2.writeliner(Enter.wts + "/7LAB", "\t-----------------------------------");
					fcp2.writeliner(Enter.wts + "/7LAB", "\t" + CBCresult);
				if (WBC<4000) {
					fcp2.writeliner(Enter.wts + "/8ASS", "\t# Leukocytopenia : [ " + WBC+"\t"+ CurrentDateAdd_date.main("m")+" ]");
				}
				if (Hb< 12) {
					fcp2.writeliner(Enter.wts + "/8ASS", "\t# IDA : [ " + Hb+"\t"+ CurrentDateAdd_date.main("m")+" ]");
				}
				if (Plt<150) {
					fcp2.writeliner(Enter.wts + "/8ASS", "\t# Thrombocytopenia : [ " + Plt+"\t"+ CurrentDateAdd_date.main("m")+" ]");
				}
	}
// ----------	
}