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
public class Docteur {
    private int id;
    private String specialite;
    private int numHopital;

    public Docteur(int id, String specialite, int numHopital) {
        this.id = id;
        this.specialite = specialite;
        this.numHopital = numHopital;
    }

    public int getId() {
        return id;
    }
    
    
    public Docteur(String specialite, int numHopital) {
        this.specialite = specialite;
        this.numHopital = numHopital;
    }
    
    
    
    public String getSpecialite() {
        return specialite;
    }

    public int getNumHopital() {
        return numHopital;
    }
    
    
    
}
