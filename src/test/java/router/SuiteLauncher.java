package router;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
 
import org.testng.TestNG;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileWriter;
import java.io.IOException;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;



import com.relevantcodes.extentreports.ExtentReports;

public class SuiteLauncher
{
	public static ExtentReports extent;
	public static HashMap<String,String> testData;

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		extent = new ExtentReports("C:\\Users\\phani.kanth.sayana\\Desktop\\Valvoline Test Automation Report.html");
		ExecuteTestsInRunCriteria();
		extent.flush();
	}
	
	public static void TriggerTestNGxml() throws IOException
	{
		TestNG runner=new TestNG();
		List<String> suitefiles=new ArrayList<String>();
		suitefiles.add("C:\\Users\\phani.kanth.sayana\\Desktop\\testsuite.xml");
		runner.setTestSuites(suitefiles);
		runner.run();
	}
	
	
	
	public static void ExecuteTestsInRunCriteria() throws IOException, InterruptedException
	{
		testData = new HashMap<String,String>();  
		File excel =  new File ("C:\\Users\\phani.kanth.sayana\\Desktop\\test suite management.xlsx");
        FileInputStream fis = new FileInputStream(excel);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet ws = wb.getSheet("functional test suite");

        int rowNum = ws.getLastRowNum();
        for(int i = 1; i <=rowNum; i++)
        {
        	testData.clear();
            XSSFRow row = ws.getRow(i);
           
            if(row.getCell(4).toString().toUpperCase().equals("YES"))
            {
            	int colNum = ws.getRow(i).getLastCellNum();
                for (int j = 0; j < colNum; j++)
                {
                    XSSFCell cell = row.getCell(j);
                    if(cell!=null)
                    {
                    String value = cell.toString();
                    testData.put(ws.getRow(0).getCell(j).toString(), ws.getRow(i).getCell(j).toString());
                    }
                }
              //generate testng xml with the row details fetched
               GenerateTestNGxml(testData);
                Thread.sleep(5000);
                TriggerTestNGxml();
            }     
        }
	}
	
	public static void GenerateTestNGxml(HashMap<String,String> tests)
	{

		try {
			
			Element suite = new Element("suite");
			suite.setAttribute(new Attribute("name", "Suite"));
			Document doc1 = new Document(suite);
			doc1.setRootElement(suite);
			
			Element test = new Element("test");
			test.setAttribute(new Attribute("name", "Test"));
			doc1.getRootElement().addContent(test);
			
			Element classes = new Element("classes");
			test.addContent(classes);

			Element classx = new Element("class");
			classx.setAttribute(new Attribute("name", "testCases."+tests.get("Class")));
			classes.addContent(classx);
			
			Element methods = new Element("methods");
			classx.addContent(methods);
			
			Element include = new Element("include");
			include.setAttribute(new Attribute("name", tests.get("Test")));
			methods.addContent(include);
			
			// new XMLOutputter().output(doc, System.out);
			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc1, new FileWriter("C:\\Users\\phani.kanth.sayana\\Desktop\\testsuite.xml"));

			System.out.println("File Saved!");
		  } catch (IOException io) {
			System.out.println(io.getMessage());
		  }
	
	
		}
	
	}


