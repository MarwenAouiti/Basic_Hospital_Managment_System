/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoPattern;

/**
 *
 * @author Asus
 */
public class PersonnelData {

    private int numService, numHopital, salaire;
    private String nom, addresse, telephone, dateEmbauche;

    public PersonnelData(int numService, int numHopital, int salaire, String nom, String addresse, String telephone, String dateEmbauche) {
        this.numService = numService;
        this.numHopital = numHopital;
        this.salaire = salaire;
        this.nom = nom;
        this.addresse = addresse;
        this.telephone = telephone;
        this.dateEmbauche = dateEmbauche;
    }

    public PersonnelData(int numHopital, String nom) {
        this.numHopital = numHopital;
        this.nom = nom;
    }
    

    public int getNumService() {
        return numService;
    }

    public int getNumHopital() {
        return numHopital;
    }

    public int getSalaire() {
        return salaire;
    }

    public String getNom() {
        return nom;
    }

    public String getAddresse() {
        return addresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void setNumService(int numService) {
        this.numService = numService;
    }

    public void setNumHopital(int numHopital) {
        this.numHopital = numHopital;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    
    

}
