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

    public DevData(int id, String Developpeur, String prenom) {
        this.Developpeur = Developpeur;
        this.Jour = Jour;
        this.NbScripts = NbScripts;
    
    }


    public int getNbScripts() {
        return NbScripts;
    }

    public void setNbScripts(int NbScripts) {
        this.NbScripts = NbScripts;
    }

    public String getDeveloppeur() {
        return Developpeur;
    }

    public void setDeveloppeur(String Developpeur) {
        this.Developpeur = Developpeur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

 

  

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", date=" + date + '}';
    }
    
    
    
}
