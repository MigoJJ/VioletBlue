package je.panse.doro.comm;

import java.io.File;
import je.panse.doro.main.Enter;
import java.awt.Desktop;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;



public class File_editor_proc {
	public static void main(String string){
		try{
          File file = new File(Enter.wt + "/tripikata/ChartPlate.txt");
          if(!Desktop.isDesktopSupported())
           {
        	  	System.out.println("not supported");
        	  	return;
           }
          		Desktop desktop = Desktop.getDesktop();
          		if(file.exists())
          			desktop.open(file);
        }
		catch(Exception e){
            e.printStackTrace();
        }
    }
	
	public static void linepickup(String pickupfile, String savefilename) {
		Desktop destination=Desktop.getDesktop();
		try {
			destination.open(new File(pickupfile));
			Scanner sc = new Scanner(System.in);
				System.out.println("Enter a pickup line number :");
				int lnol = sc.nextInt();
				System.out.println("User input is  : "+ lnol);
					        
				String line3 = Files.readAllLines(Paths.get(pickupfile)).get(lnol-1);
				System.out.println(" : " + line3);
			File_cdrw_proc savef1 = new File_cdrw_proc();
				savef1.writeliner(savefilename, line3);
			
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
// ----------	
}