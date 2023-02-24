package cydeo.tests;

import io.cucumber.java.en.Then;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExelRead {
    @Test
    public void read_from_excel_file() throws IOException {
        String path = "SampleData.xlsx";


        //to read from excel we need to load it to file input stream
        FileInputStream fileInputStream = new FileInputStream(path);

        // workbook>sehhet>row>cell
        //create a workbook

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //the we need to ger specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        //and select row and cell
        //print out marrys cell
        //index start from 0
        System.out.println(sheet.getRow(1).getCell(0));

        //print out developer
        System.out.println(sheet.getRow(3).getCell(2));


        //Return the count of used cells only
        //starts counting from 1
        int usedRow = sheet.getPhysicalNumberOfRows();
        System.out.println(usedRow);




        //Returns the number from top to cell bottom to cell
        //it doesnt care if the cell is empty or not
        //starts counting from 0
        int lastUsedRows = sheet.getLastRowNum();
        System.out.println(lastUsedRows);



        //TODO: create a logic to print vinods name

        for(int rowNum=0; rowNum<usedRow; rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")){
                System.out.println(sheet.getRow(rowNum).getCell(0));

            }
        }


        //TODO: Create a logic to print out Linda's JobID
        //check if name is linda print out jobID of Linda

        for(int rowNum=0; rowNum<usedRow; rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Linda")){
                System.out.println(sheet.getRow(rowNum).getCell(2));

            }
        }



    }






}
