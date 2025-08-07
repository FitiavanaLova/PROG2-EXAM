package org.example;

import java.time.LocalDate;

public class Publication {
    public Utilisateur nom;
    public Utilisateur email;
    public LocalDate dateCreation;
    public String publication;
    public Commantaire commantaire;

    public Publication(Utilisateur nom, Utilisateur email, LocalDate dateCreation, String publication, Commantaire commantaire) {
        this.nom = nom;
        this.email = email;
        this.dateCreation = dateCreation;
        this.publication = publication;
        this.commantaire = commantaire;
    }


}
