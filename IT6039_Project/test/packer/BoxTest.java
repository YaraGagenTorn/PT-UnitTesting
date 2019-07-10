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
    Coordinates testCoordinates0 = new Coordinates(0,0);
    Coordinates testCoordinates1 = new Coordinates(3,4);
    
    Address testAddress0 = new Address("111 Emerge Rd", "Really", "Inn Town", "D444", testCoordinates0);
    Address testAddress1 = new Address("1 First St", "Aplace", "Citadel City", "A111", testCoordinates1);
        
    Depot testDepot0 = new Depot("Test Depot", testAddress0);
    
    Customer testCustomer0 = new Customer("Test Customer 1", testAddress1);
    
    Manifest testContents0 = new Manifest();
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing Box class...");
    }    
    
    /**
     * Test of setCapacity method, of class Box.
     */
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int testCapacity0 = 20;
        int testCapacity1 = 30;
        Box testBox0 = new Box(testCustomer0,testDepot0, testContents0);
        testBox0.setCapacity(testCapacity0);
        testBox0.setCapacity(testCapacity1);
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
