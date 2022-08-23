package com.example.demo.service;

import com.example.demo.modele.participant;
import com.example.demo.repository.RepositoryListePostulant;
import com.example.demo.repository.participantrepo;
import lombok.AllArgsConstructor;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
@AllArgsConstructor
public class serv {
    @Autowired
    final private participantrepo u1;
    @Autowired
    final private RepositoryListePostulant u2;


    List<participant> et=new ArrayList<>();
    public List<participant> nn(){
        //int id = 0;

        String nom="";
        String prenom="";
        String mail="";
        InputStream input= null;
        try {
            input = new FileInputStream("exo.xls");
            POIFSFileSystem fs=new POIFSFileSystem(input);
            HSSFWorkbook wb=new HSSFWorkbook(fs);
            HSSFSheet sheet= wb.getSheetAt(0);
            Iterator rows= sheet.rowIterator();
            //int j = 0;
            while (rows.hasNext()){
                HSSFRow row= (HSSFRow) rows.next();
                Iterator cells=row.cellIterator();
                int i=0;
                while (cells.hasNext()){

                    HSSFCell cell= (HSSFCell) cells.next();
                    /*if (i==0){
                        id= (int) cell.getNumericCellValue();
                    }*/
                    if (i==0){
                        nom=  cell.getStringCellValue();
                    }
                    else if (i==1){
                        prenom=  cell.getStringCellValue();
                    }
                    else if (i==2){
                        mail=  cell.getStringCellValue();
                    }
                    i++;

                }
                participant p = new participant(nom,prenom,mail,null);
                //u1.save(p);
                et.add(p);

                //j++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    return et;

    }
    public List<participant> r(Integer o) {
       // nn();
        List<participant>l1=u1.findAll();
        List<participant> eo = new ArrayList<>();
        for (int i = 0; i < o; i++) {
            int randomIndex = (int) (Math.random() * l1.size());
            eo.add(l1.get(randomIndex));
        }

        return eo;
    }

    public String lib(String li){
        return li;
    }
}
