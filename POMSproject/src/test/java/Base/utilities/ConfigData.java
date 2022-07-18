package Base.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ConfigData {
	
	 Workbook book;
	
	public void getdata() {

		File	sec=new File("./TestData/data.xlsx");

		try {
			FileInputStream fis=new FileInputStream(sec);

			 book=WorkbookFactory.create(fis);

		} catch (Exception e) {
			System.out.println("dtat not found"+" "+e);
		}
		
	}
	public  String config_user() {
		
		return book.getSheet("data").getRow(0).getCell(0).getStringCellValue();
	}
	
	public  String config_passw() {
		return book.getSheet("data").getRow(0).getCell(1).getStringCellValue();
	}

	
	
	

}
