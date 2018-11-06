/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author erick
 */
@Entity
@Table(name = "ordem_servico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdemServico.findAll", query = "SELECT o FROM OrdemServico o")
    , @NamedQuery(name = "OrdemServico.findById", query = "SELECT o FROM OrdemServico o WHERE o.id = :id")
    , @NamedQuery(name = "OrdemServico.findByDescricaoProblema", query = "SELECT o FROM OrdemServico o WHERE o.descricaoProblema = :descricaoProblema")
    , @NamedQuery(name = "OrdemServico.findByDataSolicitacao", query = "SELECT o FROM OrdemServico o WHERE o.dataSolicitacao = :dataSolicitacao")
    , @NamedQuery(name = "OrdemServico.findByDataEntrega", query = "SELECT o FROM OrdemServico o WHERE o.dataEntrega = :dataEntrega")})
public class OrdemServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descricao_problema")
    private String descricaoProblema;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_solicitacao")
    @Temporal(TemporalType.DATE)
    private Date dataSolicitacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_entrega")
    @Temporal(TemporalType.DATE)
    private Date dataEntrega;
    @JoinColumn(name = "id_funcionario", referencedColumnName = "id")
    @ManyToOne
    private Funcionario idFuncionario;
    @JoinColumn(name = "id_solicitante", referencedColumnName = "id")
    @ManyToOne
    private Funcionario idSolicitante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordemServico")
    private Collection<EquipamentoOrdem> equipamentoOrdemCollection;

    public OrdemServico() {
    }

    public OrdemServico(Integer id) {
        this.id = id;
    }

    public OrdemServico(Integer id, String descricaoProblema, Date dataSolicitacao, Date dataEntrega) {
        this.id = id;
        this.descricaoProblema = descricaoProblema;
        this.dataSolicitacao = dataSolicitacao;
        this.dataEntrega = dataEntrega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Funcionario getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Funcionario idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    @XmlTransient
    public Collection<EquipamentoOrdem> getEquipamentoOrdemCollection() {
        return equipamentoOrdemCollection;
    }

    public void setEquipamentoOrdemCollection(Collection<EquipamentoOrdem> equipamentoOrdemCollection) {
        this.equipamentoOrdemCollection = equipamentoOrdemCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdemServico)) {
            return false;
        }
        OrdemServico other = (OrdemServico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.data.entity.OrdemServico[ id=" + id + " ]";
    }
    
}
