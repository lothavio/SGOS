/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

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

    public String getSessao() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
        String sessaoNome = (String)session.getAttribute("nome");
        return sessaoNome;
    }
    

}
