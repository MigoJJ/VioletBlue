package je.panse.doro.comm.item_execute.sousditto9;

import java.io.FileInputStream;	
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.main.Enter;

public class R_rl_excel3{
     public static void R_rl_excel_point(int rowindex, int columnindex, int sheetno, String excelFilePath) {
    	File_cdrw_proc fcp1 = new File_cdrw_proc();
        try {
     		FileInputStream inputstream = new FileInputStream(excelFilePath); 
     		XSSFWorkbook 	workbook = 	new XSSFWorkbook(inputstream);
     		XSSFSheet 		sheet = 	workbook.getSheetAt(sheetno);
     		int rows=sheet.getPhysicalNumberOfRows();
                XSSFRow row=sheet.getRow(rowindex);
           int cells=row.getPhysicalNumberOfCells();
                XSSFCell cell=row.getCell(columnindex);
                String value="Migo WJ ~~^^";
                if(cell!=null){
						switch(cell.getCellType()) {
							case STRING:System.out.print(cell.getStringCellValue() + "\t");
							
							    String iwbter = "\t" + cell.getStringCellValue();
							    String sfiwbt = String.format("%12s", iwbter);
								fcp1.writelinera(Enter.wts + "/9PLAN", sfiwbt);
							
//								fcp1.writelinera(Enter.wts + "/6OBJ", "\t" + cell.getStringCellValue());
								break;
							case NUMERIC:System.out.print(cell.getNumericCellValue() + "\t");break;
							case BOOLEAN:System.out.print(cell.getBooleanCellValue() + "\t"); break;
							default:	break;
						}
                	System.out.println("\r");
//                  System.out.println("\t" + rowindex+"번 행 row : "+columnindex+"번 열 cloumn 값: "+value);
                	}else{
               	}
			}catch(Exception e) {
			    e.printStackTrace();
			}
     }
     static String charctReturn (String rresf) {
    	 return rresf;
	}
} 