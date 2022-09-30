package selenium1;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel1 {
	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\user\\Downloads\\Ashu.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Ashu");

		int rows = sh.getLastRowNum();
		// System.out.println(rows);

		for (int r = 0; r <= sh.getLastRowNum(); r++) {
			Row rw = sh.getRow(r);

			for (int s = 0; s < rw.getLastCellNum(); s++) {

				Cell ce = rw.getCell(s);
				String str = ce.getStringCellValue();
				System.out.print(str + ",");
			}
			System.out.println();
		}

	}
}
