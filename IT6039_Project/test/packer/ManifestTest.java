/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import packer.Address;
import packer.Coordinates;
import packer.Customer;
import packer.Depot;

/**
 *
 * @author 90053232
 */
public class ManifestTest {
    
      
    
    protected void setUp() throws Exception {
    }
    
    protected void tearDown() throws Exception {
    }

    /**
     * Test of addProduct method, of class Manifest.
     */
    public void testAddProduct_Product() {
        System.out.println("addProduct");
        Product p = null;
        Manifest instance = new Manifest();
        instance.addProduct(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class Manifest.
     */
    public void testAddProduct_Product_int() {
        System.out.println("addProduct");
        Product p = null;
        int quantity = 0;
        Manifest instance = new Manifest();
        instance.addProduct(p, quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeProduct method, of class Manifest.
     */
    public void testRemoveProduct() {
        System.out.println("removeProduct");
        Product p = null;
        Manifest instance = new Manifest();
        instance.removeProduct(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalWeight method, of class Manifest.
     */
    public void testGetTotalWeight() {
        System.out.println("getTotalWeight");
        Manifest instance = new Manifest();
        double expResult = 0.0;
        double result = instance.getTotalWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeaviestUnder method, of class Manifest.
     */
    public void testGetHeaviestUnder() {
        System.out.println("getHeaviestUnder");
        double weight = 0.0;
        Manifest instance = new Manifest();
        Product expResult = null;
        Product result = instance.getHeaviestUnder(weight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Manifest.
     */
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Manifest instance = new Manifest();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsProduct method, of class Manifest.
     */
    public void testContainsProduct() {
        System.out.println("containsProduct");
        Product p = null;
        Manifest instance = new Manifest();
        boolean expResult = false;
        boolean result = instance.containsProduct(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Manifest.
     */
    public void testToString() {
        System.out.println("toString");
        Manifest instance = new Manifest();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasFragileItems method, of class Manifest.
     */
    public void testHasFragileItems() {
        System.out.println("hasFragileItems");
        Manifest instance = new Manifest();
        boolean expResult = false;
        boolean result = instance.hasFragileItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasHazardousItems method, of class Manifest.
     */
    public void testHasHazardousItems() {
        System.out.println("hasHazardousItems");
        Manifest instance = new Manifest();
        boolean expResult = false;
        boolean result = instance.hasHazardousItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
