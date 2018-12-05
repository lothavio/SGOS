/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import br.data.crud.CrudFornecedor;
import br.data.entity.Funcionario;
import br.data.entity.OrdemServico;
import static br.data.entity.OrdemServico_.idFuncionario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author ggp
 */
@ManagedBean (name = "jsfOrdem")
@ViewScoped
public class JsfOrdemServico implements Serializable {
    List<OrdemServico> Ordem;
    
    
    private int idOrdem;
    private int idFunc;
    private String descricaoOrdem;
    private Date dateEntrega;
    private Date dateSolicitado;
    private int idSolicitante;
    
    public JsfOrdemServico() {
    }

    public List<OrdemServico> getOrdem() {
        return Ordem;
    }

    public void setOrdem(List<OrdemServico> Ordem) {
        this.Ordem = Ordem;
    }

    public int getIdOrdem() {
        return idOrdem;
    }

    public void setIdOrdem(int idOrdem) {
        this.idOrdem = idOrdem;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getDescricaoOrdem() {
        return descricaoOrdem;
    }

    public void setDescricaoOrdem(String descricaoOrdem) {
        this.descricaoOrdem = descricaoOrdem;
    }

    public Date getDateEntrega() {
        return dateEntrega;
    }

    public void setDateEntrega(Date dateEntrega) {
        dateEntrega.getTime();
        this.dateEntrega = dateEntrega;
    }

    public Date getDateSolicitado() {
        return dateSolicitado;
    }

    public void setDateSolicitado(Date dateSolicitado) {
        dateSolicitado.getTime();
        this.dateSolicitado = dateSolicitado;
    }

    public int getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(int idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

      public String persist() {
        br.data.entity.OrdemServico ordemS;
        ordemS = new br.data.entity.OrdemServico();
        ordemS.setId(idOrdem);
        ordemS.setDescricaoProblema(descricaoOrdem);
        ordemS.setDataSolicitacao(dateSolicitado);
        ordemS.setDataEntrega(dateEntrega);
        ordemS.setIdFuncionario((Funcionario) idFuncionario);
        ordemS.setIdSolicitante(idSolicitante);
        Exception insert = new br.data.crud.CrudOrdemServico().persist(ordemS);
        if (insert == null) {
            this.setId(0);
            this.setDescricaoOrdem("");
            this.setDateSolicitado(dateSolicitado);
            this.setDateEntrega(dateEntrega);
            this.setIdFunc(0);
            this.setIdSolicitante(0);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!!", "Registro adicionado com sucesso");
            FacesContext.getCurrentInstance().addMessage(null, message);

        } else {
            String msg = insert.getMessage();
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Informe o administrador do erro: " + msg);
            FacesContext.getCurrentInstance().addMessage(null, message);
            return null;
        }
        return "/ordemServico.xhtml";
    }

    private void setId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
