/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.controller;

import br.data.crud.CrudDepartamento;
import br.data.entity.Departamento;
import java.util.List;

/**
 *
 * @author erick
 */
public class DepartamentoController {
    public List<Departamento> getListaDepartamento(){
        CrudDepartamento crudDepartamento = new CrudDepartamento();
        return crudDepartamento.getDepartamentos();
    }
    
}
