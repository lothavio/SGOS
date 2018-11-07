/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
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
public class OrdemServicoTest {
    
    public OrdemServicoTest() {
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
     * Test of getId method, of class OrdemServico.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        OrdemServico instance = new OrdemServico();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class OrdemServico.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        OrdemServico instance = new OrdemServico();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricaoProblema method, of class OrdemServico.
     */
    @Test
    public void testGetDescricaoProblema() throws ParseException {
        System.out.println("getDescricaoProblema");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("23/11/2015");
        OrdemServico instance = new OrdemServico(1, "teste", data, data);
        String expResult = "teste";
        String result = instance.getDescricaoProblema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricaoProblema method, of class OrdemServico.
     */
    @Test
    public void testSetDescricaoProblema() {
        System.out.println("setDescricaoProblema");
        String descricaoProblema = "";
        OrdemServico instance = new OrdemServico();
        instance.setDescricaoProblema(descricaoProblema);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataSolicitacao method, of class OrdemServico.
     */
    @Test
    public void testGetDataSolicitacao() {
        System.out.println("getDataSolicitacao");
        OrdemServico instance = new OrdemServico();
        Date expResult = null;
        Date result = instance.getDataSolicitacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDataSolicitacao method, of class OrdemServico.
     */
    @Test
    public void testSetDataSolicitacao() {
        System.out.println("setDataSolicitacao");
        Date dataSolicitacao = null;
        OrdemServico instance = new OrdemServico();
        instance.setDataSolicitacao(dataSolicitacao);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getDataEntrega method, of class OrdemServico.
     */
    @Test
    public void testGetDataEntrega() {
        System.out.println("getDataEntrega");
        OrdemServico instance = new OrdemServico();
        Date expResult = null;
        Date result = instance.getDataEntrega();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setDataEntrega method, of class OrdemServico.
     */
    @Test
    public void testSetDataEntrega() {
        System.out.println("setDataEntrega");
        Date dataEntrega = null;
        OrdemServico instance = new OrdemServico();
        instance.setDataEntrega(dataEntrega);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getIdFuncionario method, of class OrdemServico.
     */
    @Test
    public void testGetIdFuncionario() {
        System.out.println("getIdFuncionario");
        OrdemServico instance = new OrdemServico();
        Funcionario expResult = null;
        Funcionario result = instance.getIdFuncionario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setIdFuncionario method, of class OrdemServico.
     */
    @Test
    public void testSetIdFuncionario() {
        System.out.println("setIdFuncionario");
        Funcionario idFuncionario = null;
        OrdemServico instance = new OrdemServico();
        instance.setIdFuncionario(idFuncionario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdSolicitante method, of class OrdemServico.
     */
    @Test
    public void testGetIdSolicitante() {
        System.out.println("getIdSolicitante");
        OrdemServico instance = new OrdemServico();
        Funcionario expResult = null;
        Funcionario result = instance.getIdSolicitante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setIdSolicitante method, of class OrdemServico.
     */
    @Test
    public void testSetIdSolicitante() {
        System.out.println("setIdSolicitante");
        Funcionario idSolicitante = null;
        OrdemServico instance = new OrdemServico();
        instance.setIdSolicitante(idSolicitante);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipamentoOrdemCollection method, of class OrdemServico.
     */
    @Test
    public void testGetEquipamentoOrdemCollection() {
        System.out.println("getEquipamentoOrdemCollection");
        OrdemServico instance = new OrdemServico();
        Collection<EquipamentoOrdem> expResult = null;
        Collection<EquipamentoOrdem> result = instance.getEquipamentoOrdemCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipamentoOrdemCollection method, of class OrdemServico.
     */
    @Test
    public void testSetEquipamentoOrdemCollection() {
        System.out.println("setEquipamentoOrdemCollection");
        Collection<EquipamentoOrdem> equipamentoOrdemCollection = null;
        OrdemServico instance = new OrdemServico();
        instance.setEquipamentoOrdemCollection(equipamentoOrdemCollection);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class OrdemServico.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        OrdemServico instance = new OrdemServico();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class OrdemServico.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        OrdemServico instance = new OrdemServico();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class OrdemServico.
     */
    @Test
    public void testToString() throws ParseException {
        System.out.println("toString");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("23/11/2015");
        OrdemServico instance = new OrdemServico(1, "teste", data, data);
        int id = 1;
        String expResult = "br.data.entity.OrdemServico[ id=" + id + " ]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
