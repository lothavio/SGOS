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
public class CrudEquipamento extends AbstractCrud<br.data.entity.Equipamento>{
    private EntityManager em;

    public CrudEquipamento() {
        super(br.data.entity.Equipamento.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(EMNames.EMN1, EMNames.getEMN1Props()).createEntityManager();
        }
        return em;
    }
    
}
