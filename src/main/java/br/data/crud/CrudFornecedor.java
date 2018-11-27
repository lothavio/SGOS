/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Fornecedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 *
 * @author erick
 */
public class CrudFornecedor extends AbstractCrud<br.data.entity.Fornecedor>{
    private EntityManager em;

    public CrudFornecedor() {
        super(br.data.entity.Fornecedor.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(EMNames.EMN1, EMNames.getEMN1Props()).createEntityManager();
        }
        return em;
    }
    
    public List<Fornecedor> getFornecedores(){
        getEntityManager();
        Query query = em.createNativeQuery("SELECT * FROM FORNECEDOR", Fornecedor.class);
        return (List<Fornecedor>) query.getResultList();
    }
    
}
