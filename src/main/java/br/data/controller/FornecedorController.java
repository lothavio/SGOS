/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.controller;

import br.data.crud.CrudFornecedor;
import br.data.entity.Fornecedor;
import java.util.List;

/**
 *
 * @author erick
 */
public class FornecedorController {
    public List<Fornecedor> getListaFornecedor(){
        CrudFornecedor crudFornecedor = new CrudFornecedor();
        return crudFornecedor.getFornecedores();
    }
    
}
