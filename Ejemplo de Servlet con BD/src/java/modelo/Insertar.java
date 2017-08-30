/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author RLCR
 */
public class Insertar
{
    
    Connection conexion = null;
    Statement sentencia = null;
    String url = "jdbc:mysql://localhost:3306/empresa";
    String usuario = "root";
    String passwd = "root";
    
    
    public String realizarIngreso(String nombre, String apellido, int edad)
    {
          try{
    
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(url, usuario, passwd);
                sentencia = conexion.createStatement();
                String sql = "INSERT INTO empresa (nombre, apellido, edad)"+ 
                        " values" +
                        " ('" + nombre + "','" + apellido + "','" + edad + "')"; 

                sentencia.executeUpdate(sql);
                
                
                sentencia.close();
                conexion.close();
                return "Datos: " + nombre + ", " + apellido + ", " + edad + 
                        " ingresados con exito";
            }
            catch(ClassNotFoundException | SQLException e)
            {
                return "Error!!: " + e;
            }
         
    
    }
    
    
}
