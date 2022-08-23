/*package com.example.demo.excel;

import com.example.demo.modele.participant;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class excelexple {
    public List<participant> getall(){
        List<participant> et=new ArrayList<>();
         int id = 0;
         String nom="";
         String prenom="";
         String mail="";
         String excelFilePath="C:\\Users\\fddembele\\Desktop\\exo.xlsx";
        FileInputStream inputStream;
        try {
            inputStream=new FileInputStream(excelFilePath);
            Workbook workbook=new HSSFWorkbook(inputStream);
            Sheet firstsheet=workbook.getSheetAt(0);
            Iterator<Row> rowIterator=firstsheet.iterator();
            rowIterator.next();
            while (rowIterator.hasNext()){
                Row nextRow=rowIterator.next();
                Iterator<Cell> cellIterator=nextRow.cellIterator();
                while (cellIterator.hasNext()){
                    Cell nextCell= cellIterator.next();
                    int columnIndex=nextCell.getColumnIndex();
                    switch (columnIndex){
                        case 0:
                            id= (int) nextCell.getNumericCellValue();
                            System.out.println(id);
                            break;
                        case 1:
                            nom=nextCell.getStringCellValue();
                            System.out.println(nom);
                            break;
                        case 2:
                            prenom=nextCell.getStringCellValue();
                            System.out.println(prenom);
                            break;
                        case 3:
                            mail=nextCell.getStringCellValue();
                            System.out.println(mail);
                            break;
                    }
                    et.add(new participant(id,nom,prenom,mail));

                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





        return et;
    }
}*/
