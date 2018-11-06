/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author erick
 */
@Entity
@Table(name = "equipamento_ordem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EquipamentoOrdem.findAll", query = "SELECT e FROM EquipamentoOrdem e")
    , @NamedQuery(name = "EquipamentoOrdem.findByIdOrdem", query = "SELECT e FROM EquipamentoOrdem e WHERE e.equipamentoOrdemPK.idOrdem = :idOrdem")
    , @NamedQuery(name = "EquipamentoOrdem.findByIdDepartamento", query = "SELECT e FROM EquipamentoOrdem e WHERE e.equipamentoOrdemPK.idDepartamento = :idDepartamento")
    , @NamedQuery(name = "EquipamentoOrdem.findByIdProduto", query = "SELECT e FROM EquipamentoOrdem e WHERE e.equipamentoOrdemPK.idProduto = :idProduto")})
public class EquipamentoOrdem implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EquipamentoOrdemPK equipamentoOrdemPK;
    @JoinColumn(name = "id_departamento", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Departamento departamento;
    @JoinColumn(name = "id_ordem", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrdemServico ordemServico;
    @JoinColumn(name = "id_produto", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Produto produto;

    public EquipamentoOrdem() {
    }

    public EquipamentoOrdem(EquipamentoOrdemPK equipamentoOrdemPK) {
        this.equipamentoOrdemPK = equipamentoOrdemPK;
    }

    public EquipamentoOrdem(int idOrdem, int idDepartamento, int idProduto) {
        this.equipamentoOrdemPK = new EquipamentoOrdemPK(idOrdem, idDepartamento, idProduto);
    }

    public EquipamentoOrdemPK getEquipamentoOrdemPK() {
        return equipamentoOrdemPK;
    }

    public void setEquipamentoOrdemPK(EquipamentoOrdemPK equipamentoOrdemPK) {
        this.equipamentoOrdemPK = equipamentoOrdemPK;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
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
        hash += (equipamentoOrdemPK != null ? equipamentoOrdemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipamentoOrdem)) {
            return false;
        }
        EquipamentoOrdem other = (EquipamentoOrdem) object;
        if ((this.equipamentoOrdemPK == null && other.equipamentoOrdemPK != null) || (this.equipamentoOrdemPK != null && !this.equipamentoOrdemPK.equals(other.equipamentoOrdemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.data.entity.EquipamentoOrdem[ equipamentoOrdemPK=" + equipamentoOrdemPK + " ]";
    }
    
}
