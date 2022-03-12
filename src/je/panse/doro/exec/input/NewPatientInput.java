package je.panse.doro.exec.input;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import je.panse.doro.comm.ReadWriteToFile;
import je.panse.doro.main.Enter;

public class NewPatientInput {
// --------------------------------------------	
	public static void main(String n_code) throws IOException {
		ManageFile.readfiler("/home/migowj/GDS/git/violetBlue0306/src/je/panse/doro/text/ChartInputMenu1");
				
		    try (Scanner c_code = new Scanner(System.in)) {
				System.out.println("Enter selected code number ...   : ");
				String cn_code = c_code.nextLine();  // Read user input
				
				switch (cn_code) {
						  case "1" : Input1CC.main(n_code);  	break;
//						  case "2" : SOAPInput.main(n_code);  	break;
//						  case "3" : SOAPInput.main(n_code);  	break;
//						  case "4" : SOAPInput.main(n_code);  	break;
					}
				}
			}
	public static void main(String n_code) throws IOException {
			List<String> list=new ArrayList<String>();  
			  list.add("/3CC");  
			  list.add("/4PMH");  
			  list.add("/5SUJ");  
			  list.add("/6OBJ");  
			  list.add("/7LAB");  
			  list.add("/8ACC");  
			  list.add("/9PLAN");  
			  for(String fruit:list)  
				  copyfiler(fruit);
			  
			  for(String fruit:list)
				  	ReadWriteToFile.readFile(Enter.wtf + fruit);
	  }
	// -----------------------------------------------------------
			public static void copyfiler(String copyf) throws IOException {
				// 1. 원본 File, 복사할 File 준비
				File file = new File(Enter.wtf + "/hana" + copyf); 
				File newFile = new File(Enter.wtf + copyf);
				// 2. 복사
				Files.copy(file.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
		}
// --------------------------------------------
}