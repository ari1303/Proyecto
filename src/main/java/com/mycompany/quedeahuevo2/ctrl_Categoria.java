package com.mycompany.quedeahuevo2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author aries
 */
public class ctrl_Categoria {
    public boolean guardar (Categoria objeto){
        boolean respuesta = false;
        BaseDatos bd = new BaseDatos();
        
        Connection cnx = bd.getConexion();
        try {
            PreparedStatement consulta = cnx.prepareStatement("");///cueri de la bce de datos//
            consulta.setInt(1,0);
            consulta.setString(2, objeto.getDescripcion());
            
        }catch (SQLException e){
            System.out.println("Error al Guardar Categoria: " + e);
        }
        return false;
    }
}    

        
        
  
