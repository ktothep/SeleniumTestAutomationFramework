import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
public static File file;
public static FileInputStream fis;
public static FileOutputStream fos;
public static XSSFWorkbook wb;
public static XSSFSheet sheet;
public static Row row;
public static Cell cell;

public static void workbookopen() throws IOException
{
	
	 file =new File(System.getProperty("user.dir")+"//Workbook1.xlsx");
    fis=new FileInputStream(file);
    wb=new XSSFWorkbook(fis);
    sheet=wb.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(1);
    System.out.println(cell.getStringCellValue());
    fis.close();
    
}
public static void writeworkbokk() throws IOException
{
	 file =new File(System.getProperty("user.dir")+"//Workbook1.xlsx"); 
	 fis=new FileInputStream(file);
	 wb=new XSSFWorkbook(fis);
	    sheet=wb.getSheetAt(0);	   
	    row=sheet.getRow(1);
	    cell=row.getCell(1);
	    System.out.println(cell.getStringCellValue());
        cell=row.createCell(2);
	    cell.setCellValue("New Value");
	    fos=new FileOutputStream(file);
	    wb.write(fos);
	    fos.close();
}

	


}
