package selenium1;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Exel2 {
	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\user\\Downloads\\Ashu.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook();
		XSSFSheet sh = workbook.createSheet();
		sh.createRow(0);
		sh.getRow(0).createCell(0).setCellValue("Hello");
		sh.getRow(0).createCell(1).setCellValue("World");

	}
}
