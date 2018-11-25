package br.data.controller;


import br.data.crud.CrudProduto;
import br.data.entity.Produto;
import java.util.List;

public class ProdutoController {
        
    public List<Produto> getListaEstoque(){
        CrudProduto crudProduto = new CrudProduto();
        return crudProduto.getProdutos();
    }
}
