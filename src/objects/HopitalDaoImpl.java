/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import connexion.App;
import daoPattern.Hopital;

import java.sql.*;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class HopitalDaoImpl {

    Connection con = App.getApp().getConn();

    public List<Hopital> getAllHopitals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Hopital getHopital(int NumHopital) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateHopital(Hopital hopital) {
        try {
            System.out.println("I am inserting now");
            String query = "INSERT INTO HOPITAL VALUES(?,?,?,?)";
            PreparedStatement pr = con.prepareStatement(query);
            pr.setInt(1, 0);
            pr.setString(2, hopital.getNom());
            pr.setString(3, hopital.getAddresse());
            pr.setInt(4, hopital.getDirigeant());
            pr.executeUpdate();
            
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Added !!");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, msg);
        }

    }

    public void deleteHopital(Hopital hopital) {
        try {
            Connection con = App.getApp().getConn();
            String query = "DELETE FROM HOPITAL WHERE NOM = ? AND ADRESSE = ?";
            PreparedStatement pr = con.prepareStatement(query);
            pr.setString(1, hopital.getNom());
            pr.setString(2, hopital.getAddresse());
            pr.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Deleted !!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, msg);
        }
    }

}
