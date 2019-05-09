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
public class Service {
    
    private int numHopital, numBloc, directeur;
    private String nomService;

    public Service(int numHopital, String nomService, int numBloc, int directeur) {
        this.numHopital = numHopital;
        this.numBloc = numBloc;
        this.directeur = directeur;
        this.nomService = nomService;
    }


    public int getNumHopital() {
        return numHopital;
    }

    public int getNumBloc() {
        return numBloc;
    }

    public int getDirecteur() {
        return directeur;
    }

    public String getNomService() {
        return nomService;
    }


    public void setNumHopital(int numHopital) {
        this.numHopital = numHopital;
    }

    public void setNumBloc(int numBloc) {
        this.numBloc = numBloc;
    }

    public void setDirecteur(int directeur) {
        this.directeur = directeur;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }
    
    
    
}
