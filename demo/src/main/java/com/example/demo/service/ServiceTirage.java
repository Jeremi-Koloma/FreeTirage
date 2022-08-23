package com.example.demo.service;

import com.example.demo.modele.Tirage;

import java.util.List;

public interface ServiceTirage {
    // Ici on creer nos méthodes;

    // Une méthode qui va retouner Tirage;
    Tirage creer (Tirage tirage);

    // Une méthode qui va retourner une Tirage;
    List<Tirage> lire();

    // Une méthode qui va retourné un Postulant pour le Modifier; // ENTITY Name, Nom de la méthode, (ID, ENTITY)
    Tirage modifier (Long idPostulant, Tirage tirage);

    // Une méthode qui va retourné un STRING pour Suppression; // Avec l'ID ENTITY;
    String supprimer(Long idTirage);
}
