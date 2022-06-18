
package com.connection;
import java.sql.*;


public class ConnectionBase {

    
    public static void main(String[] args){
        try{
        //Class.forme est une methode qui permet de charger le JDBC.Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //la methode getConnection permet de placer la chaine de connexion
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connexionjdbc","root"," ");
        //la methode createStatement permet de creer une instance qui sera utiliser pour 
        //executer des requetes SQL en utilisant le code.
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("jdbcs");
        System.out.println("connecter");
        }catch(Exception e)
        {
           e.printStackTrace();
        }
    }
    
}
