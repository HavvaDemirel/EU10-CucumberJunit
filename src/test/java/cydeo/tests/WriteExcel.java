package cydeo.tests;

import io.cucumber.java.en.Then;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    String filePath = "SampleData.xlsx";
    XSSFWorkbook workbook;
    XSSFSheet sheet;

    @Test
    public void excel_write() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);

        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("Employees");


        XSSFCell salaryCell = sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");

        XSSFCell salary = sheet.getRow(1).createCell(3);

        salary.setCellValue(200000);
        XSSFCell salary2 = sheet.getRow(2).createCell(3);

        salary2.setCellValue(250000);
        XSSFCell salary3 = sheet.getRow(3).createCell(3);

        salary3.setCellValue(300000);
        XSSFCell salary4 = sheet.getRow(4).createCell(3);

        salary4.setCellValue(280000);

//TODO: change mary's last name to Jones

        for (int rowNum=0; rowNum<sheet.getLastRowNum(); rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Mary")){
                sheet.getRow(rowNum).getCell(1).setCellValue("Jones");


            }
        }


        // open to write to the file : FileInoutStream ___> reading
        //save the changes :FileOutputStream ----> writing

        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
        fileInputStream.close();


    }
}
