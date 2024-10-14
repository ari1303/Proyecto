package com.mycompany.quedeahuevo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aries
 */
public class BaseDatos {
    private Connection conexion;
        
        public BaseDatos(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String usuario = "root";
                String password = "";
                String bd = "quedeahuevo";
                String url ="jdbc:mysql://127.0.0.1:3306/"+bd+"?serverTimezone=UTC";
                conexion = DriverManager.getConnection(url,usuario,password);
                System.out.println("Conexion exitosa a mysql");
            }catch(ClassNotFoundException ex){
                System.out.println("Error, no existe clase");   
            }catch(SQLException ex){
                System.out.println("Error de conexion");
            }    
        }
        
        
        public Connection getConexion(){
            return conexion;
        }
    
}
