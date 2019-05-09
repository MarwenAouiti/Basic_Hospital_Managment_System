/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import connexion.App;
import daoPattern.SalleData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class SalleDaoImpl {
    
    Connection con = App.getApp().getConn();
    
    
     public void updateSalle(SalleData salle) {
        try {
            String query = "INSERT INTO SALLE VALUES(?,?,?,?,?)";
            PreparedStatement pr = con.prepareStatement(query);
            pr.setInt(1, 0);
            pr.setInt(2, salle.getNumService());
            pr.setInt(3, salle.getNumHopital());
            pr.setInt(4, salle.getNumServeillant());
            pr.setInt(5, salle.getNbLits());
            pr.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,"Record added");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,msg);
        }
    }
     
     public void deleteSalle(SalleData salle){
          try {
            String query = "DELETE FROM SALLE WHERE NUMSERVICE = ? AND NUMHOPITAL = ? AND SURVEILLANT = ? AND NLBLITS = ?";
            PreparedStatement pr = con.prepareStatement(query);
            pr.setInt(1, salle.getNumService());
            pr.setInt(2, salle.getNumHopital());
            pr.setInt(3, salle.getNumServeillant());
            pr.setInt(4, salle.getNbLits());
            pr.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,"Record deleted");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,msg);
        }
     }
}
