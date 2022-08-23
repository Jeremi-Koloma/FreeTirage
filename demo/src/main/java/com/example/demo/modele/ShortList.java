package com.example.demo.modele;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity // Notre ENTITY.;
@Table(name = "Shortlist") // DOnner un nom à notre ENTITY au niveau de la base de donnée;
@Getter // Generer les Getters;
@Setter // Generer les Setters;

public class ShortList {
    @Id // Generer notre id;
    @GeneratedValue (strategy = GenerationType.IDENTITY) // PRIMARY KEY Auto-Increment;
    private Long idShortList;

    @Column(length = 30)
    private String nom;

    @Column(length = 30)
    private String prenom;

    @Column(length = 15)
    private String numero;

    @Column(length = 100)
    private String email;

    @ManyToOne
    @JoinColumn(name = "idTriage")
    private Tirage tirage;
}
