/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author erick
 */
@Entity
@Table(name = "equipamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipamento.findAll", query = "SELECT e FROM Equipamento e")
    , @NamedQuery(name = "Equipamento.findByIdDepartamento", query = "SELECT e FROM Equipamento e WHERE e.equipamentoPK.idDepartamento = :idDepartamento")
    , @NamedQuery(name = "Equipamento.findByIdProduto", query = "SELECT e FROM Equipamento e WHERE e.equipamentoPK.idProduto = :idProduto")
    , @NamedQuery(name = "Equipamento.findByQuantidade", query = "SELECT e FROM Equipamento e WHERE e.quantidade = :quantidade")})
public class Equipamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EquipamentoPK equipamentoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantidade")
    private int quantidade;
    @JoinColumn(name = "id_departamento", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Departamento departamento;
    @JoinColumn(name = "id_produto", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Produto produto;

    public Equipamento() {
    }

    public Equipamento(EquipamentoPK equipamentoPK) {
        this.equipamentoPK = equipamentoPK;
    }

    public Equipamento(EquipamentoPK equipamentoPK, int quantidade) {
        this.equipamentoPK = equipamentoPK;
        this.quantidade = quantidade;
    }

    public Equipamento(int idDepartamento, int idProduto) {
        this.equipamentoPK = new EquipamentoPK(idDepartamento, idProduto);
    }

    public EquipamentoPK getEquipamentoPK() {
        return equipamentoPK;
    }

    public void setEquipamentoPK(EquipamentoPK equipamentoPK) {
        this.equipamentoPK = equipamentoPK;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equipamentoPK != null ? equipamentoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipamento)) {
            return false;
        }
        Equipamento other = (Equipamento) object;
        if ((this.equipamentoPK == null && other.equipamentoPK != null) || (this.equipamentoPK != null && !this.equipamentoPK.equals(other.equipamentoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.data.entity.Equipamento[ equipamentoPK=" + equipamentoPK + " ]";
    }
    
}
