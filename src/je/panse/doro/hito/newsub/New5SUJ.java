package je.panse.doro.hito.newsub;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.main.Enter;

public class New5SUJ{
	
	public static void main(String args[]) throws IOException {
        String path = (Enter.wts + "/5SUJ");      
        String st = ";q";
        do{
        	File file = new File(path);

        	try (FileWriter fileWriter = new FileWriter(file,true)) {
				Scanner suj_text = new Scanner(System.in);

					System.out.println("Enter Subjective complains  ...   : ");
					st = (suj_text.nextLine().trim());
					System.out.println("st = :  " + st + "\n");
					fileWriter.append(st + "\n");
			
	
        	
    		}
        	}while (st != "q"); 
//	        bufferFileWriter.close();

        System.out.println("Contents into File has been completed");
         
    }
// ---------- 
}