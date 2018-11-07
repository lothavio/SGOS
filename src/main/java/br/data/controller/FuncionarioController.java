package br.data.controller;

import br.data.crud.CrudFuncionario;

/**
 *
 * @author erick
 */
public class FuncionarioController {
    public boolean checarLogin(String email, String senha){
        CrudFuncionario crudFuncionario = new CrudFuncionario();
        return crudFuncionario.logar(email, senha);
    }
    
    public String getNome(String email){
        CrudFuncionario crudFuncionario = new CrudFuncionario();
        return crudFuncionario.getFuncionarioNome(email);
    }
    
}
