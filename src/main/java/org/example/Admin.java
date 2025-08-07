package org.example;

import java.time.LocalDate;

public class Admin extends Utilisateur{
    public  Admin(String idUtilisateur, String nomUtilisateur, String emailUtilisateur, LocalDate dateCreation) {
        super(idUtilisateur, nomUtilisateur, emailUtilisateur, dateCreation);
    }
}
