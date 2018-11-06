/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import br.data.controller.FuncionarioController;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author erick
 */
@Named(value = "jsfLogin")
@SessionScoped
public class JsfLogin implements Serializable {
    
    private String email;
    private String senha;
    
    public JsfLogin() {
    }
    
    public String login(){
        FuncionarioController funcionarioController = new FuncionarioController();
        if (funcionarioController.checarLogin(getEmail(), getSenha())){
            FacesContext facesContext = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
            String att = null;
            session.setAttribute(getEmail(), att);
            return "/JsfDash";
        } else {
            FacesContext.getCurrentInstance().addMessage(
                             null,
                             new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
                                         "Erro no Login!"));
            return null;
        }
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
