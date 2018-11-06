/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.util.Collection;
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
public class DepartamentoTest {
    
    public DepartamentoTest() {
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
     * Test of getId method, of class Departamento.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Departamento instance = new Departamento();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Departamento.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Departamento instance = new Departamento();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Departamento.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Departamento instance = new Departamento(1, "teste");
        String expResult = "teste";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Departamento.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Departamento instance = new Departamento();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipamentoCollection method, of class Departamento.
     */
    @Test
    public void testGetEquipamentoCollection() {
        System.out.println("getEquipamentoCollection");
        Departamento instance = new Departamento();
        Collection<Equipamento> expResult = null;
        Collection<Equipamento> result = instance.getEquipamentoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipamentoCollection method, of class Departamento.
     */
    @Test
    public void testSetEquipamentoCollection() {
        System.out.println("setEquipamentoCollection");
        Collection<Equipamento> equipamentoCollection = null;
        Departamento instance = new Departamento();
        instance.setEquipamentoCollection(equipamentoCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFuncionarioCollection method, of class Departamento.
     */
    @Test
    public void testGetFuncionarioCollection() {
        System.out.println("getFuncionarioCollection");
        Departamento instance = new Departamento();
        Collection<Funcionario> expResult = null;
        Collection<Funcionario> result = instance.getFuncionarioCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFuncionarioCollection method, of class Departamento.
     */
    @Test
    public void testSetFuncionarioCollection() {
        System.out.println("setFuncionarioCollection");
        Collection<Funcionario> funcionarioCollection = null;
        Departamento instance = new Departamento();
        instance.setFuncionarioCollection(funcionarioCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipamentoOrdemCollection method, of class Departamento.
     */
    @Test
    public void testGetEquipamentoOrdemCollection() {
        System.out.println("getEquipamentoOrdemCollection");
        Departamento instance = new Departamento();
        Collection<EquipamentoOrdem> expResult = null;
        Collection<EquipamentoOrdem> result = instance.getEquipamentoOrdemCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipamentoOrdemCollection method, of class Departamento.
     */
    @Test
    public void testSetEquipamentoOrdemCollection() {
        System.out.println("setEquipamentoOrdemCollection");
        Collection<EquipamentoOrdem> equipamentoOrdemCollection = null;
        Departamento instance = new Departamento();
        instance.setEquipamentoOrdemCollection(equipamentoOrdemCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Departamento.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Departamento instance = new Departamento();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Departamento.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Departamento instance = new Departamento();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Departamento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Departamento instance = new Departamento();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
