/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import java.sql.*;
import javax.swing.*;
import java.sql.Connection;

import java.sql.DriverManager;



public class connection {
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public static Connection ConnecrDb(){
        try{
            
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinicmanagement","root","");
        //JOptionPane.showMessageDialog(null, "Connection Established.");
        return connection;
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}