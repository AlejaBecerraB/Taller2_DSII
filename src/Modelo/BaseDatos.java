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
public class BaseDatos {
    String url = "jdbc:mysql://localhost/mysql";
    String url1 = "jdbc:mysql://localhost/tallerarq";
    Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement insertar;
    
    public BaseDatos() {
        crear_base();
        tablas();
    }
    private void crear_base(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(url, "root", "");
            insertar = conexion.prepareStatement("create database tallerarq");
            insertar.executeUpdate();

        } catch (java.sql.SQLException es) {
            System.out.println(es);
            String creada = "java.sql.SQLException";
            if (!creada.equalsIgnoreCase("java.sql.SQLException")) {
                System.out.println("La Base de datos ya existe");
            }
        } catch (Exception e) {
            System.out.println("El error es " + e);
        }
    }
    
    private void tablas() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(url1, "root", "");
            insertar = conexion.prepareStatement("create table jugadores (cedula int primary key,nombre varchar(30),apellido varchar(30),posicion varchar(30))");
            insertar.executeUpdate();
            conexion.close();
            
        } catch (Exception e) {
            
            System.out.println("e " + e);
            String error = "com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException";
            if (error.equalsIgnoreCase("com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException")) {
                System.out.println("La tabla jugadores ya existe");
            } else {
                System.out.println("El error: " + error);
            }
        }
    }
}
