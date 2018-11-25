package br.web;

import br.data.controller.ProdutoController;
import br.data.entity.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@Named(value = "jsfEstoque")
@RequestScoped
public class JsfEstoque {
    
    private List<Produto> produtos = new ArrayList<Produto>();
    
    public JsfEstoque(){
    }
    
    public List<Produto> getAll() {
        ProdutoController produtoController = new ProdutoController();
        produtos = produtoController.getListaEstoque();
        return produtos;
    }
    
    public List<Produto> getProdutos(){
        return produtos;
    }
}
