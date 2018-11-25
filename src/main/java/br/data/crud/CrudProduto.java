/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;


import br.data.entity.Produto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CrudProduto extends AbstractCrud<br.data.entity.Produto>{
    
    private EntityManager em;

    public CrudProduto() {
        super(br.data.entity.Produto.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(EMNames.EMN1, EMNames.getEMN1Props()).createEntityManager();
        }
        return em;
    }
    
    public List<> getProdutoNome(){
        getEntityManager();
    }
}
