package com.example.demo.service;

import com.example.demo.modele.ListePostulant;

import java.util.List;

// une méthode qui va nous retourner une liste;
public interface ServiceListePostulant {
    List<ListePostulant> lire();

    public void creer(String lib,String date);

    ListePostulant ajouter(ListePostulant listePostulant);
}
