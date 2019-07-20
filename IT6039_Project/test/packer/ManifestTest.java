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
import java.util.Set;

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
        
        String stringForTest = testManifest.toString();
        stringForTest = stringForTest.replace("Hammer x 1","");
        stringForTest = stringForTest.replace("Nails x 2","");
        stringForTest = stringForTest.replace("Ladder x 1","");
        stringForTest = stringForTest.replace("\n","");
        System.out.println(stringForTest);
        assertTrue(stringForTest.equals("")); 
     
    }

    /**
     * Test of removeProduct method, of class Manifest.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("removeProduct");
        testManifest.addProduct(testProduct0);
        testManifest.addProduct(testProduct1,2);
        testManifest.addProduct(testProduct2);
        testManifest.removeProduct(testProduct0);
        
        String stringForTest = testManifest.toString();
        //stringForTest = stringForTest.replace("Hammer x 1","");
        stringForTest = stringForTest.replace("Nails x 2","");
        stringForTest = stringForTest.replace("Ladder x 1","");
        stringForTest = stringForTest.replace("\n","");
        assertTrue(stringForTest.equals(""));
        
        stringForTest = testManifest.toString();
        stringForTest = stringForTest.replace("Nails x 2","");
        stringForTest = stringForTest.replace("\n","");
        assertFalse(stringForTest.equals(""));
    }

    /**
     * Test of getTotalWeight method, of class Manifest.
     */
    @Test
    public void testGetTotalWeight() {
        System.out.println("-------------------------");
        System.out.println("getTotalWeight");
        testManifest.addProduct(testProduct0);
        testManifest.addProduct(testProduct1);
        testManifest.addProduct(testProduct2);
        assertEquals(19, testManifest.getTotalWeight(),0);
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
        
       String stringForTest = testManifest.toString();
        stringForTest = stringForTest.replace("Hammer x 1","");
        stringForTest = stringForTest.replace("Nails x 1","");
        stringForTest = stringForTest.replace("Ladder x 1","");
        stringForTest = stringForTest.replace("\n","");
        assertTrue(stringForTest.equals(""));
        
    }

    /**
     * Test of hasFragileItems method, of class Manifest.
     */
    @Test
    public void testHasFragileItems() {
        System.out.println("-------------------------");
        System.out.println("hasFragileItems");
        testManifest.addProduct(testProduct0);
        testManifest.addProduct(testProduct1);
        testManifest.addProduct(testProduct3);
        assertTrue(testManifest.hasFragileItems());
        
        setUpManifest();
        testManifest.addProduct(testProduct0);
        testManifest.addProduct(testProduct1);
        assertFalse(testManifest.hasFragileItems());
    }

    /**
     * Test of hasHazardousItems method, of class Manifest.
     */
    @Test
    public void testHasHazardousItems() {
        System.out.println("-------------------------");
        System.out.println("hasHazardousItems");
        testManifest.addProduct(testProduct0);
        testManifest.addProduct(testProduct1);
        testManifest.addProduct(testProduct4);
        assertTrue(testManifest.hasHazardousItems());
        
        setUpManifest();
        testManifest.addProduct(testProduct0);
        testManifest.addProduct(testProduct1);
        assertFalse(testManifest.hasHazardousItems());
        
        setUpManifest();
        assertFalse(testManifest.hasHazardousItems());
    }
    
}
