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
public class Infermier {
    private int numHopital, numInfirmier;
    private String fonction;

    public Infermier(int numInfirmier, int numHopital, String fonction) {
        this.numHopital = numHopital;
        this.numInfirmier = numInfirmier;
        this.fonction = fonction;
    }

    public Infermier(int numHopital, String fonction) {
        this.numHopital = numHopital;
        this.fonction = fonction;
    }

    

    public int getNumHopital() {
        return numHopital;
    }

    public int getNumInfirmier() {
        return numInfirmier;
    }

    public String getFonction() {
        return fonction;
    }
    
    
}
