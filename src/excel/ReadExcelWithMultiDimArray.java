package excel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelWithMultiDimArray {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\sadia meriane\\Downloads\\Book 7.xlsx";
        String mySheetPath = "Sheet1";

        FileInputStream fis = new FileInputStream(path);


        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(mySheetPath);

        int myRow = sheet.getLastRowNum() + 1;

        int myColumns = sheet.getRow(0).getLastCellNum();

        String[][] rowcol = new String[myRow][myColumns];

        for (int r = 0; r < myRow; r++) {

            XSSFRow xRow = sheet.getRow(r);
            for (int c = 0; c < myColumns; c++) {

                String value = xRow.getCell(c).toString();

                rowcol[r][c] = value;
                System.out.print(rowcol[r][c] + "\t\t");
            }
            System.out.println();
        }


    }
}
