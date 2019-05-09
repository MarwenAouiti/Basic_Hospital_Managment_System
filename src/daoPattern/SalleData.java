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
public class SalleData {
    
    private int numService,numHopital,numServeillant,nbLits;

    public SalleData(int numService, int numHopital, int numServeillant, int nbLits) {
        this.numService = numService;
        this.numHopital = numHopital;
        this.numServeillant = numServeillant;
        this.nbLits = nbLits;
    }

    public int getNumService() {
        return numService;
    }

    public int getNumHopital() {
        return numHopital;
    }

    public int getNumServeillant() {
        return numServeillant;
    }

    public int getNbLits() {
        return nbLits;
    }

    public void setNumService(int numService) {
        this.numService = numService;
    }

    public void setNumHopital(int numHopital) {
        this.numHopital = numHopital;
    }

    public void setNumServeillant(int numServeillant) {
        this.numServeillant = numServeillant;
    }

    public void setNbLits(int nbLits) {
        this.nbLits = nbLits;
    }
    
}
