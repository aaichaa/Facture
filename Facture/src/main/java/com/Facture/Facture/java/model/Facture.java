package com.Facture.Facture.java.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  N_Facture;
    @Column(nullable = false)
    private String DateFac;
    @Column(nullable = false)
    private int montant;
    @Column(nullable = false)
    private int n_client;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;
    @Column(nullable = false)
    private String adresse;



}
