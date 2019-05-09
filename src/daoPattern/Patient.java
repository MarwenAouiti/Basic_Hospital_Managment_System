/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoPattern;

import connexion.App;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Patient {

    private int numHopital, numService, numDossier, montant, numMutuelle;
    private String maladie, nom, addresse, telephone;

    public Patient(int numDossier, int numHopital, int numService,
                    String nom, String addresse, 
                    String telephone, int montant, 
                    int numMutuelle, String maladie){
        this.numHopital = numHopital;
        this.numService = numService;
        this.numDossier = numDossier;
        this.montant = montant;
        this.numMutuelle = numMutuelle;
        this.maladie = maladie;
        this.nom = nom;
        this.addresse = addresse;
        this.telephone = telephone;
    }

    public Patient(int numHopital, int numService,
                    String nom, String addresse, 
                    String telephone, int montant, 
                    int numMutuelle, String maladie) {
        this.numHopital = numHopital;
        this.numService = numService;
        this.montant = montant;
        this.numMutuelle = numMutuelle;
        this.maladie = maladie;
        this.nom = nom;
        this.addresse = addresse;
        this.telephone = telephone;
    }

    public void updatePatient() {

        try {
            Connection con = App.getApp().getConn();
            String query1 = "INSERT INTO PATIENT VALUES(?,?,?,?,?,?,?,?,?)";

            PreparedStatement p = con.prepareStatement(query1);
            p.setInt(1, 0);
            p.setInt(2, this.numHopital);
            p.setInt(3, this.numService);
            p.setString(4, this.nom);
            p.setString(5, this.addresse);
            p.setString(6, this.telephone);
            p.setInt(7, this.montant);
            p.setInt(8, this.numMutuelle);
            p.setString(9, this.maladie);

            p.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Record was inserted sucessfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, msg);
        }
    }

    public void deletePatient() {
                try {
            Connection con = App.getApp().getConn();
            String query1 = "DELETE FROM PATIENT WHERE "
                    + "NUMDOSSIER = ? AND NUMHOPITAL = ? AND NUMSERVICE = ? AND"
                    + "	NOM = ? AND ADRESSE = ? AND TELEPHONE = ? AND MONTANTPAYE = ? AND"
                    + "	NUMMUTUELLE = ? AND DESCRIPTIONMALADIE = ?";

            PreparedStatement p = con.prepareStatement(query1);
            p.setInt(1, this.numDossier);
            p.setInt(2, this.numHopital);
            p.setInt(3, this.numService);
            p.setString(4, this.nom);
            p.setString(5, this.addresse);
            p.setString(6, this.telephone);
            p.setInt(7, this.montant);
            p.setInt(8, this.numMutuelle);
            p.setString(9, this.maladie);

            p.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Record was DELETED sucessfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, msg);
        }
    }
}
