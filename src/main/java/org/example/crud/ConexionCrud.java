package org.example.crud;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionCrud {
    Connection conectar= null;

    //    String usuario ="root";
//    String contrasenia= "17935906";
//    String bd = "dbprogra2a";
//    String ip  ="localhost";
//    String puerto ="3306";
//
//    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    public Connection estableceConexion() {
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            conectar= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpersona","root","17935906");
            System.out.println("CONEXION EXITOSA!!!");

        } catch (Exception e) {
            System.out.println("ERROR AL CONECTARSE A LA BASE DE DATOS" + e.toString());
        }
        return conectar;
    }
}
