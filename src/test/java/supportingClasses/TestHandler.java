package supportingClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestHandler 
{
	static int activeRow;
	static HashMap<String,String> testData;
	public static void main(String[] args) throws IOException
	{
		ReadDataFromExcel();
	}
	public static void ReadDataFromExcel() throws IOException
	{
		testData = new HashMap<String,String>();  
		File excel =  new File ("C:\\Users\\phani.kanth.sayana\\Desktop\\test suite management.xlsx");
        FileInputStream fis = new FileInputStream(excel);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet ws = wb.getSheet("test suite");

        int rowNum = ws.getLastRowNum();
        for(int i = 1; i <=rowNum; i++)
        {
            XSSFRow row = ws.getRow(i);
            int colNum = ws.getRow(i).getLastCellNum();
                for (int j = 0; j < colNum; j++)
                {
                    XSSFCell cell = row.getCell(j);
                    if(cell!=null)
                    {
                    String value = cell.toString();
                    testData.put(ws.getRow(0).getCell(j).toString(), ws.getRow(i).getCell(j).toString());
                    //data[i][j] = value;
                    //System.out.println ("the value at row "+i +" and column "+j+" is "+ value);
                    }
                }
        }

		
	}
}
