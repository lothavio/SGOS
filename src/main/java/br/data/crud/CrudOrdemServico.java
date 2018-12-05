/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.OrdemServico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ggp
 */
public class CrudOrdemServico extends AbstractCrud<br.data.entity.OrdemServico>{
    private EntityManager em;
    public CrudOrdemServico(Class<OrdemServico> entityClass) {
        super(entityClass);
    }

    public CrudOrdemServico() {
        super(br.data.entity.OrdemServico.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(EMNames.EMN1, EMNames.getEMN1Props()).createEntityManager();
        }
        return em;
    }
    public List<OrdemServico> getOrdemServico(){
        getEntityManager();
        Query query = em.createNativeQuery("SELECT * FROM PRODUTO", OrdemServico.class);
        return (List<OrdemServico>) query.getResultList();
    }
    
}
