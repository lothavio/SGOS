/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.math.BigDecimal;
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
public class ProdutoTest {
    
    public ProdutoTest() {
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
     * Test of getId method, of class Produto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Produto instance = new Produto();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Produto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Produto instance = new Produto();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Produto.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        BigDecimal valor = new BigDecimal("2.5");
        Produto instance = new Produto(1, "teste", 1, valor, "teste");
        String expResult = "teste";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Produto.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Produto instance = new Produto();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Produto.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Produto.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int quantidade = 0;
        Produto instance = new Produto();
        instance.setQuantidade(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Produto.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        BigDecimal valor = new BigDecimal("2.5");
        Produto instance = new Produto(1, "teste", 1, valor, "teste");
        BigDecimal expResult = new BigDecimal("2.5");
        BigDecimal result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Produto.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        BigDecimal valor = null;
        Produto instance = new Produto();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Produto.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        BigDecimal valor = new BigDecimal("2.5");
        Produto instance = new Produto(1, "teste", 1, valor, "teste");
        String expResult = "teste";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Produto.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Produto instance = new Produto();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdFornecedor method, of class Produto.
     */
    @Test
    public void testGetIdFornecedor() {
        System.out.println("getIdFornecedor");
        Produto instance = new Produto();
        Fornecedor expResult = null;
        Fornecedor result = instance.getIdFornecedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdFornecedor method, of class Produto.
     */
    @Test
    public void testSetIdFornecedor() {
        System.out.println("setIdFornecedor");
        Fornecedor idFornecedor = null;
        Produto instance = new Produto();
        instance.setIdFornecedor(idFornecedor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipamentoCollection method, of class Produto.
     */
    @Test
    public void testGetEquipamentoCollection() {
        System.out.println("getEquipamentoCollection");
        Produto instance = new Produto();
        Collection<Equipamento> expResult = null;
        Collection<Equipamento> result = instance.getEquipamentoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipamentoCollection method, of class Produto.
     */
    @Test
    public void testSetEquipamentoCollection() {
        System.out.println("setEquipamentoCollection");
        Collection<Equipamento> equipamentoCollection = null;
        Produto instance = new Produto();
        instance.setEquipamentoCollection(equipamentoCollection);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipamentoOrdemCollection method, of class Produto.
     */
    @Test
    public void testGetEquipamentoOrdemCollection() {
        System.out.println("getEquipamentoOrdemCollection");
        Produto instance = new Produto();
        Collection<EquipamentoOrdem> expResult = null;
        Collection<EquipamentoOrdem> result = instance.getEquipamentoOrdemCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipamentoOrdemCollection method, of class Produto.
     */
    @Test
    public void testSetEquipamentoOrdemCollection() {
        System.out.println("setEquipamentoOrdemCollection");
        Collection<EquipamentoOrdem> equipamentoOrdemCollection = null;
        Produto instance = new Produto();
        instance.setEquipamentoOrdemCollection(equipamentoOrdemCollection);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Produto.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Produto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Produto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BigDecimal valor = new BigDecimal("2.5");
        Produto instance = new Produto(1, "teste", 1, valor, "teste");
        int id = 1;
        String expResult = "br.data.entity.Produto[ id=" + id + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
