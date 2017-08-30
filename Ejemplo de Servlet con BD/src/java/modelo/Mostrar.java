/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author RLCR
 */
public class Mostrar 
{
    Connection conexion = null;
    Statement sentencia = null;
    String url = "jdbc:mysql://localhost:3306/empresa";
    String usuario = "root";
    String passwd = "root";
    ResultSet resultados = null;
    
    
    public ArrayList mostrarDatos()
    {
          ArrayList<String> vector = new ArrayList<>();
          
          try{
    
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(url, usuario, passwd);
                sentencia = conexion.createStatement();
                String sql = "select * from empresa"; 
                
                resultados = sentencia.executeQuery(sql);
                

                while(resultados.next())
                {
                    vector.add(Integer.toString(resultados.getInt("id")));
                    vector.add(resultados.getString("nombre"));
                    vector.add(resultados.getString("apellido"));
                    vector.add(resultados.getString("edad"));  
                }
                
                
                sentencia.close();
                conexion.close();
                return  vector;
            }
            catch(ClassNotFoundException | SQLException e)
            {
                System.out.println("Error!!" + e);
            }
          
          
          return null;
    
    }
    
}
