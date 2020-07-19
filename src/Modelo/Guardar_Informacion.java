/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Alejandra Becerra
 */
public class Guardar_Informacion {
    
    String url = "jdbc:mysql://localhost/tallerarq";
    Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement insertar;
    
    
    public Guardar_Informacion(Jugador j) {
        System.out.println("nombre " + j.getNombre());
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        
            Connection c = DriverManager.getConnection (url, "root", "");
            insertar = c.prepareStatement("insert into jugadores (cedula,nombre,apellido,posicion) VALUES(?,?,?,?)");

            insertar.setInt(1, j.getCedula());
            insertar.setString(2, j.getNombre());
            insertar.setString(3, j.getApellido());
            insertar.setString(4, j.getPosicion());

            insertar.executeUpdate ();
            c.close ();
            System.out.println ("Se guardaron los datos");
            
        } catch (Exception e) {
            System.out.println("error " +e);
        }
                      
    }
    
}
