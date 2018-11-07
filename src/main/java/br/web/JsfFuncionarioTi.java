/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author erick
 */
@Named(value = "jsfFuncionarioTi")
@Dependent
public class JsfFuncionarioTi {

    /**
     * Creates a new instance of JsfFuncionarioTi
     */
    public JsfFuncionarioTi() {
    }
    
    public String redirectEstoque(){
        return "estoque.xhtml?faces-redirect=true";
    }

}
