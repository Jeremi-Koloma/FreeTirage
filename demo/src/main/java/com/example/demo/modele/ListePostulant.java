package com.example.demo.modele;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity // Entité
@Table(name = "LISTPOSTULANT") // Un nom pour notre table;
@Getter // Génerer les Getters;
@Setter // Genérer les Setters;
public class ListePostulant {
    @Id // identifier ça comme notre id;
    @GeneratedValue (strategy = GenerationType.IDENTITY) // notre clé primaire et l'Auto-Incrementation;
    private Long idPostulant;

    private Date date;

    private String libelle;

}
