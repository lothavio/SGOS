package br.web;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@Named(value = "jsfProduto")
@RequestScoped
public class JsfEstoque {
    
    public JsfEstoque(){
        
    }
    
    public String getProduto() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
        String sessaoNome = (String)session.getAttribute("nome");
        return sessaoNome;
    }
}
