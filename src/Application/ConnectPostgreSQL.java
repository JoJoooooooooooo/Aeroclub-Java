/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;


import java.sql.*;
/**
 *
 * @author joey.hossaert
 */
public class ConnectPostgreSQL {
      public static void main(String args[])
  {
    try
    {
      //étape 1: charger la classe de driver
      Class.forName("org.postgresql.Driver");
        //étape 3: créer l'objet statement
        try ( //étape 2: créer l'objet de connexion
                Connection conn = DriverManager.getConnection(
                        "jdbc:postgresql://10.21.76.252:5432/aeroclub","appLourde","aero")) {
            //étape 3: créer l'objet statement
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM avions");
            //étape 4: exécuter la requête
            while (res.next()) {
                System.out.println(res.getInt(1)+"  "+res.getString(2)
                        +"  "+res.getString(3));
            }
            //étape 5: fermez l'objet de connexion
        }
    }
    catch(ClassNotFoundException | SQLException e){ 
      System.out.println(e);
    }
  }
}
