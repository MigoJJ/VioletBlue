package je.panse.doro.fourgate.thyroid;

import java.io.FileInputStream;		
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.*;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.fourgate.thyroid.thycomm.LmDeux;
import je.panse.doro.fourgate.thyroid.thycomm.R_rl_excel2;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;
 
public class ThyroidPhysicalExam {
	public static void main(String[] args) throws Exception{
		try {
			//String excelFilePath = Enter.wd + "/fourgate/thyroid/dataxlsxfile/Thyroidpe.xlsx";
			String excelFilePath = (Enter.wd + "/fourgate/thyroid/dataxlsxfile/Thyroidpe.xlsx");
			FileInputStream inputstream = new FileInputStream(excelFilePath); 
			XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
			XSSFSheet sheet=workbook.getSheetAt(0);
			int rowindex=0;
			int columnindex=0;
			int rows=sheet.getPhysicalNumberOfRows();
		    
			for(rowindex=0;rowindex<rows;rowindex++){
				XSSFRow row=sheet.getRow(rowindex);
				if(row !=null){
					int cells=row.getPhysicalNumberOfCells();
					for(columnindex=0; columnindex<=cells; columnindex++){
					    XSSFCell cell=row.getCell(columnindex);
					    String value="";
					    if(cell==null){
					    	continue;
						}else{
							switch(cell.getCellType()) {
								case STRING:System.out.println(cell.getStringCellValue() + "\t"); break;
								case NUMERIC:System.out.println(cell.getNumericCellValue() + "\t"); break;
								case BOOLEAN:System.out.println(cell.getBooleanCellValue() + "\t"); break;
								default:break;
							}
						}
					}
				//	System.out.println("Insert program ..");
					Scanner input = new Scanner(System.in);
					int excelcolrowchoice=0;
					System.out.println("\r====== choice the number >>>>>>");
					excelcolrowchoice = input.nextInt();
					R_rl_excel2 rre1 = new 	R_rl_excel2();
					File_cdrw_proc fcp1 = new File_cdrw_proc();
						switch(rowindex) {
							case 0:
						       fcp1.writeliner(Enter.wts + "/6OBJ", "\n<Thyroid Physical Exam>----------\n");
								String eclc =  ( "\tGoiter size  :  [  " + excelcolrowchoice + "  ] cc");
						       fcp1.writeliner(Enter.wts + "/6OBJ", "\t" + eclc);
						       fcp1.writeliner(Enter.wts + "/6OBJ", "\n\t-----------------------------\n");
								break;
							case 1 : case 2: case 3 : case 4 : case 5: case 6 : 
//								fcp1.writeliner(Enter.wts + "/6OBJ", "\n.....................................\n");
								rre1.R_rl_excel_point(0,rowindex-1,1);
								rre1.R_rl_excel_point(excelcolrowchoice,rowindex-1,1);
								break;
							case 7 :
//								fcp1.writeliner(Enter.wts + "/6OBJ", "\n.....................................\n");
									rre1.R_rl_excel_point(0,rowindex-1,1);
									rre1.R_rl_excel_point(excelcolrowchoice+1,rowindex-1,1);
									break;
								default:break;
							}
				 //input.close();
				 //====================================if
				    }
			}
//			LmDeux.main(null);
			File_cw_chart dn1 = new File_cw_chart();
			ThyroidEnter 	cc1 = new ThyroidEnter(); 
        		dn1.deuxnine();
        		cc1.main(null);
			}catch(Exception e) {
		     e.printStackTrace();
			}
// ------------------------------------class method
     }
}

