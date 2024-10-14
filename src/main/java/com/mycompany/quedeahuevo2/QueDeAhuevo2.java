/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quedeahuevo2;

/**
 *
 * @author aries
 */
public class QueDeAhuevo2 {

    public static void main(String[] args) {
        BaseDatos bd = new BaseDatos();
        Connection cnx = bd.getConexion();
    }
}
