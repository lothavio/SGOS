/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import br.data.controller.FornecedorController;
import br.data.crud.CrudFornecedor;
import br.data.entity.Fornecedor;
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
@ManagedBean(name = "jsfFornecedor")
@ViewScoped
public class JsfFornecedor implements Serializable {
    
    List<Fornecedor> fornecedores;
    
    private int idUp;
    private String nomeUp;
    private int cnpjUp;
    private String enderecoUp;

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

    public int getCnpjUp() {
        return cnpjUp;
    }

    public void setCnpjUp(int cnpjUp) {
        this.cnpjUp = cnpjUp;
    }

    public String getEnderecoUp() {
        return enderecoUp;
    }

    public void setEnderecoUp(String enderecoUp) {
        this.enderecoUp = enderecoUp;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
    
    public JsfFornecedor() {
    }
    
    public List<Fornecedor> getAll(){
        FornecedorController fornecedorController = new FornecedorController();
        fornecedores = fornecedorController.getListaFornecedor();
        return fornecedores;
    }
    
    public String persist() {
        br.data.entity.Fornecedor forn;
        forn = new br.data.entity.Fornecedor();
        forn.setId(idUp);
        forn.setNome(nomeUp);
        forn.setCnpj(cnpjUp);
        forn.setEndereco(enderecoUp);
        Exception insert = new br.data.crud.CrudFornecedor().persist(forn);
        if (insert == null) {
            this.setIdUp(0);
            this.setNomeUp("");
            this.setCnpjUp(0);
            this.setEnderecoUp("");
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!!", "Registro adicionado com sucesso");
            FacesContext.getCurrentInstance().addMessage(null, message);
        } else {
            String msg = insert.getMessage();
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Informe o administrador do erro: " + msg);
            FacesContext.getCurrentInstance().addMessage(null, message);
            return null;
        }
        return "/fornecedor.xhtml";
    }
    
    public String redirectEditar(br.data.entity.Fornecedor fornecedor){
        this.idUp = fornecedor.getId();
        this.nomeUp = fornecedor.getNome();
        this.cnpjUp = fornecedor.getCnpj();
        this.enderecoUp = fornecedor.getEndereco();
        return "fornecedor/editar.xhtml";
    }
    
    public String merge(){
        br.data.entity.Fornecedor forn;
        CrudFornecedor crudFornecedor = new CrudFornecedor();
        forn = crudFornecedor.find(this.idUp);
        forn.setNome(nomeUp);
        forn.setCnpj(cnpjUp);
        forn.setEndereco(enderecoUp);
        Exception e = crudFornecedor.merge(forn);
        if (e == null) {
            this.setIdUp(0);
            this.setNomeUp("");
            this.setEnderecoUp("");
            this.setCnpjUp(0);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!!", "Registro alterado com sucesso");
            FacesContext.getCurrentInstance().addMessage(null, message);

        } else {
            String msg = e.getMessage();
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Informe o administrador do erro: " + msg);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
        return "/fornecedor.xhtml";
    }
    
    public void deletarFornecedor(br.data.entity.Fornecedor fornecedor){
        CrudFornecedor crudFornecedor = new CrudFornecedor();
        Exception e = crudFornecedor.remove(fornecedor);
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
        return "fornecedor/adicionar.xhtml";
    }
    
}
