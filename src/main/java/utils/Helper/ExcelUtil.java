package utils.Helper;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
import static core.Tests.BaseTest.testDataExcelFileName;
 
public class ExcelUtil {
    //Main Directory of the project
    public static final String currentDir = System.getProperty("user.dir");
 
    //Location of Test data excel file
    public static String testDataExcelPath = ".\\src\\test\\resources\\TestCases.xlsx";
    
    // \src\test\resources
//    .\\datafeed\\people1.xlsx
    
  //  /dataFeed/cs.xlsx
 
    //Excel WorkBook
    private static XSSFWorkbook excelWBook;
 
    //Excel Sheet
    private static XSSFSheet excelWSheet;
 
    //Excel cell
    private static XSSFCell cell;
 
    //Excel row
    private static XSSFRow row;
 
    //Row Number
    public static int rowNumber;
 
    //Column Number
    public static int columnNumber;
 
    //Setter and Getters of row and columns
    public static void setRowNumber(int pRowNumber) {
        rowNumber = pRowNumber;
    }
 
    public static int getRowNumber() {
        return rowNumber;
    }
 
    public static void setColumnNumber(int pColumnNumber) {
        columnNumber = pColumnNumber;
    }
 
    public static int getColumnNumber() {
        return columnNumber;
    }
 
    // This method has two parameters: "Test data excel file name" and "Excel sheet name"
    // It creates FileInputStream and set excel file and excel sheet to excelWBook and excelWSheet variables.
    public static void setExcelFileSheet(String sheetName) {
        //MAC or Windows Selection for excel path
        if (Platform.getCurrent().toString().equalsIgnoreCase("MAC")) {
            testDataExcelPath = currentDir + "//src//test//resources//";
        } else if (Platform.getCurrent().toString().contains("WIN")) {
            testDataExcelPath = currentDir + "\\src\\test\\resources\\";
        }
        try {
            // Open the Excel file
            FileInputStream ExcelFile = new FileInputStream(testDataExcelPath + testDataExcelFileName);
            excelWBook = new XSSFWorkbook(ExcelFile);
            excelWSheet = excelWBook.getSheet(sheetName);
        } catch (Exception e) {
            try {
                throw (e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
 
    public static void setCurrentRow(int rowNumber, int columnNumber)
    {
    	setRowNumber(rowNumber);
    	setColumnNumber(columnNumber);
    }
    //This method reads the test data from the Excel cell.
    //We are passing row number and column number as parameters.
    public static String getCellData(String sheetName, int RowNum, int ColNum) {
        try {
        	XSSFSheet excelWSheetLocal = excelWBook.getSheet(sheetName);
            cell = excelWSheetLocal.getRow(RowNum).getCell(ColNum);
            DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(cell);
            excelWSheetLocal = null;
            return cellData;
        } catch (Exception e) {
            throw (e);
        }
    }
 
    //This method takes row number as a parameter and returns the data of given row number.
    public static XSSFRow getRowData(int RowNum) {
        try {
            row = excelWSheet.getRow(RowNum);
            return row;
        } catch (Exception e) {
            throw (e);
        }
    }
 
    //This method gets excel file, row and column number and set a value to the that cell.
    public static void setCellData(String value, int RowNum, int ColNum) {
        try {
            row = excelWSheet.getRow(RowNum);
            cell = row.getCell(ColNum);
            if (cell == null) {
                cell = row.createCell(ColNum);
                cell.setCellValue(value);
            } else {
                cell.setCellValue(value);
            }
            // Constant variables Test Data path and Test Data file name
            FileOutputStream fileOut = new FileOutputStream(testDataExcelPath + testDataExcelFileName);
            excelWBook.write(fileOut);
            fileOut.flush();
            fileOut.close();
        } catch (Exception e) {
            try {
                throw (e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}