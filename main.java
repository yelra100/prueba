/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retocuatro;

/**
 *
 * @author Julian Ostos
 */
public class main {
    public static void main(String[] args) {
            
            Usuario u = new Usuario();
            u.addTelefono("1111111");
            u.addTelefono("2222222");
            u.addTelefono("3333333");
            u.addTelefono("3333333");

            u.mostrarTelefonos();              
            }
}
