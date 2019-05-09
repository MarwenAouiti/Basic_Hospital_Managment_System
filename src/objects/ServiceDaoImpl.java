/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import connexion.App;
import daoPattern.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ServiceDaoImpl {

    Connection con = App.getApp().getConn();

    public List<Service> getAllServices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Service getHopital(int numService) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateService(Service service) {
        try {
            String query = "INSERT INTO SERVICE VALUES(?,?,?,?,?)";
            PreparedStatement pr = con.prepareStatement(query);
            pr.setInt(1, 0);
            pr.setInt(2, service.getNumHopital());
            pr.setString(3, service.getNomService());
            pr.setInt(4, service.getNumBloc());
            pr.setInt(5, service.getDirecteur());
            pr.executeUpdate();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, "Record Added");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String msg = ex.getMessage();
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            JOptionPane.showMessageDialog(frame, msg);
        }
    }

    public void deleteService(Service service) {
        try {
            Connection conn = App.getApp().getConn();
            String query = "DELETE FROM SERVICE WHERE NOM = ? AND NUMHOPITAL = ?";
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1, service.getNomService());
            pr.setInt(2, service.getNumHopital());
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
