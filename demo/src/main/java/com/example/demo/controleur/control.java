package com.example.demo.controleur;


import com.example.demo.modele.ListePostulant;
import com.example.demo.modele.participant;
import com.example.demo.repository.participantrepo;
import com.example.demo.service.ServiceListePostulant;
import com.example.demo.service.ShortService;
import com.example.demo.service.serv;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@AllArgsConstructor
@RequestMapping("/control")
public class control {
    @Autowired
    final private serv e1;
    @Autowired
    private final ServiceListePostulant serviceListePostulant;

    @Autowired
    final private participantrepo u1;
    ShortService er;

    //Random r=new Random();
    @GetMapping ("/api/{libelle}")
    public String importexcel(@PathVariable String libelle){
        ListePostulant lp=new ListePostulant();
        lp.setDate(new Date());
        lp.setLibelle(libelle);

        ListePostulant listePostulant= serviceListePostulant.ajouter(lp);

        //ListePostulant listePostulant= serviceListePostulant.creer(libelle, date);
        //e1.lib(libelle);
        List<participant> participantList= e1.nn();

        for(participant p:participantList){
            p.setListePostulant(listePostulant);
            u1.save(p);
        }


        return "Import successfully";
    }
    @GetMapping("/liste/{n}")
    public List<participant> rr(@PathVariable Integer n){


        return e1.r(n);
    }
}
