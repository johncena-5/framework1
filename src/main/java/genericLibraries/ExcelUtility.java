package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class reusable methods to perform operation on excel workbook;
 * 
 * @author 
 *
 */
public class ExcelUtility {
	Workbook wb = null;

	/**
	 * This method is used to initialize workbook
	 */
	public void excelIntialization(String excelPath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String fetchDatatFromExcel(String sheetName, int rowNum, int cellNum) {
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}

	/**
	 * This method is used to multiple data from excel
	 * 
	 * @param sheetName
	 * @return
	 */
	public List<String> fetchDatatFromExcel(String sheetName) {
		List<String> dataList = new ArrayList<String>();
		Sheet sheet = wb.getSheet(sheetName);
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			String data = sheet.getRow(i).getCell(1).getStringCellValue();
			dataList.add(data);
		}
		return dataList;
	}

	/**
	 * This method is close the workbook
	 */
	public void closeExcel() {
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
