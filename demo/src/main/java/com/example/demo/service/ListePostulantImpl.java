package com.example.demo.service;

import com.example.demo.modele.ListePostulant;
import com.example.demo.repository.RepositoryListePostulant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// Cette classe va étendre de l'interface ServiceListePolutant;
@Service // Identifier la classe comme étant un Service métier;
@AllArgsConstructor // Un constructeur avec tous les arguments; pour l'injection de notre Interface RepositoryListeP;
public class ListePostulantImpl implements ServiceListePostulant {
    // on Implemente nos méthodes ici on a une seule méthode dans dépuis l'interface ServiceListePostulant;

    //Injectons notre Repository;
    private final RepositoryListePostulant repositoryListePostulant;
    //Méthode implémenter depuis l'interface ServiceListePostulant;
    @Override
    public List<ListePostulant> lire() {
        return repositoryListePostulant.findAll();
    }

    @Override
    public void creer(String lib, String date) {
        repositoryListePostulant.find(lib,date);
    }

    @Override
    public ListePostulant  ajouter(ListePostulant listePostulant){
        return repositoryListePostulant.save(listePostulant);
    }
}
