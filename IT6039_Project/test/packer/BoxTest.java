/*
 * MY TEST
 * 
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
public class BoxTest {
    
    //Test data
    
    public BoxTest(String testName) {
        
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of setCapacity method, of class Box.
     */
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int thisBoxCapacity = 0;
        Box instance = null;
        instance.setCapacity(thisBoxCapacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIfHeavyCapacity method, of class Box.
     */
    public void testSetIfHeavyCapacity() {
        System.out.println("setIfHeavyCapacity");
        int thisHeavyCapacity = 0;
        Box instance = null;
        instance.setIfHeavyCapacity(thisHeavyCapacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class Box.
     */
    public void testAddProduct_Product() {
        System.out.println("addProduct");
        Product product = null;
        Box instance = null;
        instance.addProduct(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class Box.
     */
    public void testAddProduct_Product_int() {
        System.out.println("addProduct");
        Product product = null;
        int quantity = 0;
        Box instance = null;
        instance.addProduct(product, quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class Box.
     */
    public void testGetLabel() {
        System.out.println("getLabel");
        Box instance = null;
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Box.
     */
    public void testToString() {
        System.out.println("toString");
        Box instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Box.
     */
    public void testGetWeight() {
        System.out.println("getWeight");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canFit method, of class Box.
     */
    public void testCanFit_Product() {
        System.out.println("canFit");
        Product p = null;
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.canFit(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canFit method, of class Box.
     */
    public void testCanFit_Product_int() {
        System.out.println("canFit");
        Product p = null;
        int quantity = 0;
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.canFit(p, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remainingCapacity method, of class Box.
     */
    public void testRemainingCapacity() {
        System.out.println("remainingCapacity");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.remainingCapacity();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFragile method, of class Box.
     */
    public void testIsFragile() {
        System.out.println("isFragile");
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.isFragile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHazardous method, of class Box.
     */
    public void testIsHazardous() {
        System.out.println("isHazardous");
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.isHazardous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHeavy method, of class Box.
     */
    public void testIsHeavy() {
        System.out.println("isHeavy");
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.isHeavy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
