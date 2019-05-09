/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import connexion.App;
import daoPattern.Docteur;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class DocteurDao {
    
    Connection c = App.getApp().getConn();
    
    public void updateDocteur(Docteur docteur){
        
        try {
            String query = "INSERT INTO DOCTEUR VALUES(?,?,?)";
            PreparedStatement pr = c.prepareStatement(query);
            pr.setInt(1, 0);
            pr.setInt(2, docteur.getNumHopital());
            pr.setString(3,docteur.getSpecialite());
            
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
    
    public void deleteDocteur(Docteur docteur){
        
        try {
            String query  = "DELETE FROM DOCTEUR WHERE NUMDOCTEUR = ? AND NUMHOPITAL = ? AND SPECIALITE = ?";
            PreparedStatement p = c.prepareStatement(query);
            p.setInt(1,docteur.getId());
            p.setInt(2, docteur.getNumHopital());
            p.setString(3, docteur.getSpecialite());
            
            p.executeUpdate();
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
