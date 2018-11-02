/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Funcionario;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author erick
 */
public class CrudFuncionario extends AbstractCrud<br.data.entity.Funcionario>{
    private EntityManager em;

    public CrudFuncionario() {
        super(br.data.entity.Funcionario.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(EMNames.EMN1, EMNames.getEMN1Props()).createEntityManager();
        }
        return em;
    }
    
    public boolean logar(String email, String senha){
        getEntityManager();
        Query query = em.createNativeQuery("SELECT COUNT(1) FROM FUNCIONARIO WHERE EMAIL = ? AND SENHA = ?");
        Integer count = (Integer) query.getSingleResult();
        return count > 0;
    }
    
}
