/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import br.data.controller.FornecedorController;
import br.data.controller.ProdutoController;
import br.data.crud.CrudFornecedor;
import br.data.crud.CrudProduto;
import br.data.entity.Fornecedor;
import br.data.entity.Produto;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;


@ManagedBean(name = "jsfProduto")
@ViewScoped
public class JsfProduto implements Serializable {

    List<Produto> produtos;
    List<Fornecedor> fornecedores;
    Produto produtoSelecionado;
    int testeid;
    
    private int idUp;
    private String nomeUp;
    private String descricaoUp;
    private int quantidadeUp;
    private BigDecimal valorUp;
    private int idFornecedorUp;

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

    public String getDescricaoUp() {
        return descricaoUp;
    }

    public void setDescricaoUp(String descricaoUp) {
        this.descricaoUp = descricaoUp;
    }

    public int getQuantidadeUp() {
        return quantidadeUp;
    }

    public void setQuantidadeUp(int quantidadeUp) {
        this.quantidadeUp = quantidadeUp;
    }

    public BigDecimal getValorUp() {
        return valorUp;
    }

    public void setValorUp(BigDecimal valorUp) {
        this.valorUp = valorUp;
    }

    public int getIdFornecedorUp() {
        return idFornecedorUp;
    }

    public void setIdFornecedorUp(int idFornecedorUp) {
        this.idFornecedorUp = idFornecedorUp;
    }

    public List<Fornecedor> getForn() {
        FornecedorController fornecedorController = new FornecedorController();
        fornecedores = fornecedorController.getListaFornecedor();
        return fornecedores;
    }
    
    public String persist() {
        br.data.entity.Produto prod;
        prod = new br.data.entity.Produto();
        prod.setId(idUp);
        prod.setNome(nomeUp);
        prod.setDescricao(descricaoUp);
        prod.setQuantidade(quantidadeUp);
        prod.setValor(valorUp);
        prod.setIdFornecedor(new CrudFornecedor().find(this.getIdFornecedorUp()));
        Exception insert = new br.data.crud.CrudProduto().persist(prod);
        if (insert == null) {
            this.setIdUp(0);
            this.setNomeUp("");
            this.setDescricaoUp("");
            this.setQuantidadeUp(0);
            this.setValorUp(BigDecimal.ZERO);
            this.setIdFornecedorUp(0);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!!", "Registro adicionado com sucesso");
            FacesContext.getCurrentInstance().addMessage(null, message);

        } else {
            String msg = insert.getMessage();
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Informe o administrador do erro: " + msg);
            FacesContext.getCurrentInstance().addMessage(null, message);
            return null;
        }
        return "/estoque.xhtml";
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

    public String redirectEditar(br.data.entity.Produto produto) {
        //this.produtoSelecionado = produto;
        this.idUp = produto.getId();
        this.nomeUp = produto.getNome();
        this.descricaoUp = produto.getDescricao();
        this.quantidadeUp = produto.getQuantidade();
        this.valorUp = produto.getValor();
        this.idFornecedorUp = produto.getIdFornecedor().getId();
        return "estoque/editar.xhtml";
    }
    
    public String merge(){
        br.data.entity.Produto prod;
        CrudProduto crudProd = new CrudProduto();
        prod = crudProd.find(this.idUp);
        prod.setNome(nomeUp);
        prod.setDescricao(descricaoUp);
        prod.setValor(valorUp);
        prod.setQuantidade(quantidadeUp);
        prod.setIdFornecedor(new CrudFornecedor().find(this.idFornecedorUp));
        Exception e = crudProd.merge(prod);
        if (e == null) {
            this.setIdUp(0);
            this.setNomeUp("");
            this.setQuantidadeUp(0);
            this.setValorUp(BigDecimal.ZERO);
            this.setDescricaoUp("");
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!!", "Registro alterado com sucesso");
            FacesContext.getCurrentInstance().addMessage(null, message);

        } else {
            String msg = e.getMessage();
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Informe o administrador do erro: " + msg);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
        return "/estoque.xhtml";
    }
    
    public int getTesteId(){
        return this.testeid;
    }
    
    
    public String redirectAdicionar() {
        return "estoque/adicionar.xhtml";
    }
    
    public String redirectDashboard(){
        return "Dashboard.xhtml";
    }
    
}
