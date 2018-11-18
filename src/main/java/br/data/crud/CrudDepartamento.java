/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author erick
 */
public class CrudDepartamento extends AbstractCrud<br.data.entity.Departamento>{
    private EntityManager em;

    public CrudDepartamento() {
        super(br.data.entity.Departamento.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(EMNames.EMN1, EMNames.getEMN1Props()).createEntityManager();
        }
        return em;
    }
    
}
