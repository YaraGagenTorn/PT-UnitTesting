/*
 * MY TEST
 * 
 */
package packer;

import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import packer.Address;
import static packer.BoxTest.testCustomer0;
import packer.Coordinates;
import packer.Customer;
import packer.Depot;
import java.util.Map;

/**
 *
 * @author 90053232
 */

public class ManifestTest {

    //Test data
    static Product testProduct0 = new Product("Hammer", 3, false, false);
    static Product testProduct1 = new Product("Nails", 1, false, false);
    static Product testProduct2 = new Product("Ladder", 15, false, false);
    static Product testProduct3 = new Product("Light Bulbs", 1, false, true);
    static Product testProduct4 = new Product("Weedkiller", 2, true, false);
    static Product testProduct5 = new Product("VeryHeavyThing", 45, true, false);

    Manifest testManifest;
             
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Testing Manifest class...");
    }    
    
    @Before 
    public void setUpManifest() {
        System.out.println("Creating a new test manifest...");
        testManifest = new Manifest();
    }   

    /**
     * Test of addProduct method, of class Manifest.
     */
    
    @Test
    public void testAddProduct() {
        System.out.println("-------------------------");
        System.out.println("addProduct");
        testManifest.addProduct(testProduct0);
        testManifest.addProduct(testProduct1,2);
        testManifest.addProduct(testProduct2);
        Map<Product, Integer> testQuantities;
        testQuantities = new HashMap<>(); 
        testQuantities.put(testProduct0,1);
        testQuantities.put(testProduct1,2);
        testQuantities.put(testProduct2,1);
        //String testString = "Hammer x 1"+ "\n"+ "Nails x 2"+ "\n"+ "Ladder x 1";
        assertTrue(testQuantities.equals(testManifest));
        /*setUpManifest();
        testString = "";
        testManifest.addProduct(testProduct3,3);
        testManifest.addProduct(testProduct4,2);
        testManifest.addProduct(testProduct5,4);
        testString = "Weedkiller x 2" +"\n"+ "VeryHeavyThing x 4"+ "\n"+"Light Bulbs x 3";
        System.out.println(testManifest.toString());
        assertTrue(testString.equals(testManifest.toString()));*/
    }

    /**
     * Test of removeProduct method, of class Manifest.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("-------------------------");
        System.out.println("removeProduct");
        testManifest.addProduct(testProduct0);
        testManifest.addProduct(testProduct1,2);
        testManifest.addProduct(testProduct2);
        testManifest.removeProduct(testProduct0);
        String testString = "Nails x 2"+ "\n" + "Ladder x 1"; 
        assertTrue(testString.equals(testManifest.toString()));
    }

    /**
     * Test of getTotalWeight method, of class Manifest.
     */
    @Test
    public void testGetTotalWeight() {
        System.out.println("-------------------------");
        System.out.println("getTotalWeight");
        testManifest.addProduct(testProduct0);
        testManifest.addProduct(testProduct1,2);
        testManifest.addProduct(testProduct2);
        assertEquals(20, testManifest.getTotalWeight(),0);
        setUpManifest();
        testManifest.addProduct(testProduct1,3);
        testManifest.addProduct(testProduct3,5);
        testManifest.addProduct(testProduct4,2);
        assertEquals(12, testManifest.getTotalWeight(),0);
     }

    /**
     * Test of getHeaviestUnder method, of class Manifest.
     */
    @Test
    public void testGetHeaviestUnder() {
        System.out.println("-------------------------");
        System.out.println("getHeaviestUnder");
        testManifest.addProduct(testProduct0);
        testManifest.addProduct(testProduct1);
        testManifest.addProduct(testProduct2);
        String testResult = testManifest.getHeaviestUnder(5).toString();
        assertTrue(testResult.equals(testProduct0.toString()));
        testResult = testManifest.getHeaviestUnder(16).toString();
        assertTrue(testResult.equals(testProduct2.toString()));
        Product testResultProduct = testManifest.getHeaviestUnder(0.5);
        assertTrue (testResultProduct == null);
    }

    /**
     * Test of isEmpty method, of class Manifest.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("-------------------------");
        System.out.println("isEmpty");
        assertTrue(testManifest.isEmpty());
        testManifest.addProduct(testProduct0);
        assertFalse(testManifest.isEmpty());
    }

    /**
     * Test of containsProduct method, of class Manifest.
     */
    @Test
    public void testContainsProduct() {
        System.out.println("-------------------------");
        System.out.println("containsProduct");
        testManifest.addProduct(testProduct0);
        testManifest.addProduct(testProduct1);
        testManifest.addProduct(testProduct2);
        assertTrue(testManifest.containsProduct(testProduct0));
        assertFalse(testManifest.containsProduct(testProduct3));
    }

    /**
     * Test of toString method, of class Manifest.
     */
    @Test
    public void testToString() {
        System.out.println("-------------------------");
        System.out.println("toString");
        testManifest.addProduct(testProduct0);
        testManifest.addProduct(testProduct1);
        testManifest.addProduct(testProduct2);
        String testString ="Hammer x 1\n" + "Nails x 1\n" + "Ladder x 1";
        assertTrue (testString.equals(testManifest.toString()));
        testManifest.addProduct(testProduct3);
        testString = "Hammer x 1\n" + "Nails x 1\n" + "Ladder x 1\n" + "Light Bulbs x 1\n";
        assertTrue (testString.equals(testManifest.toString()));
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
