package org.example;

import java.time.LocalDate;

public class Utilisateur {
    private String label;
    private String nomUtilisateur;
    private String emailUtilisateur;
    private LocalDate dateCreation;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getEmailUtilisateur() {
        return emailUtilisateur;
    }

    public void setEmailUtilisateur(String emailUtilisateur) {
        this.emailUtilisateur = emailUtilisateur;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }


    public Utilisateur(String idUtilisateur, String nomUtilisateur, String emailUtilisateur, LocalDate dateCreation) {
        this.label = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.emailUtilisateur = emailUtilisateur;
        this.dateCreation = dateCreation;
    }
    public Publication publication(Publication publication) {
        return publication;
    }
    public Commantaire commantaire(Commantaire commantaire) {
        return commantaire;
    }

    }




