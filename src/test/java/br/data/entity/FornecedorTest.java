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
public class FornecedorTest {
    
    public FornecedorTest() {
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
     * Test of getId method, of class Fornecedor.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Fornecedor instance = new Fornecedor(1, "teste", 2, "teste");
        Integer expResult = 1;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Fornecedor.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 2;
        Fornecedor instance = new Fornecedor();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Fornecedor.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Fornecedor instance = new Fornecedor(1, "teste", 1, "teste");
        String expResult = "teste";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Fornecedor.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "teste";
        Fornecedor instance = new Fornecedor();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCnpj method, of class Fornecedor.
     */
    @Test
    public void testGetCnpj() {
        System.out.println("getCnpj");
        Fornecedor instance = new Fornecedor();
        int expResult = 0;
        int result = instance.getCnpj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCnpj method, of class Fornecedor.
     */
    @Test
    public void testSetCnpj() {
        System.out.println("setCnpj");
        int cnpj = 0;
        Fornecedor instance = new Fornecedor();
        instance.setCnpj(cnpj);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Fornecedor.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Fornecedor instance = new Fornecedor(1, "teste", 1, "teste");
        String expResult = "teste";
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Fornecedor.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = "teste2";
        Fornecedor instance = new Fornecedor();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProdutoCollection method, of class Fornecedor.
     */
    @Test
    public void testGetProdutoCollection() {
        System.out.println("getProdutoCollection");
        Fornecedor instance = new Fornecedor();
        Collection<Produto> expResult = null;
        Collection<Produto> result = instance.getProdutoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setProdutoCollection method, of class Fornecedor.
     */
    @Test
    public void testSetProdutoCollection() {
        System.out.println("setProdutoCollection");
        Collection<Produto> produtoCollection = null;
        Fornecedor instance = new Fornecedor();
        instance.setProdutoCollection(produtoCollection);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Fornecedor.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Fornecedor instance = new Fornecedor();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Fornecedor.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Fornecedor instance = new Fornecedor();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Fornecedor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Fornecedor instance = new Fornecedor(1, "teste", 1, "teste");
        int id = 1;
        String expResult = "br.data.entity.Fornecedor[ id=" + id + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
