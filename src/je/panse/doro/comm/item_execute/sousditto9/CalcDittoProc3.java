package je.panse.doro.comm.item_execute.sousditto9;

import java.io.FileInputStream;					
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.*;

import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.comm.item_administratus.file.File_cw_chart;
import je.panse.doro.comm.item_subexecute.Edcamain;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;

public class CalcDittoProc3 {
	public void main(int sheeNo, int columNo) throws IOException {
//		String excelFilePath = (Enter.wd + "/aeternum/dataxlsx/Plan9List.xlsx");
		String excelFilePath = (Enter.wd + "/aeternum/dataxlsx/Plan9List.xlsx");
		
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		try (XSSFWorkbook workbook = new XSSFWorkbook(inputstream)) {
			XSSFSheet sheet = workbook.getSheetAt(sheeNo); //XSSFSheet sheet = new workbook.getSheet("Sheet");
			int rows = sheet.getLastRowNum();
			System.out.println("int rows = sheet.getLastRowNum();  >>" + rows);
			int cols = sheet.getRow(1).getLastCellNum();
			System.out.println("int cols = sheet.getRow(1).getLastCellNum();  >>" + cols);
			ArrayList<String> thyoridList = new ArrayList<>(Arrays.asList());
			try {
				for(int r=0; r<=rows; r++) {
					XSSFRow row = sheet.getRow(r);// 0
					XSSFCell cell = row.getCell(columNo);
					if (cell != null) {
						switch(cell.getCellType()) {
							case STRING:
								String getrc = (cell.getStringCellValue()+ "\t");
								thyoridList.add(getrc);
								break;
							case NUMERIC:System.out.print(cell.getNumericCellValue()+ "\t"); break;
							case BOOLEAN:System.out.print(cell.getBooleanCellValue()+ "\t"); break;
							default:
								break;
							}
					}
				}  //---col
				int e = 1;
				for(String i : thyoridList) {
					System.out.printf("[ %s ] ",e);
					System.out.println(i);
					e = e+1;
				}
				iwbtList(excelFilePath);
				System.out.print(".....>>>>> Input Additional Plan : ");
				Scanner suj_text = new Scanner(System.in);
				String st = (suj_text.nextLine().trim());
				Edcamain.main("..." + st,"/5SUJ");


			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void iwbtList(String excelFilePath) throws Exception {
		File_cdrw_proc fcp1 = new File_cdrw_proc();
		File_cw_chart rre1 = new File_cw_chart();
		R_rl_excel3 rre2 = new 	R_rl_excel3();
		Newcategory nc1 = new Newcategory();
		
		Integer submenuNo = 1;
		
		try {
			while(submenuNo != 9) {
				System.out.println(">>> insert code ...");
				Scanner sc = new Scanner(System.in);
				submenuNo = sc.nextInt();
//				if (submenuNo == 20) {
//					ThyroidJTableInput tji1 =  new ThyroidJTableInput();
//					tji1.main(null);			
//				}
				System.out.println("User input: " + submenuNo);	
				fcp1.writeliner(Enter.wts + "/9PLAN", "");
				rre2.R_rl_excel_point(submenuNo-1,0,0,excelFilePath);
			} 
			rre1.writechart(); 
			fcp1.readfiler(Enter.wt + "/singlebeam/ChartPopUpMenu");
			nc1.main(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
//----------------------------------------------------------
}
