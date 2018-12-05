/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import br.data.controller.DepartamentoController;
import br.data.crud.CrudDepartamento;
import br.data.entity.Departamento;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author erick
 */
@ManagedBean(name = "jsfDepartamento")
@ViewScoped
public class JsfDepartamento implements Serializable {
    
    List<Departamento> departamentos;
    
    private int idUp;
    private String nomeUp;

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public int getIdUp() {
        return idUp;
    }

    public void setIdUp(int idUp) {
        this.idUp = idUp;
    }

    public String getNomeUp() {
        return nomeUp;
    }

    public void setNomeUp(String nomeUp) {
        this.nomeUp = nomeUp;
    }
    
    public JsfDepartamento() {
    }
    
    public List<Departamento> getAll(){
        DepartamentoController departamentoController = new DepartamentoController();
        departamentos = departamentoController.getListaDepartamento();
        return departamentos;
    }
    
    public String persist() {
        br.data.entity.Departamento dep;
        dep = new br.data.entity.Departamento();
        dep.setId(idUp);
        dep.setNome(nomeUp);
        Exception insert = new br.data.crud.CrudDepartamento().persist(dep);
        if (insert == null) {
            this.setIdUp(0);
            this.setNomeUp("");
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!!", "Registro adicionado com sucesso");
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            String msg = insert.getMessage();
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Informe o administrador do erro: " + msg);
            FacesContext.getCurrentInstance().addMessage(null, message);
            return null;
        }
        return "/departamento.xhtml";
    }
    
    public String redirectEditar(br.data.entity.Departamento departamento){
        this.idUp = departamento.getId();
        this.nomeUp = departamento.getNome();
        return "departamento/editar.xhtml";
    }
    
    public String merge(){
        br.data.entity.Departamento dep;
        CrudDepartamento crudDepartamento = new CrudDepartamento();
        dep = crudDepartamento.find(this.idUp);
        dep.setNome(nomeUp);
        Exception e = crudDepartamento.merge(dep);
        if (e == null) {
            this.setIdUp(0);
            this.setNomeUp("");
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!!", "Registro alterado com sucesso");
            FacesContext.getCurrentInstance().addMessage(null, message);

        } else {
            String msg = e.getMessage();
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Informe o administrador do erro: " + msg);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
        return "/departamento.xhtml";
    }
    
    public void deletarDepartamento(br.data.entity.Departamento departamento){
        CrudDepartamento crudDepartamento = new CrudDepartamento();
        Exception e = crudDepartamento.remove(departamento);
         if (e == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!!", "Registro excluido com sucesso");
            FacesContext.getCurrentInstance().addMessage(null, message);

        } else {
            String msg = e.getMessage();
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Informe o administrador do erro: " + msg);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
    
    public String redirectAdicionar(){
        return "departamento/adicionar.xhtml";
    }
    
}
