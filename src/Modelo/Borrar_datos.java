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

/**
 *
 * @author Alejandra Becerra
 */
public class Borrar_datos {

    String url = "jdbc:mysql://localhost/tallerarq";
    Connection conexion;
    PreparedStatement insertar;
    
    
    public Borrar_datos(int cedula) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection (url, "root", "");
            
            insertar = conexion.prepareStatement("DELETE FROM jugadores WHERE cedula= " + cedula);
            insertar.executeUpdate();
            
            conexion.close();
            System.out.println("Se ha borrado la cedula " + cedula);
            
        } catch (Exception e) {
            System.out.println("Error Borrar " +e);
        }
    }
    
    
}
