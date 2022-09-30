package selenium1;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXEL {
	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\user\\Downloads\\Ashu.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Ashu");
		
		for (int r = 0; r < 5; r++)
		{
			
			for (int s = 0; s < 2; s++) 
			{
				
				Row rw = sh.getRow(r);
				Cell ce = rw.getCell(s);
				String str = ce.getStringCellValue();
				System.out.print(str+",");
			}
			System.out.println();
		}

	
	}

}
