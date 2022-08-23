package com.example.demo.controleur;

import com.example.demo.modele.ListePostulant;
import com.example.demo.service.ServiceListePostulant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // identifier la classe comme un controller;
@RequestMapping("/listePostulant") // le nom de notre path ou le lien pour le Navigateur;
@AllArgsConstructor // Un constructeur avec tous les arguments pour l'injection de notre ServiceListePostulant;
public class ListePostulantController {

    // injecter notre ServiceListPostulant;
    private final ServiceListePostulant serviceListePostulant;
    @GetMapping("/liste") // le nom pour le mapping;
   public List<ListePostulant> read(){
        return serviceListePostulant.lire();
    }
}
