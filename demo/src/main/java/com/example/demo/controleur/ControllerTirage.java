package com.example.demo.controleur;
import com.example.demo.modele.Tirage;
import com.example.demo.service.ServiceTirage;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Identifier la classe comme un Controller;
@RequestMapping // le nom du Path ou pour le Navigateur;
@AllArgsConstructor
public class ControllerTirage {
    // injection de notre ServicePostulant;
    private final ServiceTirage serviceTirage;

    // Controller pour la méthode Ajouter;
    @PostMapping("/create") // Pour une requête de type (POST) // public ENTITY avec param (ENTITY entity)
    public Tirage create(@RequestBody Tirage tirage){ // pour envoyé de donné de body dans l'Entity;
        return serviceTirage.creer(tirage);
    }

    // Controller pour méthode Lire;
    @GetMapping("/read")
    public List<Tirage> read(){ // pour une requête de type (GET)
        return serviceTirage.lire();
    }

    // Controller pour la méthode Modifier;
    @PutMapping("/update/{idTirage}")
    public Tirage update(@PathVariable Long idTirage, @RequestBody Tirage tirage){ // public Entity, un Nom de méthode, avec par (ID Entity, ENTITY entity)
        return serviceTirage.modifier(idTirage,tirage); // idEntity et Entity;
    }

    // Controller pour la méthode Supprimer;
    @DeleteMapping("/delete/{idTirage}")
    public String delete(@PathVariable Long idTirage){ // public String, nom methode, avec param(Id Entity)
        return serviceTirage.supprimer(idTirage);
    }
}
