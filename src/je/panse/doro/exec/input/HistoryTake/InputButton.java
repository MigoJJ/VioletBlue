package je.panse.doro.exec.input.HistoryTake;

import java.io.IOException;
import je.panse.doro.exec.StartForm;
import je.panse.doro.exec.input.NewPatientInput;
import je.panse.doro.main.Enter;

public class InputButton {
	public static void commentsButton(String cobu) throws IOException{
	
	}

	
	public static void quitButton(String cobu) throws IOException {
		StartForm.main(null);
	}

	
	public static void quitsaveButton(String cobu) throws IOException{
		Enter.main(null);
	}
//
//   	
//		  try {
//			ManageFile.deletefiler(Enter.wtf + "/3CC");
//			ManageFile.checkfiler(Enter.wtf + "/3CC");
//			ManageFile.deletefiler(Enter.wtf + "/ChartPlate");
//			ManageFile.checkfiler(Enter.wtf + "/ChartPlate");
//			ReadWriteToChartPlate.writeFile(Enter.wtf + "/3CC", chartline);
//			ReadWriteToChartPlate.writeFile(Enter.wtf + "/3CC", chartline1);
//			
//			PlatePrepUpdate.main(args);
//			NewPatientInput.main(null);
//		  } catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		  }
// --------------------------------------------
}