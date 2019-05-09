/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoPattern;

import connexion.App;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class PatientHospitalise {

    private int numPatient, numSalle, numLit;
    private String entre, sortie;

    public PatientHospitalise(int numPatient, int numSalle, int numLit, String entre, String sortie) {
        this.numPatient = numPatient;
        this.numSalle = numSalle;
        this.numLit = numLit;
        this.entre = entre;
        this.sortie = sortie;
    }

    public PatientHospitalise(int numSalle, int numLit, String entre, String sortie) {
        this.numSalle = numSalle;
        this.numLit = numLit;
        this.entre = entre;
        this.sortie = sortie;
    }

    public void updatePatientHospitalise() {
        try {
            Connection conn = App.getApp().getConn();
            String query = "INSERT INTO PATIENTHOSPITALISE VALUES(?,?,?,?,?)";

            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, 0);
            pr.setInt(2, this.numSalle);
            pr.setInt(3, this.numLit);
            pr.setString(4, this.entre);
            pr.setString(5, this.sortie);

            pr.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Record was inserted sucessfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, msg);
        }
    }

    public void deletePatientHospitalise() {
        try {
            Connection conn = App.getApp().getConn();
            String query = "DELETE FROM PATIENTHOSPITALISE WHERE "
                    + "NUMPATIENTHOSPITALISE = ? AND NUMSALLE = ? AND NUMLIT = ? AND DATEENTREE = ? AND DATESORIE = ?";

            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, this.numPatient);
            pr.setInt(2, this.numSalle);
            pr.setInt(3, this.numLit);
            pr.setString(4, this.entre);
            pr.setString(5, this.sortie);

            pr.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Record was deleted sucessfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, msg);
        }
    }
}
