package je.panse.doro.fourgate.symptom.subjective_read_data;

import java.io.File;	
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import je.panse.doro.main.Enter;

public class ReadExcel_cell {
	public static Cell main(int a1, int b1, int c1) throws IOException {
	    File excelFile = new File(Enter.wd + "/fourgate/symptom/subjective_data/SymptList.xlsx");
	    FileInputStream fis = new FileInputStream(excelFile);
	    XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    XSSFSheet sheet = workbook.getSheetAt(a1);
        Row row = sheet.getRow(0);
        int lastRowIndex = sheet.getLastRowNum() + 1;
//        System.out.println("Last row index :" + lastRowIndex);
        
        int i = b1;//--Location col
        int j = c1;
        		row = sheet.getRow(j);
                Cell c = row.getCell(i);
//        System.out.println("-".repeat(12)+c);
	    workbook.close();
	    fis.close();
	    return c;
	}
	
	private static void printIndex(String cd, int inlist) {
            System.out.println(inlist +  " >  "+cd+"\n");
	}
	
}
	
