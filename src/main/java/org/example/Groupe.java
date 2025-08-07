package org.example;

public class Groupe {
    private String nom;
    private Utilisateur ListeUtilisateur;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Utilisateur getListeUtilisateur() {
        return ListeUtilisateur;
    }

    public void setListeUtilisateur(Utilisateur listeUtilisateur) {
        ListeUtilisateur = listeUtilisateur;
    }
}
