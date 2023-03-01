/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;


import java.sql.*;
import java.util.Properties;

/**
 *
 * @author joey.hossaert
 */
public class ConnectPostgreSQL {
    
    /**
     *
     */
    public Connection con;

    /**
     *
     * @param args
     */
    public void main() {
        try {
            String url = "jdbc:postgresql://192.168.11.65/aeroclub";
            Properties props = new Properties();
            props.setProperty("user", "app");
            props.setProperty("password", "ua95qI0eTN^Y8@99a8@a5pF3Tyw96");
            this.con = DriverManager.getConnection(url, props);
            System.out.print(this.con);
        } catch (SQLException e) {
            this.con = null;
            System.err.println("Une erreur s'est produite lors de la tentative de connexion à la base de données : " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     *
     * @return Connection
     */
    public Connection getcon() {
        return this.con;
    }
    
    /**
     *
     * @return boolean
     */
    public boolean verifyConnection() {
        return this.con == null ? false : true;
    }
}
