/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import br.data.controller.FornecedorController;
import br.data.controller.ProdutoController;
import br.data.entity.Fornecedor;
import br.data.entity.Produto;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author erick
 */
@Named(value = "jsfProduto")
@ViewScoped
public class JsfProduto implements Serializable {

    List<Produto> produtos;
    List<Produto> produtoSelecionado;
    List<Fornecedor> fornecedores;
    private String nome;
    private int quantidade;
    private BigDecimal valor;
    private String descricao;
    private String fornecedor;

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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
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
    
    public List<Produto> editar(){
        if(id == null){
            return null;
        } else {
            ProdutoController produtoController = new ProdutoController();
            int idAux = Integer.parseInt(id);
            produtoSelecionado = produtoController.getSelectProduto(idAux);
            return produtoSelecionado;
        }
    }

    public String redirectEditar(Integer id) {
        String txtId = new Integer(id).toString();
        return "estoque/editar.xhtml?id=" + txtId + "&faces-redirect=true";
    }
    
    public String redirectAdicionar(){
        return "estoque/adicionar.xhtml?faces-redirect=true";
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valor
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
