/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;


import connexion.App;
import daoPattern.PersonnelData;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Asus
 */
public class PersonnelDao {

    Connection con = App.getApp().getConn();

    public void updatePersonnel(PersonnelData personnel) {
        try {
            String query = "INSERT INTO PERSONNEL VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement pr = con.prepareStatement(query);
            pr.setInt(1, 0);
            pr.setInt(2, personnel.getNumHopital());
            pr.setString(3,personnel.getNom());
            pr.setString(4, personnel.getAddresse());
            pr.setString(5, personnel.getTelephone());
            pr.setInt(6, personnel.getSalaire());
            pr.setString(7,personnel.getDateEmbauche());
            pr.setInt(8,personnel.getNumService());
            
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,"Record inserted!!");
            
            pr.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,msg);            
        }
         
    }

    public void deletePersonnel(PersonnelData personnel) {
            try {
            String query = "DELETE FROM PERSONNEL WHERE NUMHOPITAL = ? AND NOM = ?";
                    
            PreparedStatement pr = con.prepareStatement(query);
            
            pr.setInt(1, personnel.getNumHopital());
            pr.setString(2,personnel.getNom());
          
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,"Record deleted!!");
            
            pr.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame,msg);
            
        }
    }
}
