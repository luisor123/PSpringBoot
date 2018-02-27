/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PSpringBoot.PSpringBoot.servicio;

import org.springframework.stereotype.Service;

/**
 *
 * @author LUIS ORTIZ
 */

@Service//Le indicamos que es un servicio
public class IndexServicio implements IIndexServicio{

    @Override//porque es una implementación de otra clase
    public String devolverMensaje() {
       return "Bienvenido";
    }
    
}
