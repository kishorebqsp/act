package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import net.bytebuddy.asm.Advice.Return;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Constant{
	public static String Data(String sheet,int row,int cell) 
	{
		String s="";
		try{
		FileInputStream fis=new FileInputStream(PATH);
		Workbook wb = WorkbookFactory.create(fis);
		 s = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		}
		
		catch(Exception a)
		{
			
		}
		return s;
	}

}
