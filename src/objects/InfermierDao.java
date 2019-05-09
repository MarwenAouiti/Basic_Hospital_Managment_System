/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import connexion.App;
import daoPattern.Infermier;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class InfermierDao {

    Connection conn = App.getApp().getConn();

    public void updateInfermier(Infermier infermier) {

        try {
            String query = "INSERT INTO INFIRMIER VALUES(?,?,?)";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, 0);
            pr.setInt(2, infermier.getNumHopital());
            pr.setString(3, infermier.getFonction());

            pr.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Record added!!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, msg);
        }

    }

    public void deleteInfermier(Infermier infermier) {
        try {
            String query = "DELETE FROM INFIRMIER WHERE NUMINFIRMIER = ? AND NUMHOPITAL = ? AND FONCTION = ?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setInt(1, infermier.getNumInfirmier());
            pr.setInt(2, infermier.getNumHopital());
            pr.setString(3, infermier.getFonction());

            pr.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Record deleted!!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, msg);
        }
    }
}
