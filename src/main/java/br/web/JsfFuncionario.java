/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author erick
 */
@Named(value = "jsfFuncionario")
@RequestScoped
public class JsfFuncionario {

    /**
     * Creates a new instance of JsfFuncionario
     */
    public JsfFuncionario() {
        
    }
    
}
