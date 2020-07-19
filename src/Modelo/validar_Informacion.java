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
public class validar_Informacion {
    ArrayList cedulas = new ArrayList();
    
    String url = "jdbc:mysql://localhost/tallerarq";
    Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement insertar;

    public validar_Informacion() {
        validar_cedula();
    }
    
    
    
    public ArrayList validar_cedula(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(url, "root", "");
            
            st = conexion.createStatement();
            rs = st.executeQuery("select * from jugadores");
            
            while (rs.next()){
                cedulas.add(Integer.toString((int) rs.getObject(1)));
            }
            
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return cedulas;
    }
    
    
    public static void main(String[] args) {
        new validar_Informacion();
        
    }
}
