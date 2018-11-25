/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import br.data.controller.ProdutoController;
import br.data.entity.Produto;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author erick
 */
@Named(value = "jsfProduto")
@ViewScoped
public class JsfProduto {
    
    List<Produto> produtos;
    String teste;
    
    public JsfProduto() {
    }
    
    public List<Produto> getProdutos(){
        return produtos;
    }
    
    public List<Produto> getAll(){
        ProdutoController produtoController = new ProdutoController();
        produtos = produtoController.getListaEstoque();
        return produtos;
    }
    
    public String asd(){
        teste = "teste";
        return teste;
    }
}
