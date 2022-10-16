package je.panse.doro.fourgate.thyroid.goiter;

import java.io.FileInputStream;		
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.*;

import je.panse.doro.comm.item_administratus.file.File_cdrw_proc;
import je.panse.doro.fourgate.thyroid.thycomm.R_rl_excel2;
import je.panse.doro.main.Enter;

public class EtGoiterProc {
	public void main(int sheeNo, int columNo) throws IOException {
		String excelFilePath = ("/home/migowj/git/Violetblue/src/je/panse/doro/fourgate/thyroid/dataxlsxfile/Thyroidpe.xlsx");
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook =  new XSSFWorkbook(inputstream) ;
		XSSFSheet sheet = workbook.getSheetAt(sheeNo); //XSSFSheet sheet = new workbook.getSheet("Sheet");
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();

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
//					System.out.println();
			}  //---col

			iwbtList(thyoridList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void iwbtList(ArrayList<String> thyoridList) throws IOException {
		int r=0;
		for(String i : thyoridList) {
			System.out.println(i);
			System.out.println(">>> insert code ...");
			Scanner sc = new Scanner(System.in);
				int submenuNo = sc.nextInt();
				System.out.println("User input: " + submenuNo);	
				R_rl_excel2 rre1 = new 	R_rl_excel2();
				File_cdrw_proc fcp1 = new File_cdrw_proc();
					switch(r) {
						case 0:
					       fcp1.writeliner(Enter.wts + "/6OBJ", "\n<Thyroid Physical Exam>----------\n");
							String eclc =  ( "Goiter size  :  [  " + submenuNo + "  ] cc");
					       fcp1.writeliner(Enter.wts + "/6OBJ", "\t" + eclc);
							break;
						case 1 : case 2: case 3 : case 4 : case 5: case 6 :
							fcp1.writeliner(Enter.wts + "/6OBJ", "");
							rre1.R_rl_excel_point(0,r-1,1);
							rre1.R_rl_excel_point(submenuNo,r-1,1);
							break;
						case 7 :
							fcp1.writeliner(Enter.wts + "/6OBJ", "");
							rre1.R_rl_excel_point(0,r-1,1);
							rre1.R_rl_excel_point(submenuNo+1,r-1,1);
							break;
							default:break;
						}
			r= r+1;
        }
    }
//----------------------------------------------------------
}
