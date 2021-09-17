/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retocuatro;

import java.util.TreeSet;

/**
 *
 * @author Julian Ostos
 */
public class Usuario {
    String telefono;

    public Usuario() {
        
    }

    
    public void addTelefono(String telefono) {
        
        TreeSet<String> telefonos = new TreeSet<String>();
        telefonos.add(telefono);
        
        
        //SortedSet telefono = new TreeSet();
        
    }
    
    public void mostrarTelefonos() {
        for(String g: addTelefono(telefono))
            System.out.println(g);
    }
}
