package je.panse.doro.comm.item_execute.lab7;

import java.io.BufferedWriter;	
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;			
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.comm.item_execute.CalcASS;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New6OBJ;
import je.panse.doro.main.Enter;

public class CalcEKG {
	public void main(String skeys) throws Exception { 
		File_cdrw_proc ekg1 = new File_cdrw_proc(); 
		ekg1.readfiler(Enter.wt + "/singlebeam/subnewmenu/6OBJs/EKGj");
		
		System.out.println(ekg1);

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println("Enter selected EKG code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
	
				switch (select_code) {
					case 1 : accessInsert("정상 (Within Normal Limits)"); break;
					case 2 : accessInsert("동서맥 (Sinus Bradycardia)"); break;
					case 3 : accessInsert("동빈맥 (Sinus tachycardia)"); break;
					case 4 : accessInsert("심실조기수축 (Early ventricular constraction)"); break;
					case 5 : accessInsert("심방조기수축 (Early atrial constraction)"); break;
					
					case 6 : accessInsert("비특이적 ST-T분절 변화(Nonspecific ST-T change)"); break;
					case 7 : accessInsert("완전(불완전) 우각차단 (Complete/Incomplete Rt bundle branch block)"); break;
					case 8 : accessInsert("좌각차단 (Lt bundle branch block)"); break;
					
					case 10 : accessInsert("좌심실 비대 (Left Ventricular Hypertrophy)"); break;
					case 11 : accessInsert("우심방확장 (Rt atrial enlargement)"); break;
					case 12 : accessInsert("우심실 비대 (Rt Ventricular Hypertrophy)"); break;
					case 13 : accessInsert("좌각전섬유속차단/좌각후섬유속차단 (LAFB/LPFB)"); break;
					
					case 14 : accessInsert("심근경색 (Myocardial infarction)"); break;
					case 141 : accessInsert("오래된 심근경색 (Old myocardial infarction)"); break;
					case 15 : accessInsert("심근허혈 (Myocardial ischemia)"); break;
					
					case 16 : accessInsert("심방세동 (Artrial Fibrillation)"); break;
					case 161 : accessInsert("심방조동(Atral flutter)"); break;
					case 17 : accessInsert("WPW 증후군 (WPW syndrome)"); break;
					
					case 18 : accessInsert("저전압 (Low voltage)"); break;
					case 19 : accessInsert("이소성 심박조율 (Ectopic rhythm)"); break;
					case 20 : accessInsert("심실내 전도지연/조기전이 (Delayed ventricular conduction/Early conduction)"); break;
					case 21 : accessInsert("고 T파 (Peaked T waves, Hyperacute T waves (HATW))"); break;

					case 9 : File_cw_chart dn1 = new File_cw_chart();
							dn1.deuxnine();;	break;
					default :System.out.println(" uncertain ... please check  !!");
				}
				if (skeys == "Itemcategorykey") {
					ekg1.readfiler(Enter.wt + "/singlebeam/ItemMenu");
					Itemcategory.main(null);
				}
				else {
					ekg1.readfiler(Enter.wt + "/singlebeam/subnewmenu/6OBJ_List");
					New6OBJ.main(null);
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}	
	//------------------------------------------------
	void writecoding(String writec) throws IOException {
			File file_acc = new File(Enter.wts + "/6OBJ");
			System.out.println(file_acc);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_acc,true));
				try {
					bufferedWriter.write("\t\tEKG  : " + writec);
				    File_cdrw_proc fcp1 = new File_cdrw_proc();
					fcp1.writeliner(Enter.wts + "/8ASS", "\t#  EKG : " + writec);
				} catch (IOException e) {
					e.printStackTrace();
			}
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close();
}
//------------------------------------------------
	 void accessInsert(String EKG_code) throws IOException {
				try {
					System.out.println(EKG_code);
					writecoding(EKG_code);
				} catch (IOException e) {
					e.printStackTrace();
			}
}
// ----------
}