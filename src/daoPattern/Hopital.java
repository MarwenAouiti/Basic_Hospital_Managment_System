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
public class Hopital {

    private int NumHopital;
    private int Dirigeant;
    private String Nom, Addresse;

    public Hopital(String Nom, String Addresse, int Dirigeant) {
        this.Dirigeant = Dirigeant;
        this.Nom = Nom;
        this.Addresse = Addresse;
    }

    public void setNumHopital(int NumHopital) {
        this.NumHopital = NumHopital;
    }

    public void setDirigeant(int Dirigeant) {
        this.Dirigeant = Dirigeant;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setAddresse(String Addresse) {
        this.Addresse = Addresse;
    }

    public int getNumHopital() {
        return NumHopital;
    }

    public int getDirigeant() {
        return Dirigeant;
    }

    public String getNom() {
        return Nom;
    }

    public String getAddresse() {
        return Addresse;
    }

}
