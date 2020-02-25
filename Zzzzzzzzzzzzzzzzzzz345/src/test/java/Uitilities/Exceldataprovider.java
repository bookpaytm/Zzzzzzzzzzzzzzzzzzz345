package Uitilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {

	
	
	
	
	XSSFWorkbook wb;
	public Exceldataprovider(){
File src=new File("./Testdata/Testwork.xlsx");
try {
	FileInputStream fis=new FileInputStream(src);
	 wb=new XSSFWorkbook(fis);
} catch (Exception e) {

}
}
	public String getStringdata(int indexname,int rows,int coloums){
		return wb.getSheetAt(indexname).getRow(rows).getCell(coloums).getStringCellValue();
	}
	public String getString(String sheetname,int rows,int coloums){
		return wb.getSheet(sheetname).getRow(rows).getCell(coloums).getStringCellValue();
	}
	public double getnumericdata(String sheetname, int rows,int coloums){
return	wb.getSheet(sheetname).getRow(rows).getCell(coloums).getNumericCellValue();
		
	}
}
