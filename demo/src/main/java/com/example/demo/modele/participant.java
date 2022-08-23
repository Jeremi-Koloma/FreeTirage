package com.example.demo.modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String prenom;
    private String nom;
    private String mail;

    @ManyToOne
    @JoinColumn(name = "idPostulant")
    private ListePostulant listePostulant;


    public participant(String nom, String prenom, String mail,ListePostulant li) {
        this.nom=nom;
        this.prenom=prenom;
        this.mail=mail;
        this.listePostulant=li;
    }

    public participant() {

    }
}
