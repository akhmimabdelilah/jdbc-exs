/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;

/**
 *
 * @author Bright
 */
public class DevData {
    private String Developpeur;
    private String Jour;
    private int NbScripts;

    public DevData(int id, String nom, String prenom) {
        this.Developpeur = Developpeur;
        this.nom = nom;
        this.prenom = prenom;
    
    }

    public DevData(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    
    }

    public int getId() {
        return Developpeur;
    }

    public void setId(int id) {
        this.Developpeur = Developpeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate() {
        return date;
    }

  

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", date=" + date + '}';
    }
    
    
    
}
