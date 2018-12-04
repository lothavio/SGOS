/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import br.data.controller.FornecedorController;
import br.data.controller.ProdutoController;
import br.data.crud.CrudProduto;
import br.data.entity.Fornecedor;
import br.data.entity.Produto;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author erick
 */
@ManagedBean(name = "jsfProduto")
@ViewScoped
public class JsfProduto implements Serializable {

    List<Produto> produtos;
    List<Fornecedor> fornecedores;
    Produto produtoSelecionado;
    int testeid;

    public JsfProduto() {
    }

    Map<String, String> params = FacesContext.getCurrentInstance().
            getExternalContext().getRequestParameterMap();
    String id = params.get("id");

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public Produto getProdutoSelecionado() {
        return produtoSelecionado;
    }

    public void setProdutoSelecionado(Produto produtoSelecionado) {
        this.produtoSelecionado = produtoSelecionado;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }
    public List<Produto> setProduto(Produto produto){
        produtos.add(produtoSelecionado);
        return produtos;
    }

    public List<Produto> getAll() {
        ProdutoController produtoController = new ProdutoController();
        produtos = produtoController.getListaEstoque();
        return produtos;
    }

    public List<Fornecedor> getForn() {
        FornecedorController fornecedorController = new FornecedorController();
        fornecedores = fornecedorController.getListaFornecedor();
        return fornecedores;
    }
    
    public void deletarProduto(br.data.entity.Produto produto){
        CrudProduto crudProduto = new CrudProduto();
        Exception e = crudProduto.remove(produto);
         if (e == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!!", "Registro excluido com sucesso");
            FacesContext.getCurrentInstance().addMessage(null, message);

        } else {
            String msg = e.getMessage();
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Informe o administrador do erro: " + msg);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }

    public String redirectEditar(Produto produto) {
        this.produtoSelecionado = produto;
        return "estoque/editar.xhtml";
    }
    
    public int getTesteId(){
        return this.testeid;
    }
    
    
    public String redirectAdicionar() {
        return "estoque/adicionar.xhtml?faces-redirect=true";
    }
    
}
