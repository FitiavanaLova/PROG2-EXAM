package org.example;

import java.time.LocalDate;

public class Moderateur extends Utilisateur{


    public Moderateur(String idUtilisateur, String nomUtilisateur, String emailUtilisateur, LocalDate dateCreation) {
        super(idUtilisateur, nomUtilisateur, emailUtilisateur, dateCreation);
    }


    public Commantaire commantaire(Commantaire commantaire) {
        return commantaire;
    }
    public String deleteCommantaire(Commantaire commantaire) {
        return "publication suppreimé";
    }

    public Publication publication(Publication publication) {
        return publication;
    }
    public String deletePublication(Publication publication) {
        return "publication supprimé";
    }
}
