package org.example;

import java.time.LocalDate;

public class Commantaire {
    public Utilisateur nom;
    public String commantaire;
    public LocalDate dateCreation;

    public Commantaire(Utilisateur nom, String commantaire, LocalDate dateCreation) {
        this.nom = nom;
        this.commantaire = commantaire;
        this.dateCreation = dateCreation;
    }


}
