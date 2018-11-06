/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author erick
 */
@Embeddable
public class EquipamentoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_departamento")
    private int idDepartamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_produto")
    private int idProduto;

    public EquipamentoPK() {
    }

    public EquipamentoPK(int idDepartamento, int idProduto) {
        this.idDepartamento = idDepartamento;
        this.idProduto = idProduto;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idDepartamento;
        hash += (int) idProduto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipamentoPK)) {
            return false;
        }
        EquipamentoPK other = (EquipamentoPK) object;
        if (this.idDepartamento != other.idDepartamento) {
            return false;
        }
        if (this.idProduto != other.idProduto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.data.entity.EquipamentoPK[ idDepartamento=" + idDepartamento + ", idProduto=" + idProduto + " ]";
    }
    
}
