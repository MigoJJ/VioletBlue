package je.panse.doro.fourgate.symptom.subjective_read_data;

import java.io.File;	
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import je.panse.doro.comm.File_cdrw_proc;

public class ReadExcel_column2 {
	public static void main(int sheetNo,  int colNo) throws Exception {
	    File excelFile = new File("/home/migowj/git/VioletBlue_5SUB/src/subjective_data/SymptList.xlsx");
	    FileInputStream fis = new FileInputStream(excelFile);
	    XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    XSSFSheet sheet = workbook.getSheetAt(sheetNo);
	    
        Row row = sheet.getRow(0);
        int lastRowIndex = sheet.getLastRowNum() + 1;
        System.out.println("Last row index :" + lastRowIndex);
        DataFormatter df = new DataFormatter();
        
         int i = colNo;//--Location col
            for (int j = 0; j < lastRowIndex; j++) {
                row = sheet.getRow(j);
                Cell c = row.getCell(i);
                String cellData = df.formatCellValue(c);

                if(j==0) {
                System.out.println("-".repeat(12));
                System.out.println(">>> "+cellData);
                System.out.println("-".repeat(12));
            	}
                else {
                	printIndex(cellData,j);
                }
             }
             System.out.println("-----------\n");
             choiceIndex(lastRowIndex,colNo,sheetNo);
             workbook.close();
	    fis.close();
	  }
	
	private static void printIndex(String cd, int inlist) {
          System.out.println(inlist +  " >  "+cd+"\n");
	}
	
	private static void choiceIndex(int lri,int cno,int sno) throws Exception {
		
		String textPath ="/home/migowj/git/VioletBlue_5SUB/src/subjective_data/SymptList.xlsx";
		File_cdrw_proc fcp1 = new File_cdrw_proc(); 

		
		try(Scanner sc = new Scanner(System.in)) {
			String inputNo = "JJ";
			while(!(inputNo = sc.nextLine()).equals("")) {
//				System.out.println("\n........... inset the number ...> ");
				int number = (Integer.parseInt(inputNo));
		          Cell returenedSympt1= (ReadExcel_cell.main(sno,cno,number));
		          String returenedSympt=returenedSympt1.toString();
		          
//		          System.out.println("returenedSympt  >>>   " +returenedSympt);
				if (number < lri) {
					 if (inputNo.startsWith("0")) {
					 System.out.print( "\t☐ " +returenedSympt+"\n");
					 fcp1.writelinera("/home/migowj/git/Violetblue/src/je/panse/doro/text/samsara/5SUJ", "\t☐ " +returenedSympt+"\n");
					 }
					 else {
					 System.out.print( "\t√ " + returenedSympt +"\n");
					 fcp1.writelinera("/home/migowj/git/Violetblue/src/je/panse/doro/text/samsara/5SUJ", "\t√ " +returenedSympt+"\n");
					 }
				}
		}
		Symptom12Enter nc1 = new Symptom12Enter();
			nc1.main(null);	
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
//--------------------
}
	
