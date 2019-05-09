/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoPattern;

import connexion.App;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Administratif {

    private int numAdmin, numHopital;
    private String poste, qualification;

    public Administratif(int numAdmin, int numHopital, String poste, String qualification) {
        this.numAdmin = numAdmin;
        this.numHopital = numHopital;
        this.poste = poste;
        this.qualification = qualification;
    }

    public Administratif(int numHopital, String poste, String qualification) {
        this.numHopital = numHopital;
        this.poste = poste;
        this.qualification = qualification;
    }

    public int getNumAdmin() {
        return numAdmin;
    }

    public int getNumHopital() {
        return numHopital;
    }

    public String getPoste() {
        return poste;
    }

    public String getQualification() {
        return qualification;
    }

    public void updateAdmin() {
        try {
            Connection conn = App.getApp().getConn();
            String query = "INSERT INTO ADMINISTRATIF VALUES(?,?,?,?)";
            
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, 0);
            pr.setInt(2, this.numHopital);
            pr.setString(3, this.poste);
            pr.setString(4, this.qualification);
            
            pr.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,"Record was inserted sucessfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,msg);
        }
    }
    
     public void deleteAdmin() {
        try {
            Connection conn = App.getApp().getConn();
            String query = "DELETE FROM ADMINISTRATIF WHERE NUMADMINISTRATIF = ? AND NUMHOPITAL = ?"
                    + "AND POST = ? AND QUALIFICATION = ?";
            
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, this.numAdmin);
            pr.setInt(2, this.numHopital);
            pr.setString(3, this.poste);
            pr.setString(4, this.qualification);
            
            pr.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,"Record was deleted sucessfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,msg);
        }
    }
}
