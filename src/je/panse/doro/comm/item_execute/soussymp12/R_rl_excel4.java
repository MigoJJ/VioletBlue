package je.panse.doro.comm.item_execute.soussymp12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class R_rl_excel4 {
	public void main(int sheeNo, int columNo,String fP) throws IOException {
		
		FileInputStream inputstream = new FileInputStream(fP);
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
//			System.out.println(thyoridList);
			int e = 1;
			for(String i : thyoridList) {
				System.out.printf("[ %s ] ",e);
				System.out.println(i);
				e = e+1;
			}
			
//			iwbtList(null);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
} 