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
public class Acte {

    private int numDoc, numDoss, numHop, frais;
    private String dateActe, desc;

    public Acte(int numDoc, int numDoss, int numHop, int frais, String dateActe, String desc) {
        this.numDoc = numDoc;
        this.numDoss = numDoss;
        this.numHop = numHop;
        this.frais = frais;
        this.dateActe = dateActe;
        this.desc = desc;
    }

    public Acte(int frais, String dateActe, String desc) {
        this.frais = frais;
        this.dateActe = dateActe;
        this.desc = desc;
    }

    public void updateActe() {
        try {
            Connection con = App.getApp().getConn();
            String q = "INSERT INTO ACTE VALUES(?,?,?,?,?,?)";
            PreparedStatement p = con.prepareStatement(q);
            p.setInt(1, this.numDoc);
            p.setInt(2, this.numDoss);
            p.setInt(3, this.numHop);
            p.setString(4, this.dateActe);
            p.setString(5, this.desc);
            p.setInt(6, this.frais);
            p.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Record inserted");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, msg);
        }
    }

    public void deleteActe() {
        try {
            Connection con = App.getApp().getConn();
            String q = "DELETE FROM ACTE WHERE NUMDOCTEUR = ?	AND NUMDOSSIERPATIENT = ? "
                    + "AND NUMHOPITAL = ? AND DATEACTE = ? AND DESCRIPTION = ? AND FRAIS = ?";
            PreparedStatement p = con.prepareStatement(q);
            p.setInt(1, this.numDoc);
            p.setInt(2, this.numDoss);
            p.setInt(3, this.numHop);
            p.setString(4, this.dateActe);
            p.setString(5, this.desc);
            p.setInt(6, this.frais);
            p.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Record deleted");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, msg);
        }
    }
}
