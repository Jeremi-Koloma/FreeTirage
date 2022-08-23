package com.example.demo.service;

import com.example.demo.modele.Tirage;
import com.example.demo.repository.RepositoryTirage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service // On identifie la classe comme étant un service métier;
@AllArgsConstructor
public class ServiceTirageImpl implements ServiceTirage{
    private final RepositoryTirage repositoryTirage;

    // On implémente nos 04 méthodes; // Méthode CREATE
    @Override
    public Tirage creer(Tirage tirage) { // pour la persistance des données dans la base de donnée;
        return repositoryTirage.save(tirage); // méthode (Save) pour enregristement dans la base de donnée;
    }

    @Override   // Méthode READ
    public List<Tirage> lire() { // la méthode (findAll) pour la lecture ou liste des postulants;
        return repositoryTirage.findAll();
    }

    @Override // Méthode UPDATE
    public Tirage modifier(Long idTirage, Tirage tirage) {
        return repositoryTirage.findById(idTirage) // Cherchons par ID si on trouve,
                .map(p->{ // Si on trouve, on fait le mappage
                    p.setDate(tirage.getDate());
                    p.setLibelle(tirage.getLibelle());
                    return repositoryTirage.save(p);
                }).orElseThrow(()-> new RuntimeException("Tirage non trouvé !"));
    }

    @Override // Méthode DELETE
    public String supprimer(Long idTirage) {
        repositoryTirage.deleteById(idTirage); // Supprimer l'ID;
        return "Tirage Supprimer !";
    }
}
