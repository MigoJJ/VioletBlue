package je.panse.doro.comm.pilot;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.exec.input.DiseaseCode;
import je.panse.doro.exec.input.NewPatientInput;
import je.panse.doro.main.Enter;

public class AccessInput {
    private static String question;

    public static void main(String args[]) throws IOException{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert disease code : ");
        while (true) {
//            System.out.println("Insert disease code : ");
            String question = scanner.nextLine();
        	code_select(question);
                if(question.equals("quit")){
	            	System.out.println("Inserted code finished  !!!.: ");
	            	break;
	            }

	            //            System.out.println("Insert answer code:");
//            String answer = scanner.nextLine();
//	            
//            	if(answer.equals("quit")){
//	                break;
//	            }
        }
    	System.out.println("Success");
    	scanner.close();
    }

    
//------------------------------------------------     
	static void code_select(String dcode) throws IOException {
			
//	    	System.out.println("disease code ... is: " + dcode);  // Output user input
			
			switch (dcode) {
					  case "1" : System.out.println("#  DM without complications");
					              	writecoding("#  DM without complications")		;	break;
					              	
					  case "2" : System.out.println("#  Hypertension");	
					  				writecoding("#  Hypertension")				; 	break;
					  case "3" : System.out.println("#  Hypercholesterolemia");	
		  				writecoding("#  Hypercholesterolemia")				; 	break;
					  				
					  case "4" : System.out.println("#  Hyperthyroidism : Graves' disease");	
		  				writecoding("#  Hyperthyroidism : Graves' disease")				; 	break;
					  case "41" : System.out.println("#  Hypothyroidism :  Hashimoto's thyroiditis");	
		  				writecoding("#  Hypothyroidism :  Hashimoto's thyroiditis")				; 	break;		

					  case "5" : System.out.println("#  Osteoporosis");	
		  				writecoding("#  Osteoporosis")				; 	break;					  

		  				
					  case "fl" : System.out.println("#  Fatty Liver");	
		  				writecoding("#  Fatty Liver")				; 	break;		
				}
			}
//------------------------------------------------ 
	   static void writecoding(String writec) throws IOException {
//		   checkfiler(Enter.wd + "/comm/pilot/chart_access");
		   
			File file = new File(Enter.wd + "/comm/pilot/chart_access");
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
				try {
					bufferedWriter.write(writec);
				} catch (IOException e) {
					e.printStackTrace();
			}
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close();
}
//------------------------------------------------
//		static void checkfiler(String checkf) throws IOException {
//			try {
//				File A_disease = new File(checkf);
//				if (A_disease.createNewFile()) {
//					System.out.println("File created: " + A_disease.getName());
//				} 
//				else {
//					System.out.println("File already exists.");
//				}
//			} 
//			catch (IOException e) {
//			System.out.println("An error occurred.");
//			e.printStackTrace();
//			}
//		}	
//------------------------------------------------
}