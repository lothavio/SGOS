/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

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
public class JsfFuncionarioTiTest {
    
    public JsfFuncionarioTiTest() {
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
     * Test of redirectEstoque method, of class JsfFuncionarioTi.
     */
    @Test
    public void testRedirectEstoque() {
        System.out.println("redirectEstoque");
        JsfFuncionarioTi instance = new JsfFuncionarioTi();
        String expResult = "estoque.xhtml?faces-redirect=true";
        String result = instance.redirectEstoque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of redirectCadastroFuncionario method, of class JsfFuncionarioTi.
     */
    @Test
    public void testRedirectCadastroFuncionario() {
        System.out.println("redirectCadastroFuncionario");
        JsfFuncionarioTi instance = new JsfFuncionarioTi();
        String expResult = "cadastroFuncionario.xhtml?faces-redirect=true";
        String result = instance.redirectCadastroFuncionario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of redirectOrdem method, of class JsfFuncionarioTi.
     */
    @Test
    public void testRedirectOrdem() {
        System.out.println("redirectOrdem");
        JsfFuncionarioTi instance = new JsfFuncionarioTi();
        String expResult = "ordemServico.xhtml?faces-redirect=true";
        String result = instance.redirectOrdem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
