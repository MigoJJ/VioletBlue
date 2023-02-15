package je.panse.doro.comm.item_execute.souslab7.Proc_CalcBP;

import java.util.ArrayList;

import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class Bpmain {
	static File_cdrw_proc fcp1 = new File_cdrw_proc();
	  static String fhomeDir = Enter.udbu5 +"/hito/bp/bpoutput";
	  static String bp1 = "at GDS, ";
	  static String bp2,bp3,bp4;
	  static String bp5 = "Regular ";
	  static String bp6 = " BP measured at left seated position, \n";
	  static String bp7;
	  static String bt1 = "Forehead (temporal) temperature : ";
	  static String br1 = " Respiratory Rate: ";
	  static String save_time;
  public static void main(String[] args) throws Exception {
	  File_delete_new.main(fhomeDir);
	  save_time = CurrentDateAdd_date.defineTime("t");
	  ArrayList<String> result = Bp_ArrayListInput.getStrings();
//	  System.out.println("Inputs: " + result);
	    for (int i = 0; i < result.size(); i++) {
			if (result.get(i).startsWith("h")) {
				bp1 = "at home, ";
				save_time="";
			}else if (result.get(i).startsWith("i")) {
				bp5 = "irRegular ";
			}else if (result.get(i).startsWith("r")) {
				bp6 = " BP measured at right seated position, \n";
			}else {
			}
	    } 
        result.remove("h");
        result.remove("i");
        result.remove("r");
        
	    System.out.println("Date/Time : " + save_time);
	    Filewriter_oneline.main("Date/Time : " + save_time);
	    
        
		if (result.size() < 2) {
			Bpmain.bpclassifyNo(result.get(0));
			System.out.println(bp1 +bp2);
			Filewriter_oneline.main(bp1 +bp2);
		}
		else if (result.size() < 3) {
			Bpmain.bpclassifyNo(result.get(0),result.get(1));
			System.out.println(bp1 + bp2);
			Filewriter_oneline.main(bp1 +bp2);
		}
		else if (result.size() < 4) {
			Bpmain.bpclassifyNo(result.get(0),result.get(1),result.get(2));
			System.out.println(bp1 + bp6 + bp2 + bp5 );
			Filewriter_oneline.main(bp1 + bp6 + bp2 + bp5);
		}
		 else if (result.size() < 5) {
			Bpmain.bpclassifyNo(result.get(0),result.get(1),result.get(2));
			System.out.println(bp1 + bp6 + bp2 + bp5 +"\n");
			System.out.println(" Body Temperature: " + result.get(3) + "°C (measured Forehead temperature)");
			Filewriter_oneline.main(bp1 + bp6 + bp2 + bp5+"\n");
			Filewriter_oneline.main(" Body Temperature: " + result.get(3) + "°C (measured Forehead temperature)");
		}
		 else if (result.size() < 6) {
			Bpmain.bpclassifyNo(result.get(0),result.get(1),result.get(2));
			System.out.println(bp1 + bp6 + bp2 + bp5 +"\n");
			System.out.println(" Body Temperature:[ " + result.get(3) + "°C ] (measured Forehead temperature)");
			System.out.println(" Respiratory Rate:[ " + result.get(4) + " ] breaths /min (measured while sitting)");
			Filewriter_oneline.main(bp1 + bp6 + bp2 + bp5+"\n");
			Filewriter_oneline.main(" Body Temperature: " + result.get(3) + "°C (measured Forehead temperature)");
			Filewriter_oneline.main(" Respiratory Rate:[ " + result.get(4) + " ] breaths /min (measured while sitting)");
		 }
		 else {
		}
  }

	private static String bpclassifyNo(String bbp2) {
		bp2 = ("SBP [ " +bbp2 + " ] mmHg ");
		return bp2;
	}
	private static String bpclassifyNo(String bbp2, String bbp3) {
		bp2 = ("BP [ " +bbp2 + " / " + bbp3 + " ] mmHg ");	
		return bp2;
	}
	private static String bpclassifyNo(String bbp2,String bbp3, String bbp4) {
		bp2 = ("BP [ " +bbp2 + " / " + bbp3 + " ] mmHg" + " PR [ " + bbp4+ " ]/min ");	
		return bp2;
	}

}
