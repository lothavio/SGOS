/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class FuncionarioTest {
    
    public FuncionarioTest() {
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
     * Test of getId method, of class Funcionario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Funcionario instance = new Funcionario();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Funcionario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Funcionario instance = new Funcionario();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Funcionario.
     */
    @Test
    public void testGetNome() throws ParseException {
        System.out.println("getNome");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("23/11/2015");
        Funcionario instance = new Funcionario(2, "teste", "teste", "teste", data);
        String expResult = "teste";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Funcionario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Funcionario instance = new Funcionario();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Funcionario.
     */
    @Test
    public void testGetEmail() throws ParseException {
        System.out.println("getEmail");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("23/11/2015");
        Funcionario instance = new Funcionario(2, "teste", "teste", "teste", data);
        String expResult = "teste";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Funcionario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "alo";
        Funcionario instance = new Funcionario(2);
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Funcionario.
     */
    @Test
    public void testGetSenha() throws ParseException {
        System.out.println("getSenha");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("23/11/2015");
        Funcionario instance = new Funcionario(2, "teste", "teste", "teste", data);
        String expResult = "teste";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Funcionario.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        Funcionario instance = new Funcionario();
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataNascimento method, of class Funcionario.
     */
    @Test
    public void testGetDataNascimento() {
        System.out.println("getDataNascimento");
        Funcionario instance = new Funcionario();
        Date expResult = null;
        Date result = instance.getDataNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDataNascimento method, of class Funcionario.
     */
    @Test
    public void testSetDataNascimento() {
        System.out.println("setDataNascimento");
        Date dataNascimento = null;
        Funcionario instance = new Funcionario();
        instance.setDataNascimento(dataNascimento);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Funcionario.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Funcionario instance = new Funcionario();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Funcionario.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Funcionario instance = new Funcionario();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
