/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

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
    @org.junit.Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        CrudFuncionario instance = new CrudFuncionario();
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logar method, of class CrudFuncionario.
     */
    @org.junit.Test
    public void testLogar() {
        System.out.println("logar");
        String email = "";
        String senha = "";
        CrudFuncionario instance = new CrudFuncionario();
        boolean expResult = false;
        boolean result = instance.logar(email, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
