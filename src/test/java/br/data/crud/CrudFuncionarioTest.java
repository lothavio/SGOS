/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Funcionario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author erick
 */
public class CrudFuncionarioTest {
    
    public CrudFuncionarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEntityManager method, of class CrudFuncionario.
     */
    /**
     * Test of logar method, of class CrudFuncionario.
     */
    @Test
    public void testLogar() throws ParseException {
        System.out.println("logar");
        String email = "teste";
        String senha = "teste";
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("23/11/2015");
        Funcionario instance = new Funcionario(2, "teste", "teste", "teste", data);
        String expResult = "okay";
        String result;
        if((instance.getEmail() == email) && (instance.getSenha() == senha)){
            result = "okay";
        } else {
            result = "erro";
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
